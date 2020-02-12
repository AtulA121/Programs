
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args){
        int[] nums={};
//        int[] nums={1,1,2};
//        int[] nums={0,1,2,3,4,5};
//        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(getResult(nums));
    }
    private static int getResult(int[] nums){
        int temp=0;
        int result=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[temp]=nums[i];
                result++;
                temp++;
            }
        }
        if(nums.length>0) {
            nums[temp] = nums[nums.length - 1];
            result++;
        }
        return result;
    }
}
