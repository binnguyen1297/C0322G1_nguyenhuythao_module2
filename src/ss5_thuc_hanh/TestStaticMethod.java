package ss5_thuc_hanh;

public class TestStaticMethod {
    private static StaticMethodAssignment.Student Student;

    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        StaticMethodAssignment.Student s1 = new StaticMethodAssignment.Student(111, "Hoang");
        StaticMethodAssignment.Student s2 = new StaticMethodAssignment.Student(222, "Khanh");
        StaticMethodAssignment.Student s3 = new StaticMethodAssignment.Student(333, "Nam");

        //call
        s1.display();
        s2.display();
        s3.display();
    }
}
