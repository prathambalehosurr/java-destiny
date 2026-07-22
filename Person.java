class Student {
    String name;
    int age;
    String gender;
    double marks;

    Student(String name, int age, String gender, double marks) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Marks  : " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Pratham", 22, "Male", 89.5);
        Student s2 = new Student("varun", 19, "Male", 92.0);
         
        s1.display();
        System.out.println();
        s2.display();
    }
}