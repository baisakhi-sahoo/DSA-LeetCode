package array;

public class PivotIndex {
    static void main() {
        int[] nums ={1, 7, 3, 6, 5, 6};
        System.out.println( pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int sum:nums){
            totalsum+=sum;
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}

