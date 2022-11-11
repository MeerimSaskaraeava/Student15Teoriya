import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        Student student=new Student();
        Group group=new Group();
        Course course=new Course();

        Student student1=new Student("Asel","Urakunova","urakunova@gmail.com", LocalDate.of(1982,9,11));
        Student student2=new Student("Erlan","Osmonov","osmonov@gmail.com", LocalDate.of(1990,4,23));
        Student student3=new Student("Abdirazak ","Nooruzbai Uulu","abdirazak.nooruzbai@gmail.com", LocalDate.of(2000,5,12));
        Student student4=new Student("Usen ","Kemelov ","kemelov.usen@gmail.com", LocalDate.of(1997,11,30));
        Student[]students1={student1,student2,student3,student4};
        Student student5=new Student("Umut","Kayipova","umut@gmail.com", LocalDate.of(1998,8,24));
        Student student6=new Student("Ernis","Asakeev","asekeev@gmail.com", LocalDate.of(1983,9,13));
        Student student7=new Student("Arzimat ","Naamat Uulu","arzimat.naamat@gmail.com", LocalDate.of(1989,11,18));
        Student student8=new Student("Aiperi ","Malikova ","malikova.aiperi@gmail.com", LocalDate.of(1999,3,22));
        Student[]students2={student5,student6,student7,student8};

        Group group1=new Group(students1,"JS 6",LocalDate.of(2022,4,1));
        Group group2=new Group(students1,"Java 6",LocalDate.of(2022,4,1));
        Group group3=new Group(students1,"JS 6",LocalDate.of(2022,7,1));
        Group group4=new Group(students1,"Java 7",LocalDate.of(2022,7,1));
        Group group5=new Group(students1,"JS 8",LocalDate.of(2022,10,1));
        Group group6=new Group(students1,"Java 8",LocalDate.of(2022,10,1));
        Group[]groups1={group1,group2,group3};
        Group[]groups2={group4,group5,group6};

        Course course1=new Course("Java ",7,"Aijamal Asangazieva (Instructor)",groups1);
        Course course2=new Course("Java ",7,"Mukhammed Toichubai uulu (Java mentor)",groups2);


        LocalDate current=LocalDate.now();
        getAgeStudent(current,students1,students2);


    }
    public static void getAgeStudent(LocalDate current, Student[] students1, Student[] students2){
        for (Student student : students1) {
            System.out.println("\u001B[34mStudent age: "+ChronoUnit.YEARS.between(student.getDataOfBirds(),current)+"\u001B[0m");
            System.out.println(student);}
    for (Student student : students2) {
        System.out.println("\u001B[34mStudent age: "+ChronoUnit.YEARS.between(student.getDataOfBirds(),current)+"\u001B[0m");
        System.out.println(student);}
}
}