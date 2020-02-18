import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class SerializationEx2 implements Serializable {
    int userName;
    String jsonObject;
    transient int password;
    static int pincode=411005;
    SerializationEx2(int userName,int password,String jsonObject){
        this.userName=userName;
        this.password=password;
        this.jsonObject=jsonObject;
    }
}

public class SerializationExample2 {
    public static void main(String[] args){
        try {
            JsonObject jsonObject=new JsonObject();
            jsonObject.addProperty("userName","atul pisal");
            String ss= new Gson().toJson(jsonObject);
            SerializationEx2 se = new SerializationEx2(1, 123456789,ss);

            JsonObject jsonObject2=new JsonObject();
            jsonObject2.addProperty("userName","a121 pisal");
            String ss2= new Gson().toJson(jsonObject2);
            SerializationEx2 se22 = new SerializationEx2(2, 123456789,ss2);

            List<SerializationEx2> list=new ArrayList<>();
            list.add(se);
            list.add(se22);

            FileOutputStream fileOutputStream = new FileOutputStream("./a.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            System.out.println("object before serialization : "+se.userName+" , "+se.password);

            FileInputStream fileInputStream = new FileInputStream("./a.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            List<SerializationEx2> se2=(List<SerializationEx2>)objectInputStream.readObject();
            for (SerializationEx2 seList : se2){
                JsonObject js=new Gson().fromJson(seList.jsonObject,JsonObject.class);
                System.out.println("object after serialization : "+seList.userName+" , "+seList.password+" , {userName : "+js.get("userName")+"}");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
