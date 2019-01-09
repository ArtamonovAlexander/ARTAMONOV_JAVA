public class Task07 {
    public static void main(String[] args) {
        int array[] = {7, 5, 10, -1, 34, 50, 11};
        localMax(array, 0, 0);

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

    public static int[] localMax(int[] array, int index, int k) {

        if (array.length > index) {
            localMax(array, index + 1, k);
        }
        if (index == 0) {
            if (array[0] > array[1]) {
                k++;
                System.out.println(k);
            }
        }
        if (index == array.length) {
            if (array[array.length - 1] > array[array.length - 2]) {
                k++;
                System.out.println(k);
            }
        }
        if ((index - 3) <= 0) return array;
        if (array[index - 1] < array[index - 2] && array[index - 2] > array[index - 3]) {
            k++;
            System.out.println(k);
        }

        return array;
    }

}