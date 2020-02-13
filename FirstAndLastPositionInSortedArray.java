public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int target = 4;
        int[] nums = {1,4};
//        int[] nums = {7,7,8,8,8};
//        int[] nums={7,8,0,1,2,3,4,5,6};
        for(int i : getResult(nums, target)){
            System.out.print(i+" ");
        }
    }

    public static int[] getResult(int[] nums, int target) {
        int left = 0;
        int[] result = {-1,-1};
        int right = nums.length - 1;
        while (left <= right) {
            int mid=(left+right)/2;
            if(nums[mid]==target){
                for(int i=mid;i>0;i--){
                    if(nums[i]!=nums[i-1]){
                        result[0]=i;
                        break;
                    }
                }
                for(int i=mid;i<nums.length-1;i++){
                    if(nums[i]!=nums[i+1]){
                        result[1]=i;
                        break;
                    }
                }
                if(target==nums[nums.length-1]){
                    result[1]=nums.length-1;
                }
                if(target==nums[0]){
                    result[0]=0;
                }
                break;
            }else if(nums[mid]>=target){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return result;
    }
}
