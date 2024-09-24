
    import java.util.Scanner;

    public class Method10 {
    public static void main(String[][] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Sum: " + add(a, b));
        scanner.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }
}


