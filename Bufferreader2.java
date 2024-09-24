
    import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferreader2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(reader.readLine());
            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(reader.readLine());
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


