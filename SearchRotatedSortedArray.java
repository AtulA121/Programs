class SearchRotatedSortedArray {
    public static void main(String[] args){
        int target=0;
        int[] nums={4,5,6,7,8,0,1,2};
//        int[] nums={7,8,0,1,2,3,4,5,6};
        System.out.println(getResult(nums,target));
    }
    public static int getResult(int[] nums, int target) {
        int left=0;
        int result=-1;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<=nums[right]){
                if(target>=nums[mid] && target<=nums[right]){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }else {
                if(target>=nums[left] && target<=nums[mid]){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }
        }
        return result;
    }
}