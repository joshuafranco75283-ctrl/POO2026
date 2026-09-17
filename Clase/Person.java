public class Person{
    private String firstName = "(Sin Nombre)";
    private String secondName = "";
    private String firstFamilyName= "";
    private String secondFamilyName = "";

    public String getFirstFamilyName() {
        return firstFamilyName;
    }

    public String getSecondFamilyName() {
        return secondFamilyName;
    }

    public boolean setFirstFamilyName(String firstFamilyName) {
        if(isValid(firstFamilyName)){
            this.firstFamilyName = firstFamilyName;
            return true;
        }
        return false;
    }

    public boolean setSecondFamilyName(String secondFamilyName) {
        if(isValid(secondFamilyName)){
            this.secondFamilyName = secondFamilyName;
            return true;
        }
        return false;
    }

   

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getNames(){
        return getFirstName() +" " + getSecondName();
    }

    public Person (String firstName, String SecondName, String firstFamilyName, String secondFamilyName){
        this(firstName, firstFamilyName);
        setSecondName(secondName);
        setSecondFamilyName(secondFamilyName);
    }

    public Person (String firstName, String firstFamilyName) {
        setFirstName(firstName);
        setFirstFamilyName(firstFamilyName);
    }

    public boolean setSecondName(String secondName) {
        if(isValid(secondName)){
        this.secondName = secondName;
        return true;
        }
        return false;
    }

    public boolean  setFirstName(String firstName) {
        if(isValid(firstName)){
            this.firstName = firstName;
            return true;
        }
        return false;
    }

    private boolean isValid(String firstName) {
    if(firstName.charAt(0)>= 'A' && firstName.charAt(0)<= 'Z'){
            for(int i = 1; i < firstName.length();i++){
                if(firstName.charAt(i)>= 'a' && firstName.charAt(i)<= 'z'){
                }else{
                    return false;
                }
            }
        return true;   
        }
        else{
            return false;
        } 
    }


}
