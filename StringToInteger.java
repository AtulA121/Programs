public class StringToInteger {
    public static void main(String[] args){
        String str="   -231";
        System.out.println(getResult(str));
    }
    private static int getResult(String str){
        int result=0;
        boolean sign=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='-'){
                sign=true;
            }else if(ch>=48 && ch<=57){
                result=result*10+Integer.parseInt(ch+"");
            }
        }
        if (sign){
            result=-result;
        }
        return result;
    }
}
