public class TestPerson {
    public static void main(String[] args) {
        Passport passport = new Passport("A1234567");
        Person person = new Person("Jane", passport);
        Person person2 = new Person("par");

        System.out.println("Pasaporte: " + person.getPassport().getNumber());
        System.out.println("Nombre de la Persona " + person.getName());

        System.out.println("Persona 2 = "+ person2.getName());
    }
}