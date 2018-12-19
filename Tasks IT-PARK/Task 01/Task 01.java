public class Task01 {
    public static void main(String[] args) {
        int sum = 15867;
        System.out.println("5000 - " + sum/5000);
        System.out.println("2000 - " + sum%5000/2000);
        System.out.println("1000 - " + sum%5000/1000);
        System.out.println("500 - " + sum%5000/500);
        System.out.println("200 - " + sum%5000%500/200);
        System.out.println("100 - " + sum%5000%500%200/100);
        System.out.println("50 - " + sum%5000%500%200%100/50);
        System.out.println("10 - " + sum%5000%500%200%100%50/10);
        System.out.println("5 - " + sum%5000%500%200%100%50%10/5);
        System.out.println("2 - " + sum%5000%500%200%100%50%10%5/2);
        System.out.println("1 - " + sum%5000%500%200%100%50%10%5%2/1);
    }
}
