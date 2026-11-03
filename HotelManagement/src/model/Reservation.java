package model;

public class Reservation {

private String idR;
public Guest ResponsibleGuest; 
public Room room;
public int numberOfGuests;
public int numberOfNights;
public ReservationStatus status;


public Reservation( String idR, Guest ResponsibleGuest, Room room, int numberOfGuests, int numberOfNights ){

    SetidR(idR);
    this.ResponsibleGuest = ResponsibleGuest;
    this.room = room;
    this.numberOfGuests = numberOfGuests;
    this.numberOfNights = numberOfNights;
    this.status = ReservationStatus.PENDING;
}

public String SetidR(String idR){
    if(idR.matches("[0-9]+")){
            this.idR = idR;
        }
        return idR;
}

public Room getRoom(){
    return room;
}

public int getNumberOfnights(){
    return numberOfNights;
}

public int numberOfGuests(){
    return numberOfGuests;
}

public void confirm(){
    this.status = ReservationStatus.CONFIRMED;
}

public void cancel(){
    this.status = ReservationStatus.CANCELLED;
}

public ReservationStatus getStatus(){
    return status;
}

public double calculateTotalCost(){

    double totalCost = room.pricePerNight(numberOfGuests) * numberOfNights;

    return totalCost; 

}


public String getReservationDetails(){

    String reservationDetails = "ID Reservation " + idR + "\n" +  
    "Responsible Guest " + ResponsibleGuest.getResponsibleGuest() + "\n" + "Room ID " + room.getId() + "\n"
    + "Number of Guests " + numberOfGuests + "\n" + "Number of Nights " + numberOfNights + "\n" + 
    "Status " + status + "\n" + "Total reservation cost" + calculateTotalCost() + "\n " ;

    return reservationDetails;
}

}
