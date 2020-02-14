import java.util.Arrays;

public class FirstMissingPositiveNumber {
    public static void main(String[] args){
//        int[] nums={1,2,0};
//        int[] nums={3,4,-1,1};
        int[] nums={0,2,2,1,1};
        System.out.println(getResullt(nums));
    }
    private static int getResullt(int[] nums){
        int temp=1;
        int result=1;
        boolean rs=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<1){
                continue;
            }
            if(nums[i]==nums[i+1]){
                continue;
            }else if(temp!=nums[i]){
                rs=true;
                result=temp;
                break;
            }
            temp++;
        }
        if(!rs){
            if(nums.length>0 && nums[nums.length-1]!=temp){
                result=temp;
            }else {
                result=++temp;
            }
        }
        return result;
    }
}