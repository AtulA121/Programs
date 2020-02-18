import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.*;

class SerializationEx implements Serializable {
    int userName;
    String jsonObject;
    transient int password;
    static int pincode=411005;
    SerializationEx(int userName,int password,String jsonObject){
        this.userName=userName;
        this.password=password;
        this.jsonObject=jsonObject;
    }
}

public class SerializationExample {
    public static void main(String[] args){
        try {
            JsonObject jsonObject=new JsonObject();
            jsonObject.addProperty("userName","atul pisal");
            String ss= new Gson().toJson(jsonObject);
            SerializationEx se = new SerializationEx(1, 123456789,ss);
            FileOutputStream fileOutputStream = new FileOutputStream("./a.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(se);
            objectOutputStream.close();
            System.out.println("object before serialization : "+se.userName+" , "+se.password);

            FileInputStream fileInputStream = new FileInputStream("./a.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            SerializationEx se2=(SerializationEx)objectInputStream.readObject();
            JsonObject js=new Gson().fromJson(se2.jsonObject,JsonObject.class);
            System.out.println("object after serialization : "+se2.userName+" , "+se2.password+" , {userName : "+js.get("userName")+"}");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
