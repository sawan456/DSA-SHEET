public class reverseInt {
    // -------------REVERSE INTEGER IN ARRAY------------->>>>>

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int a_pointer = 0;
        int b_pointer = arr.length - 1;
        while (a_pointer < b_pointer) {
            int temp = arr[a_pointer];
            arr[a_pointer] = arr[b_pointer];
            arr[b_pointer] = temp;
            a_pointer++;
            b_pointer--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
