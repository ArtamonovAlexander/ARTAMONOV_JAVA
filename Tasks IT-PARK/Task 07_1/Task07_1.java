public class Task07_1 {
    public static void main(String[] args) {
        int array[] = {7, 5, 10, -1, 34, 50, 11};
        System.out.println(localMax(array, 0));

//        int k = 0;
//        for (int i = 1; i < array.length - 1; i++) {
//            if (i == 1) {
//                if (array[0] > array[1]) {
//                    k++;
//                }
//            }
//            if (i == array.length) {
//                if (array[array.length - 1] > array[array.length - 2]) {
//                    k++;
//                }
//            }
//            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
//                k++;
//            }
//        }
//        System.out.println(k);
    }

    public static int localMax(int[] array, int k) {
        for (int i = 1; i < array.length - 1; i++) {
            if (i == 1) {
                if (array[0] > array[1]) {
                    k++;
                }
            }
            if (i == array.length) {
                if (array[array.length - 1] > array[array.length - 2]) {
                    k++;
                }
            }
            if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                k++;
            }
        }
        return k;
    }

}
