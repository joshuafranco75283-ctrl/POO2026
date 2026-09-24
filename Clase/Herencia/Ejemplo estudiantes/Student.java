public class Student extends Person{
    private String studentId;

    public Student(String name, String studentId) {
        super(name);// llamar un constructor de la super clase con super
        this.studentId = studentId;// un constructor se puede llamar como this(nombre);
    }
    
    @Override 
    public void greet(){
    System.out.println("Hello Student " + name);
    } 

    public void study() {
        System.out.println(name + " is studying.");
    }
    
}
