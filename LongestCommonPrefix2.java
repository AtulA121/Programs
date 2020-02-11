public class LongestCommonPrefix2 {
    public static void main(String[] args){
//        String strs[]={"flower","flow","flight"};
//        String strs[]={"flower","flower","flower"};
        String strs[]={"aa","a"};
//        String strs[]={"dog","racecar","car"};
//        String strs[]={"a"};
        System.out.println(getResult(strs));
    }
    public static String getResult(String[] strs){
        int count=0;
        String result="";
        String longString="";
        String str=strs.length>0 ? strs[0] : "";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            result+=ch;
            if(returnResult(result,strs,i)){
                if(count<result.length()){
                    longString=result;
                    count=result.length();
                }
            }else {
                break;
            }
        }
        return longString;
    }
    private static boolean returnResult(String str,String[] newString,int index){
        boolean result=false;
        for (String s : newString) {
            if (index < s.length() && s.charAt(index) == str.charAt(index)) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}