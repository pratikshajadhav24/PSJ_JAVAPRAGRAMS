
    import java.util.Scanner;

    public class Method7 {
    public static void main(String[] args) {
        getInput();
    }

    public static void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Square: " + square(n));
        scanner.close();
    }

    public static int square(int n) {
        return n * n;
    }
}


