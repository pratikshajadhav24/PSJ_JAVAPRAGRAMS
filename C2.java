class Person {
    String name;

    // Parameterized Constructor
    Person(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.display();
    }
}

