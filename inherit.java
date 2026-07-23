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

    // Method to calculate grade based on marks
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

public class inherit {
    public static void main(String[] args) {
        Student student = new Student("Pratham", "Sumeeth", 85);
        

        student.displayTeacher();
        student.displayStudent();
    }
}