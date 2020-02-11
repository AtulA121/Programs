public class StringToInteger {
    public static void main(String[] args){
//        String str="-91283472332";
        String str="+1";
        System.out.println(getResult(str));
    }
    private static int getResult(String str){
        long result=0;
        boolean sign=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='-'){
                sign=true;
            }else if(ch>=48 && ch<=57){
                result=result*10+Integer.parseInt(ch+"");
                if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE) {
                    return returnResult(sign);
                }
            }else if (ch=='+'){
                sign=false;
            }else if(ch!=' '){
                break;
            }
        }
        if (sign){
            result=-result;
        }
        return (int)result;
    }
    private static int returnResult(boolean sign){
        int result=0;
        if(sign){
            result=Integer.MIN_VALUE;
        }else{
            result=Integer.MAX_VALUE;
        }
        return result;
    }
}
