class Person {
    String name;

    // Constructor with object reference
    Person(Person p) {
        name = p.name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Person p1 = new Person(new Person("Alice"));
        p1.display();
    }
}

