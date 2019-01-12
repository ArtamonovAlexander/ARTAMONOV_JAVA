public class Task15 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = -3;
        arr[1] = 4;
        System.out.print("Изначальный массив: ");
        for (int b : arr) { System.out.print(b); }

        // вставляем число в конец
        arr[2] = 5;
        System.out.print("\nВставили 5 вконец: ");
        for (int b : arr) { System.out.print(b); }

        // вставляем число в начало
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 1;
        System.out.print("\nВставили число 1 в начало: ");
        for (int b : arr) { System.out.print(b); }

        // удаление значения по индексу
        for (int i = 0; i < arr.length-1; i++) {
            if (i >= 2){
                arr[i] = arr[i+1];
            }
        }
        System.out.print("\nУдалили значение по индесу 2: " );
        for (int b : arr) { System.out.print(b); }

        // вставляем число по индексу
        for (int i = arr.length - 1; i > 2; i--) {
            arr[i] = arr[i - 1];
        }
        arr[2] = 7;
        System.out.print("\nВставили число по индесу 2: " );
        for (int b : arr) { System.out.print(b); }

    }
}
