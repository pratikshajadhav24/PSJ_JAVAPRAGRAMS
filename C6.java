class Employee {
    String name;
    int id;

    // Parameterized Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Bob", 101);
        e1.display();
    }
}

