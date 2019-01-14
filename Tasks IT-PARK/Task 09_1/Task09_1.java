public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char text[] = scanner.nextLine().toCharArray();
        System.out.println(charDigit(text, 0));

    }

    public static int charDigit(char[] text, int result) {
        for (int i = 0; i < text.length; i++) {
            int digit = (int) text[i] - '0';
            result = result * 10 + digit;
        }
        return result;
    }
}