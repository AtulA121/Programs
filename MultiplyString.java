import java.math.BigInteger;

public class MultiplyString {
    public static void main(String[] args){
        String num1="498828660196";
        String num2="840477629533";
        System.out.println(getResullt(num1,num2));
    }
    private static String getResullt(String num1,String num2){
        BigInteger b1=new BigInteger(num1);
        BigInteger b2=new BigInteger(num2);
        return b1.multiply(b2)+"";
    }
}
