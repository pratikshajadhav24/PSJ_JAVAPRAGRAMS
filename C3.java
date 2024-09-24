class Rectangle {
    int length, width;

    // Default Constructor
    Rectangle() {
        length = 10;
        width = 5;
    }

    // Parameterized Constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(15, 7);
        rect1.area();
        rect2.area();
    }
}

