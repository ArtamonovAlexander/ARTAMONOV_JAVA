public class Task08 {
    public static void main(String[] args) {
        int array[] = {7, 5, 10, -1, 34, 50, 11};


        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
        }
     }
}