public class CheckArraySortRotated {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int count = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
        }
        if (nums[n - 1] > nums[0])
            count++;
        return;
        // System.out.print(arr[i]+" ");
    }
}
