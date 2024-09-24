
    import java.util.Scanner;

    public class Method1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}


