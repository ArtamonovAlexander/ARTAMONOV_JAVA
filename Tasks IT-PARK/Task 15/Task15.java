public class Task15 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = -3;
        arr[1] = 4;
        System.out.print("����������� ������: ");
        for (int b : arr) { System.out.print(b); }

        // ��������� ����� � �����
        arr[2] = 5;
        System.out.print("\n�������� 5 ������: ");
        for (int b : arr) { System.out.print(b); }

        // ��������� ����� � ������
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 1;
        System.out.print("\n�������� ����� 1 � ������: ");
        for (int b : arr) { System.out.print(b); }

        // �������� �������� �� �������
        for (int i = 0; i < arr.length-1; i++) {
            if (i >= 2){
                arr[i] = arr[i+1];
            }
        }
        System.out.print("\n������� �������� �� ������ 2: " );
        for (int b : arr) { System.out.print(b); }

        // ��������� ����� �� �������
        for (int i = arr.length - 1; i > 2; i--) {
            arr[i] = arr[i - 1];
        }
        arr[2] = 7;
        System.out.print("\n�������� ����� �� ������ 2: " );
        for (int b : arr) { System.out.print(b); }

    }
}
