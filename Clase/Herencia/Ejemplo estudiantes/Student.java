public class Student extends Person{
    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}
