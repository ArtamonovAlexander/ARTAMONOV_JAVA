import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfIndex = 1;
        int sumOfNumbers = 0;
        int currentNumber;
        int position = 0;
        int x, y = 0;

        while ((currentNumber = scanner.nextInt()) != -1) {
            x = currentNumber % 10;
            y = currentNumber / 10;
            currentNumber = x + y;

            if (currentNumber == 2 || currentNumber == 3) {
                sumOfIndex *= position;
            }
            if (currentNumber >= 4) {
                int d = 0;
                for (int divider = 2; divider * divider <= currentNumber; divider++) {
                    if (currentNumber % divider == 0) {
                        d = 1;
                    }
                }
                if (d == 0) {
                    sumOfIndex *= position;
                }
            }
            position++;
        }
        System.out.println(sumOfIndex);
    }
}