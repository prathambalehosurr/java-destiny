class Teacher {
    String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public void displayTeacher() {
        System.out.println("Teacher: " + teacherName);
    }
}

class Student extends Teacher {
    String studentName;
    int marks;

    public Student(String teacherName, String studentName, int marks) {
        super(teacherName); 
        this.studentName = studentName;
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("Student: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}

class Principal extends Student {
    String principalName;

    public Principal(String teacherName, String studentName, int marks, String principalName) {
        super(teacherName, studentName, marks); 
        this.principalName = principalName;
    }

    public void displayPrincipal() {
        System.out.println("Principal: " + principalName);
    }
}

public class multi {
    public static void main(String[] args) {
        Principal principal = new Principal("Mr. Pratham", "Sumeeth", 85, "Dr. Sharma");

        principal.displayPrincipal(); 
        principal.displayTeacher();  
        principal.displayStudent();   
    }
}