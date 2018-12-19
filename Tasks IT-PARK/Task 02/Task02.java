public class Task02 {
    public static void main(String[] args) {
        int number = 137;
        int a0 = 137%2;
        int a1 = 137/2%2;

        int a3 = 137/2/2%2;
        int a4 = 137/2/2/2%2;
        int a5 = 137/2/2/2/2%2;
        int a6 = 137/2/2/2/2/2%2;
        int a7 = 137/2/2/2/2/2/2%2;
        int a8 = 137/2/2/2/2/2/2/2;
        System.out.println(""+ a8+a7+a6+a5+a4+a3+a1+a0);

    }
}
