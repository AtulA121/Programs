public class ReverseDigit {
    public static void main(String[] args){
        int x=-131;
        System.out.println(getResult(x));
    }
    private static int getResult(int x){
        int result=0;
        while (x != 0){
            result=result*10+x%10;
            x=x/10;
        }
        if(result>Integer.MAX_VALUE/10 || result<Integer.MIN_VALUE/10){
            result=0;
        }
        return result;
    }
}
