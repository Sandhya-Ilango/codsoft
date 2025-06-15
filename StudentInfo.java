public class StudentInfo {
    private String studentName;
    private int studentId;
    private String studentGrade;

    public StudentInfo(String studentName, int studentId, String studentGrade) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentGrade = studentGrade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String toString() {
        return "Student Name: " + studentName +
               ", ID: " + studentId +
               ", Grade: " + studentGrade;
    }
}