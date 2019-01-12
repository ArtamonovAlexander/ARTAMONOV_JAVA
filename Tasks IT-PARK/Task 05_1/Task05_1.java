public class Task05 {
    public static void main(String[] args) {
        int array[] = {3, 5, 10, -1, 34, 50, 11};
        findMax(array, 0, 0);


public static void findMax(int[] array, int min, int max){
        for (int i = 0; i < array.length - 1; i++) {
            if (min > array[i + 1]) { min = array[i + 1]; }
            if (max < array[i + 1]) { max = array[i + 1]; }
    }
    System.out.println("Минимальное число = " + min + ", макс = " + max);
  }
}
