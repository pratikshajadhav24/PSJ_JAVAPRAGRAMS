public class Local5 {
    static void outerMethod() {
        int outerVar = 10;

        class Inner {
            void innerMethod() {
                int innerVar = 5;
                System.out.println("Outer: " + outerVar + ", Inner: " + innerVar);
            }
        }

        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        outerMethod();
    }
}
