import java.time.LocalDate;

public class Student {

    private String studentName;
    private String studentSurname;
    private String email;
    private LocalDate dataOfBirds;

    public Student(){

    }

    public Student(String studentName, String studentSurname, String email, LocalDate dataOfBirds) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.email = email;
        this.dataOfBirds = dataOfBirds;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataOfBirds() {
        return dataOfBirds;
    }

    public void setDataOfBirds(LocalDate dataOfBirds) {
        this.dataOfBirds = dataOfBirds;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", email='" + email + '\'' +
                ", dataOfBirds=" + dataOfBirds +
                '}';
    }
}
