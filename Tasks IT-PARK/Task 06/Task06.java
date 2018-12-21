public class Task06 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int min;

        for (int i = 0; i < array.length / 2; i++) {
            min = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = min;
        }
    }
}
