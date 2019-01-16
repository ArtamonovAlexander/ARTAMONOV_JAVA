
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][] = new int[4][4];
        for (int i = 0; i < array.length; i++) {            //заполнение массива
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                if ((i + i) < (i + j)){
                    array[i][j] *= 2;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {            //вывод на экран
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


public class Task19 {
    public static void main(String[] args) {
        int array[][] = new int[4][4];
        int count = 0;
        for (int i = 0; i < array.length; i++) {            //заполнение массива
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count++;
            }
        }
        for (int i = 0; i < array.length; i++) {            //умножение на 2 всё что выше главной диагонали
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][i] < array[i][j]){
                    array[i][j] *= 2;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {            //вывод на экран
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

