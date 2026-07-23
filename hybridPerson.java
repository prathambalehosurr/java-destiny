class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
    }
}

interface Teacher {
    void teach();
}

interface Student {
    void study();
}

class Hybrid extends Person implements Teacher, Student {
    public Hybrid(String name) {
        super(name);
    }

    @Override
    public void teach() {
        System.out.println(name + " is teaching.");
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }
}

public class hybridPerson {
    public static void main(String[] args) {
        Hybrid hybridPerson = new Hybrid("Alex");

        hybridPerson.displayPerson();
        hybridPerson.teach();
        hybridPerson.study();
    }
}