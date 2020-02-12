public class RemovePerticularFromArray {
    public static void main(String[] args){
        int val=3;
        int[] nums={3,2,2,3};
//        int[] nums={1,1,2};
//        int[] nums={0,1,2,3,4,5};
//        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(getResult(nums,val));
    }
    private static int getResult(int[] nums,int val){
        int temp=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[temp]=nums[i];
                temp++;
                result++;
            }
        }
        return result;
    }
}
