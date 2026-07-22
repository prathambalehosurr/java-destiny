public class verb {

    static void display() {
        System.out.println("No parameters");
    }

    static void display(String name) {
        System.out.println("Name: " + name);
    }

    static void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        display();
        display("Pratham");
        display("Pratham", 21);
    }
} 
    

