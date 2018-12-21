import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int sumNumber = 0;

        for (int i = 1; i < 9; i++) {
            number = scanner.nextInt();
            sum += number;

        }
        for (int i = 1; i < 10; i++) {

            sumNumber += i;
        }

        System.out.println("Число, которое не ввели = " + (sumNumber - sum));
    }
}