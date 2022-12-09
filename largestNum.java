public class largestNum {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 3, 56, 32 };
        // taking one variable
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("largest element is: " + max);
        System.out.println();
    }
}
