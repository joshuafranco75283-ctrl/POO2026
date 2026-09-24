public class TestInheritance {
    public static void main(String[] args) {
        Student p = new Student("Carlos", "2001");
        p.greet();
        // tambien es posible asi

        //Person p = new Student("Carlos", "2001");
        //p.greet();

        // solo se puede de esa manera si la segunda (Student) es hija de la primera(person)
        //student.study();

        Person p2 = new Person("aa");
        p2.greet();
        Person[] persons = new Person[2];{
        persons[0] = student;
        persons[1] = p;
        persons[2] = p2;
        }
    }
}
