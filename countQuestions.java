public class countQuestions {

    // ==============================================
    // ......................................all count 4=1,3=2,2=2,7=1,8=1,1=1
    // ............................................ print duplicate 3,2
    // .......................................print non duplicate 4,7,8,1
    // ===============================================

    // --------------------------------------------------------------

    // Arrays.sort(arr);
    // for (int i = 0; i < arr.length; i++) {
    // int count = 1;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // count++;
    // } else {
    // break;
    // }
    // }
    // System.out.println(arr[i] + "->" + count);
    // i += (count - 1);
    // }
    // System.out.println();

    // ====================================================

    // Arrays.sort(arr);
    // for (int i = 0; i < arr.length; i++) {
    // int count = 1;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // count++;
    // } else {
    // break;
    // }
    // }
    // if (count > 1) {
    // System.out.print(arr[i] + " ");
    // i += (count - 1);
    // }
    // }
    // System.out.println();

    // int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
    // 1,2,2,3,3,4,7,8
    // Arrays.sort(arr);
    // for (int i = 0; i < arr.length; i++) {
    // int count = 0;
    // for (int j = 0; j < arr.length; j++) {
    // if (arr[i] == arr[j]) {
    // count++;
    // }
    // if (count == 1) {
    // System.out.println(arr[i] + " ");
    // // i += (count - 1);
    // }
    // }

    // }

    // ----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // 4,7,8,1
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(arr[i] + " ");
                i += (count - 1);
            }
        }
        System.out.println();
    }
}
