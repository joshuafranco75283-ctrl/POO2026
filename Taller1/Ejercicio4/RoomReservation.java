public class RoomReservation {
    private String guestName;
    private Integer roomNumber;
    private Integer numberOfNights;
    private Double pricePerNight;

    private boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }
    private boolean isValidRoomNumber(Integer roomNumber) {
        return roomNumber != null && roomNumber > 0;
    }
    private boolean isValidNumberOfNights(Integer numberOfNights){
        return numberOfNights != null && numberOfNights > 0;
    }
    private boolean isValidPricePerNight(Double pricePerNight){
        return pricePerNight != null && pricePerNight > 0;
    }

    public RoomReservation(String guestName, Integer roomNumber, Integer numberOfNights, Double pricePerNight){
        if(isValidName(guestName)){
            this.guestName = guestName;
        } else{
            this.guestName = "Unknown Guest";
        }
        if(isValidRoomNumber(roomNumber)){
            this.roomNumber= roomNumber;
        } else{
            this.roomNumber = 101; 
        }
        if(isValidNumberOfNights(numberOfNights)){
            this.numberOfNights= numberOfNights;
        } else{
            this.numberOfNights = 1;
        }
        if(isValidPricePerNight(pricePerNight)){
            this.pricePerNight= pricePerNight;
        } else{
            this.pricePerNight = 1.0; 
        }
    }
    public Double calculateTotalCost() {
        return this.numberOfNights * this.pricePerNight;
    }
    public boolean setGuestName(String guestName){
        if(isValidName(guestName)){
            this.guestName = guestName;
            return true;
        } else {
            return false;
        }
    }
    public boolean setRoomNumber(Integer roomNumber){
        if(isValidRoomNumber(roomNumber)){
            this.roomNumber = roomNumber;
            return true;
        } else {
            return false;
        }
    }
    public boolean setNumberOfNights(Integer numberOfNights){
        if(isValidNumberOfNights(numberOfNights)){
            this.numberOfNights = numberOfNights;
            return true;
        } else {
            return false;
        }
    }
    public boolean setPricePerNight(Double pricePerNight){
        if(isValidPricePerNight(pricePerNight)){
            this.pricePerNight = pricePerNight;
            return true;
        } else {
            return false;
        }
    }
    public String getGuestName() {
        return guestName;
    }
    public Integer getRoomNumber() {
        return roomNumber;
    }
    public Integer getNumberOfNights() {
        return numberOfNights;
    }
    public Double getPricePerNight() {
        return pricePerNight;
    }
    public Double getTotalCost() {
        return calculateTotalCost();
    }
}
