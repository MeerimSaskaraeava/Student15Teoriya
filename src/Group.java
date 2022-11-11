import java.time.LocalDate;

public class Group {
    private Student[] students;
    private String studyInGroup;
    private LocalDate startStudy;
    public Group(){

    }

    public Group(Student[] students, String studyInGroup, LocalDate startStudy) {
        this.students = students;
        this.studyInGroup = studyInGroup;
        this.startStudy = startStudy;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getStudyInGroup() {
        return studyInGroup;
    }

    public void setStudyInGroup(String studyInGroup) {
        this.studyInGroup = studyInGroup;
    }

    public LocalDate getStartStudy() {
        return startStudy;
    }

    public void setStartStudy(LocalDate startStudy) {
        this.startStudy = startStudy;
    }
}
