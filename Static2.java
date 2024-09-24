class Example {
    static int number = 0;

    static void increment() {
        number++;
    }

    static void display() {
        System.out.println("Number: " + number);
    }
}

public class Static2 {
    public static void main(String[] args) {
        Example.increment();
        Example.increment();
        Example.display();
    }
}
