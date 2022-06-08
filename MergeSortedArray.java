import java.util.*;

public class MergeSortedArray{
    public void merge(int[] nums1, int[] nums2, int m, int n){
        for(int i = 0; i < n; i++){
            nums1[m+i] = nums2[i];
        }

        int min;
        int temp = 0, index = 0;

        for(int i = 0; i<m+n; i++){
            min = nums1[i];
            index = i;
            for(int j = i+1; j<m+n; j++){
                if(nums1[j] < min){
                    min = nums1[j];
                    index = j;
                }
            }
            temp = nums1[index];
            nums1[index] = nums1[i];
            nums1[i] = temp;
        }        
        for(int i = 0; i< m+n; i++){
            System.out.println(nums1[i] + "\t");
        }
    }
    public static void main(String args[]){
        MergeSortedArray obj = new MergeSortedArray();
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};        
        obj.merge(nums1, nums2, 3, 3);        
    }
}