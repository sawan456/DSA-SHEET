public class secondLargestNum {
    public static void main(String[] args) {
        // int[] arr = { 10, 20, 3, 56, 32 };
        // unsorted array
        int[] arr = { 1, 9, 5, 55, 8, -1, 3, 55 };
        int n = arr.length;
        // taking two variable
        int highest = Integer.MIN_VALUE; // -1
        int secondHighest = Integer.MIN_VALUE; // -1
        // Traversing an array
        for (int i = 0; i < n; i++) {
            if (arr[i] > highest) {
                // -----logic----
                // arr[i]=10 , highest = 6 , secondHighest = 2;
                // arr[i] = 17 ,highest = 10 , secondHighest = 6;
                // arr[i] = 11 ,highest = 17 , secondHighest = 10;
                // arr[i] = 11 ,highest = 17 , secondHighest = 13;

                secondHighest = highest;

                highest = arr[i];

            }
            if (arr[i] < highest && arr[i] > secondHighest) {

                secondHighest = arr[i];
            }
        }
        System.out.println("Second Highest Number is: " + secondHighest);
    }
}

///// -------------------

// public static void main(String[] args) {
// int[] arr = { 5, 8, 12, 7, 6, 2, 4, 10, 21, 33 };
// // -1 1 3 5 8 9 55 55
// // find the 2nd largest number
// int k = 3;
// for (int i = 0; i < arr.length; i++) {
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[i] > arr[j]) {
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;
// }
// }
// if (i == k - 1) {
// System.out.println(k + arr[i] + " ");
// break;
// }
// }
// }
