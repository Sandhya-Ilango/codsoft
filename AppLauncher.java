import java.util.List;
import java.util.Scanner;

public class AppLauncher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        boolean running = true;

        while (running) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Register Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. View All Students");
            System.out.println("5. Exit Program");
            System.out.print("Select option: ");

            int option = input.nextInt();
            input.nextLine(); // Clear newline

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = input.nextInt();
                    input.nextLine(); // Clear newline
                    System.out.print("Enter student grade: ");
                    String grade = input.nextLine();

                    StudentInfo student = new StudentInfo(name, id, grade);
                    manager.registerStudent(student);
                    System.out.println("Student successfully registered.");
                    break;

                case 2:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = input.nextInt();
                    boolean isDeleted = manager.deleteStudent(deleteId);
                    System.out.println(isDeleted ? "Student deleted." : "Student not found.");
                    break;

                case 3:
                    System.out.print("Enter student ID to search: ");
                    int searchId = input.nextInt();
                    StudentInfo foundStudent = manager.findStudent(searchId);
                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    List<StudentInfo> allStudents = manager.listAllStudents();
                    if (allStudents.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("List of all students:");
                        for (StudentInfo s : allStudents) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        input.close();
    }
}