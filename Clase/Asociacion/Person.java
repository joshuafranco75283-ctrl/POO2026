public class Person {
    private String name;
    private Passport passport;

    public Person (String name){
        this.name = name;
    }
    
    public Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
    }

    public Passport getPassport() {
        return passport;
    }
    public String getName(){
        return name;
    }
}