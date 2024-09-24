import java.util.Scanner;

public class Do_While_CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
            if (number >= 0) {
                int count = 0;
                do {
                    count++;
                    number /= 10;
                } while (number != 0);
                System.out.println("Number of digits: " + count);
            }
        } while (number < 0);
        scanner.close();
    }
}
