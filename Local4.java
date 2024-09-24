class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void greet() {
        String greeting = "Hello, " + name;
        System.out.println(greeting);
    }
}

public class Local4 {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.greet();
    }
}
