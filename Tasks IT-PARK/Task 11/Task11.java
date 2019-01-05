
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        int left = 0;
        int right = arr.length;
        int middle = left + (right - left) / 2;
        int index;

        System.out.println("�������� ������ �� 15 �����: ");
        for (int i = 0; i < arr.length; i++) {                            //���������� ������� � �������
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = arr.length - 1; i > 0; i--) {           //����������
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }

        System.out.print("������� ������� �����: ");
        int desiredNumber = Integer.parseInt(reader.readLine());

        while(desiredNumber != arr[middle]){                           //�������� �����
            if (desiredNumber > arr[middle]){
                left = middle;
                middle = left + (right - left) / 2;
            }
            else if(desiredNumber < arr[middle]){
                right = middle;
                middle = left + (right - left) / 2;
            }
        }

            System.out.println("���������� ����� "+arr[middle]+ "� ��������������� ������� " + middle);
    }
}
