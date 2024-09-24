class Calculator {
    static int total = 0;

    void add(int num) {
        total += num;
    }

    void displayTotal() {
        System.out.println("Total: " + total);
    }
}

public class Static5 {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        calc1.add(10);
        calc2.add(20);
        calc1.displayTotal();
    }
}
