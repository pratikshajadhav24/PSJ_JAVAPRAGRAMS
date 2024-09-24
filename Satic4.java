class Config {
    static int value;

    static {
        value = 100;
    }

    static void display() {
        System.out.println("Value: " + value);
    }
}

public class Satic4 {
    public static void main(String[] args) {
        Config.display();
    }
}
