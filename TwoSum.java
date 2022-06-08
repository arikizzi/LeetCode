import java.util.*;

public class TwoSum{
    public int[] twoSum(int[] nums, int target){
        int ans[] = new int[2];
        for(int i = 0; i<nums.length; i++){
            int x = nums[i];
            for(int j = i+1; j<nums.length; j++){
                int y = nums[j];
                if(x + y == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }   

    public static void main(String args[]){
        TwoSum obj = new TwoSum();
        int arr[] = {2, 7, 11, 15};
        int ans[] = obj.twoSum(arr, 9);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i] + "\t");
        }
    }
}