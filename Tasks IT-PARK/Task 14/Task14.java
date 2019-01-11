public class Task14 {
    public static double f(double x) {
        return x * x;
    }

    public static double integralByRectangles(double a, double b, int n) {
        double xi, h;
        double sum = 0;
        h = (b - a)/n;
        for (int i = 0; i < n; i++) {
            sum += h* f(a + h*(i + 0.5));
        }
        return sum;
    }

//    public static double integralBySimpson(double a, double b, int n) {   }
//
//    public static double integralByTrapeze(double a, double b, int n) {   }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int n = scanner.nextInt();
        System.out.println(integralByRectangles(a, b, n));
//        System.out.println(integralBySimpson(a, b, n));
//        System.out.println(integralByTrapeze(a, b, n));
    }
}