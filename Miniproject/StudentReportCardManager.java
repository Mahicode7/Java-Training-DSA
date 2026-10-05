package miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentReportCardManager {

    // Student class
    static class Student {
        int rollNo;
        String name;
        int maths;
        int java;
        int science;

        Student(int rollNo, String name, int maths, int java, int science) {
            this.rollNo = rollNo;
            this.name = name;
            this.maths = maths;
            this.java = java;
            this.science = science;
        }

        int total() {
            return maths + java + science;
        }

        double percentage() {
            return total() / 3.0;
        }

        String grade() {
            if (maths < 35 || java < 35 || science < 35)
                return "F";
            else if (percentage() >= 90)
                return "A+";
            else if (percentage() >= 80)
                return "A";
            else if (percentage() >= 70)
                return "B";
            else if (percentage() >= 60)
                return "C";
            else
                return "D";
        }
    }

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Find student
    static Student findStudent(int rollNo) {
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                return s;
            }
        }
        return null;
    }

    // Get valid marks
    static int getMark(String subject) {
        while (true) {
            System.out.print("Enter " + subject + " marks (0-100): ");
            int mark = sc.nextInt();

            if (mark >= 0 && mark <= 100) {
                return mark;
            }

            System.out.println("Invalid marks! Enter between 0 and 100.");
        }
    }

    // Add student
    static void addStudent() {

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        if (findStudent(rollNo) != null) {
            System.out.println("Roll number already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        if (name.trim().isEmpty()) {
            System.out.println("Name cannot be empty!");
            return;
        }

        int maths = getMark("Maths");
        int java = getMark("Java");
        int science = getMark("Science");

        students.add(new Student(rollNo, name, maths, java, science));

        System.out.println("Student added successfully!");
    }

    // View students
    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\n----- STUDENT REPORT -----");

        for (Student s : students) {

            System.out.println("Roll No     : " + s.rollNo);
            System.out.println("Name        : " + s.name);
            System.out.println("Maths       : " + s.maths);
            System.out.println("Java        : " + s.java);
            System.out.println("Science     : " + s.science);
            System.out.println("Total       : " + s.total());
            System.out.printf("Percentage  : %.2f%%\n", s.percentage());
            System.out.println("Grade       : " + s.grade());
            System.out.println("---------------------------");
        }
    }

    // Search student
    static void searchStudent() {

        System.out.print("Enter Roll Number to search: ");
        int rollNo = sc.nextInt();

        Student s = findStudent(rollNo);

        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.println("\nStudent Found");
        System.out.println("Roll No    : " + s.rollNo);
        System.out.println("Name       : " + s.name);
        System.out.println("Maths      : " + s.maths);
        System.out.println("Java       : " + s.java);
        System.out.println("Science    : " + s.science);
        System.out.println("Total      : " + s.total());
        System.out.printf("Percentage : %.2f%%\n", s.percentage());
        System.out.println("Grade      : " + s.grade());
    }

    // Update student
    static void updateStudent() {

        System.out.print("Enter Roll Number to update: ");
        int rollNo = sc.nextInt();

        Student s = findStudent(rollNo);

        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter new name: ");
        s.name = sc.nextLine();

        s.maths = getMark("Maths");
        s.java = getMark("Java");
        s.science = getMark("Science");

        System.out.println("Student updated successfully!");
    }

    // Delete student
    static void deleteStudent() {

        System.out.print("Enter Roll Number to delete: ");
        int rollNo = sc.nextInt();

        Student s = findStudent(rollNo);

        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        students.remove(s);

        System.out.println("Student deleted successfully!");
    }

    // Find topper
    static void findTopper() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student topper = students.get(0);

        for (Student s : students) {
            if (s.total() > topper.total()) {
                topper = s;
            }
        }

        System.out.println("\n----- TOPPER -----");
        System.out.println("Roll No : " + topper.rollNo);
        System.out.println("Name    : " + topper.name);
        System.out.println("Total   : " + topper.total());
        System.out.printf("Percentage : %.2f%%\n", topper.percentage());
        System.out.println("Grade   : " + topper.grade());
    }

    // Rank list
    static void rankList() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        ArrayList<Student> sorted = new ArrayList<>(students);

        for (int i = 0; i < sorted.size() - 1; i++) {

            for (int j = i + 1; j < sorted.size(); j++) {

                if (sorted.get(i).total() < sorted.get(j).total()) {

                    Student temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }

        System.out.println("\n----- RANK LIST -----");

        int rank = 1;

        for (Student s : sorted) {

            System.out.println(
                    rank + ". " +
                    s.name +
                    " - Total: " +
                    s.total() +
                    " - Percentage: " +
                    String.format("%.2f", s.percentage()) +
                    "% - Grade: " +
                    s.grade()
            );

            rank++;
        }
    }

    // Grade summary
    static void gradeSummary() {

        int aPlus = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        for (Student s : students) {

            switch (s.grade()) {

                case "A+":
                    aPlus++;
                    break;

                case "A":
                    a++;
                    break;

                case "B":
                    b++;
                    break;

                case "C":
                    c++;
                    break;

                case "D":
                    d++;
                    break;

                case "F":
                    f++;
                    break;
            }
        }

        System.out.println("\n----- GRADE SUMMARY -----");
        System.out.println("A+ : " + aPlus);
        System.out.println("A  : " + a);
        System.out.println("B  : " + b);
        System.out.println("C  : " + c);
        System.out.println("D  : " + d);
        System.out.println("F  : " + f);
    }

    // Subject topper
    static void subjectTopper() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        Student mathsTopper = students.get(0);
        Student javaTopper = students.get(0);
        Student scienceTopper = students.get(0);

        for (Student s : students) {

            if (s.maths > mathsTopper.maths) {
                mathsTopper = s;
            }

            if (s.java > javaTopper.java) {
                javaTopper = s;
            }

            if (s.science > scienceTopper.science) {
                scienceTopper = s;
            }
        }

        System.out.println("\n----- SUBJECT TOPPERS -----");

        System.out.println(
                "Maths   : " +
                mathsTopper.name +
                " (" +
                mathsTopper.maths +
                ")"
        );

        System.out.println(
                "Java    : " +
                javaTopper.name +
                " (" +
                javaTopper.java +
                ")"
        );

        System.out.println(
                "Science : " +
                scienceTopper.name +
                " (" +
                scienceTopper.science +
                ")"
        );
    }

    // Main method
    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=================================");
            System.out.println("   STUDENT REPORT CARD MANAGER");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Find Topper");
            System.out.println("7. Rank List");
            System.out.println("8. Grade Summary");
            System.out.println("9. Subject Toppers");
            System.out.println("10. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    findTopper();
                    break;

                case 7:
                    rankList();
                    break;

                case 8:
                    gradeSummary();
                    break;

                case 9:
                    subjectTopper();
                    break;

                case 10:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
