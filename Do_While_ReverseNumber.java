
    import java.util.Scanner;

    public class Do_While_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;
        do {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        } while (num != 0);
        System.out.println("Reversed: " + reversed);
        scanner.close();
    }
}


