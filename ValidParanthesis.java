import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidParanthesis {
    public static void main(String[] args){
//        String s="]";
//        String s="){";
//        String s="()";
        String s="()[]{";
//        String s="()[]{}";

        System.out.println(getResult(s));
    }
    private static boolean getResult(String s){
        int index=-1;
        boolean result=false;
        List<Character> chhh=new ArrayList<>();
        Map<Character,Character> ll=returnResult();
        if(s.length()==0){
            return true;
        }
        for(int i=0;i<s.length();i++){
            char chh=s.charAt(i);
            if(ll.containsKey(chh)){
                index++;
                chhh.add(chh);
            }else if(index >=0 && ll.get(chhh.get(index))==chh){
                chhh.remove(index);
                index--;
            }else {
                index=-2;
                break;
            }
        }
        if(index==-1){
            result=true;
        }
        return result;
    }
    private static Map<Character,Character> returnResult(){
        Map<Character,Character> list=new HashMap<>();
        list.put('(',')');
        list.put('{','}');
        list.put('[',']');
        return list;
    }
}
