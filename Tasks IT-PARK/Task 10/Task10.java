import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char text1[] = scanner.nextLine().toCharArray();
        char text2[] = scanner.nextLine().toCharArray();
        int value1 = 0;
        int value2 = 0;
        int index = 0;

        for (int i = 0; i < text1.length; i++) {
            if (text1[i] == text2[0]) {
                for (int j = 0; j < text2.length; j++) {
                    value1 += (int) text1[i + j];
                    value2 += (int) text2[j];
                }
                if (value1 == value2) {
                    System.out.println("Congratulations");
                    System.out.println("Вхождение второй строки в первую начинается с индекса " + i);
                    return;
                }
            }
        }

    }
}
