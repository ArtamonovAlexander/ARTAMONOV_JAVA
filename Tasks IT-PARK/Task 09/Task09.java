import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char text[] = scanner.nextLine().toCharArray();
        int result = 0;
        int digit = 0;
        for (int i = 0; i < text.length; i++) {
            digit = (int) text[i] - '0';
            result = result * 10 + digit;
        }
        System.out.println(result);
    }
}