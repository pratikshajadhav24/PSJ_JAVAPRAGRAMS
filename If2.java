import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        }
        if (score >= 80 && score < 90) {
            System.out.println("Grade: B");
        }
        if (score >= 70 && score < 80) {
            System.out.println("Grade: C");
        }
        if (score >= 60 && score < 70) {
            System.out.println("Grade: D");
        }
        if (score < 60) {
            System.out.println("Grade: F");
        }
    }
}

