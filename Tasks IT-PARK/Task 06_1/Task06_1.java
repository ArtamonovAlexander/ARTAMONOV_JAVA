public class Task06_1 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        redirect(array, 0);
        for (int b:array) {
            System.out.print(b);
        }
//        int min;
//
//        for (int i = 0; i < array.length / 2; i++) {
//            min = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = min;
//        }
    }

    public static int redirect(int[] array, int index) {
        if (array.length > index) {
            redirect(array, index + 1);
            if (array.length/2 > index) return array[index];
            int tmp = array[array.length - index - 1];
            array[array.length - index - 1] = array[index];
            array[index] = tmp;
            return array[0];
        }
        else return array[index-1];
    }
}