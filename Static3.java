class Student {
    static String schoolName = "ABC School";
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name + ", School: " + schoolName);
    }
}

public class Static3 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        s1.display();
        s2.display();
    }
}
