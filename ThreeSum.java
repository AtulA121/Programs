import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args){
        int[] nums={-1, 0, 1, 2, -1, -4};
        for (List<Integer> list : getResult(nums)){
            System.out.println(list);
        }
    }
    private static List<List<Integer>> getResult(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> set=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                int sum=nums[i]+nums[j];
                int temp=nums.length-1;
                if(-sum > nums[nums.length-1] || -sum < nums[j]){
                    continue;
                }
                for(int k=j+1;k<=temp;) {
                    int middle=(k+temp)/2;
                    int number=nums[middle];
                    if(-sum <= number){
                        if(-sum == number){
                            List<Integer> lll=new ArrayList<>();
                            lll.add(nums[i]);
                            lll.add(nums[j]);
                            lll.add(number);
                            if(!set.contains(lll)){
                                set.add(lll);
                            }
                            break;
                        }else{
                            temp=middle-1;
                        }
                    }else{
                        k=middle+1;
                    }
                }
            }
        }
        return set;
    }
}
