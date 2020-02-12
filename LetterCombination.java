import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args){
//        String digits="23";
//        String digits="8";
//        String digits="2";
//        String digits="79";
        String digits="56";
        for (String s : getResult(digits)){
            System.out.print(s+"  ");
        }
    }
    private static List<String> getResult(String digits){
        List<String> list=new ArrayList<>();
        int[] arr=returnResult(digits);
        boolean tttt=false;
        for(int i=0;i<=arr.length-1;i++){
            String str1=getString(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                tttt=true;
                String str2=getString(arr[j]);
                for(int k=0;k<str1.length();k++){
                    for(int l=0;l<str2.length();l++){
                        String ssss=str1.charAt(k)+""+str2.charAt(l);
                        list.add(ssss);
                    }
                }
            }
            if(!tttt){
                for(int j=0;j<str1.length();j++){
                    list.add(str1.charAt(j)+"");
                }
            }
        }
        return list;
    }
    private static int[] returnResult(String digits){
        int n= !digits.equals("") ? Integer.parseInt(digits) : 0;
        int[] arr=new int[digits.length()];
        int temp=arr.length-1;
        while(n!=0){
            int rem=n%10;
            arr[temp--]=rem;
            n=n/10;
        }
        return arr;
    }
    private static String getString(int n){
        int tt=3;
        int temp=(n*3)-6;
        StringBuilder s= new StringBuilder();
        if(n==7 || n==9){
            if(n==9){
                temp=(n*3)-6+1;
            }
            tt++;
        }
        if(n==8){
            temp=(n*3)-6+1;
        }
        for(int i=0;i<tt;i++){
            char ch=(char) (65 + temp + i);
            s.append(ch);
        }
        return s.toString().toLowerCase();
    }
}
