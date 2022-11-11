public class Course {
    private String courseName;
    private int numberCourse;
    private String teacherName;
    private Group[]groups;

    public Course(){

    }

    public Course(String courseName, int numberCourse, String teacherName, Group[] groups) {
        this.courseName = courseName;
        this.numberCourse = numberCourse;
        this.teacherName = teacherName;
        this.groups = groups;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberCourse() {
        return numberCourse;
    }

    public void setNumberCourse(int numberCourse) {
        this.numberCourse = numberCourse;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}
