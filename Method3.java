
    import java.util.Scanner;

    public class Method3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(max(a, b, c));
        scanner.close();
    }

    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}


