public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        // time complexity = O(N^2)
        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) { // n-1
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
