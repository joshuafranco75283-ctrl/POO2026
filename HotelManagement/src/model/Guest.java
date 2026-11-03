package model;

public class Guest {

    public void setIdGuest(String idGuest) {
        if(idGuest.matches("[0-9]+")){
            this.idGuest = idGuest;

        }
    }
    
    public void setResponsibleGuest(String responsibleGuest) {
        if(responsibleGuest.matches("[a-zA-Z ]+")){
            this.responsibleGuest = responsibleGuest;
        }
    }
    
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.matches("[0-9]+")){
            this.phoneNumber = phoneNumber;
        }
    }
    
    public void setEmail(String email) {
        if (email.contains("@")){
            this.email = email;
        }
    }
    
    private String idGuest; 
    private String responsibleGuest;
    private String phoneNumber;
    private String email;

    public Guest(String idGuest, String responsibleGuest, String phoneNumber, String email){
        
        setIdGuest(idGuest);
        setResponsibleGuest(responsibleGuest);
        setPhoneNumber(phoneNumber);
        setEmail(email);

    }
    
    

    public String getId(){
        return idGuest;
    }

    public String getResponsibleGuest(){
        return responsibleGuest;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }
}
