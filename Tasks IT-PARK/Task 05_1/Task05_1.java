public class Task05_1 {
    public static void main(String[] args) {
        int array[] = {3, 5, 10, -1, 34, 50, 11};
        System.out.println(findMax(array, 0));

//        int min = array[0];
//        int max = array[0];
//
//        for (int i = 0; i < array.length - 1; i++) {
//            if (min > array[i + 1]) { min = array[i + 1]; }
//            if (max < array[i + 1]) { max = array[i + 1]; }
//      System.out.println("Минимальное число = " + min + ", макс = " + max);
    }
    public static int findMax(int[] array, int max) {
        if (array.length > max) {
            int next = findMax(array, max + 1);
            return (array[max] > next) ? array[max] : next;
        } else {
            return array[0];
        }
    }
}