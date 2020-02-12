public class ImplementStrStr {
    public static void main(String[] args){
//        String hystack="mississippi";
//        String needle="issip";
//        String hystack="hello";
//        String needle="ll";
        String hystack="";
        String needle="";
        System.out.println(getResult(hystack,needle));
    }
    private static int getResult(String haystack, String needle){
        int temp=0;
        int fmatch=0;
        String output="";
        boolean firstMatching=true;
        for(int i=fmatch;i<haystack.length();i++){
            if(temp<needle.length() && haystack.charAt(i)==needle.charAt(temp)) {
                output+=needle.charAt(temp);
                temp++;
                if (firstMatching){
                    fmatch = i;
                    firstMatching=false;
                }
            }else{
                if(output.equals(needle)){
                    break;
                }
                i=fmatch++;
                temp=0;
                output="";
                firstMatching=true;
            }
        }
        if(!output.equals(needle)){
            fmatch=-1;
        }
        return fmatch;
    }
}
