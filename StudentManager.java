import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<StudentInfo> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void registerStudent(StudentInfo student) {
        studentList.add(student);
    }

    public boolean deleteStudent(int id) {
        return studentList.removeIf(s -> s.getStudentId() == id);
    }

    public StudentInfo findStudent(int id) {
        for (StudentInfo s : studentList) {
            if (s.getStudentId() == id) {
                return s;
            }
        }
        return null;
    }

    public List<StudentInfo> listAllStudents() {
        return studentList;
    }
}