class Person {
    String name;

    // Default Constructor
    Person() {
        name = "Unknown";
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.display();
    }
}

