public class Task12 {
    public static void main(String[] args) {

        int n = 10;
        int[] arr = new int[11];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[n]);
    }
}