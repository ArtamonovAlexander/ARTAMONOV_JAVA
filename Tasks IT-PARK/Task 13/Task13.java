public class Task13 {
    public static void main(String[] args) {
        System.out.print("1");                  //как-то так пока....)
        number(203);
    }

    public static int number(int n) {
        if (n == 1) {
            return n;
        } else {
             number(n / 2);
            int x = n % 2;
            System.out.print(x);
            return n;
        }
    }
}