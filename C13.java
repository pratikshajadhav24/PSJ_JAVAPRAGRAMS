abstract class Shape {
    Shape() {
        System.out.println("Shape Constructor");
    }

    abstract void draw();
}

class Circle extends Shape {
    Circle() {
        System.out.println("Circle Constructor");
    }

    void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}

