package Lesson12;

public class Student {

    String name;
    int course;
    double grade;

    public Student (String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void swap (Student s1, Student s2){
        Student s3 = s1;
        s1=s2;
        s2=s3;
        System.out.println(s1.name);
    }

    public static void changeName(Student s1){
        s1.name="Vasiliy";
    }



    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3,9.5);
        Student st2 = new Student("Ivan", 3,9.5);


//        changeName(st1);
//        System.out.println(st1.name);

        StudentTest sTest1 = new StudentTest();
        sTest1.ravenstvo(st1,st2);
        sTest1.sravnenie(st1,st2);

    }
}

class StudentTest {


    public void ravenstvo(Student s1, Student s2){
        if (s1==s2){
            System.out.println("Student ravni");
        }
        else {
            System.out.println("Student ne ravni");
        }
    }

    public void sravnenie(Student s1,Student s2){
        if (s1.name==s2.name && s1.course==s2.course && s1.grade==s2.grade){
            System.out.println("Student odinakovie");
        }

    }
}
