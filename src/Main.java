import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    addStudent(students, sc);
                    break;

                case 2:
                    viewStudents(students);
                    break;

                case 3:
                    searchStudent(students, sc);
                    break;

                case 4:
                    deleteStudent(students, sc);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }

        }

    }
    public static void addStudent(ArrayList<Student> students, Scanner sc) {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        boolean idExists = false;

        for (Student s : students) {
            if (s.getId() == id) {
                idExists = true;
                break;
            }
        }

        if (idExists) {
            System.out.println("Student ID already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int age;

        while (true) {
            System.out.print("Enter Student Age: ");
            age = sc.nextInt();

            if (age >= 5 && age <= 100) {
                break;
            }

            System.out.println("Age must be between 5 and 100!");
        }

        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        double marks;

        while (true) {
            System.out.print("Enter Marks: ");
            marks = sc.nextDouble();

            if (marks >= 0 && marks <= 100) {
                break;
            }

            System.out.println("Marks must be between 0 and 100!");
        }

        Student student = new Student(id, name, age, course, marks);

        students.add(student);

        System.out.println("Student added successfully!");
    }
    public static void viewStudents(ArrayList<Student> students) {

        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {

            for (Student s : students) {

                System.out.println("ID: " + s.getId());
                System.out.println("Name: " + s.getName());
                System.out.println("Age: " + s.getAge());
                System.out.println("Course: " + s.getCourse());
                System.out.println("Marks: " + s.getMarks());
                System.out.println("----------------------");
            }
        }
    }
    public static void searchStudent(ArrayList<Student> students, Scanner sc) {

        System.out.print("Enter Student ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Student s : students) {

            if (s.getId() == searchId) {

                found = true;

                System.out.println("Student Found!");
                System.out.println("ID: " + s.getId());
                System.out.println("Name: " + s.getName());
                System.out.println("Age: " + s.getAge());
                System.out.println("Course: " + s.getCourse());
                System.out.println("Marks: " + s.getMarks());

                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
    public static void deleteStudent(ArrayList<Student> students, Scanner sc) {

        System.out.print("Enter Student ID to Delete: ");
        int deleteId = sc.nextInt();

        boolean found = false;

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {

            Student s = iterator.next();

            if (s.getId() == deleteId) {

                iterator.remove();

                found = true;

                System.out.println("Student deleted successfully!");

                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }
}
