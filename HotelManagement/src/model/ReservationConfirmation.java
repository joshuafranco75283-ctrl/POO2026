package model;

public class ReservationConfirmation {

    public Reservation reservation;
    private String idConfirmation;
    
    public ReservationConfirmation(Reservation reservation, String idConfirmation){
        this.reservation = reservation; 
        this.idConfirmation = idConfirmation;
    }


    public String printReceipt(){
        String details = reservation.getReservationDetails();

        return "Id Confirmation " + idConfirmation + "\n" +  details;

    }


}
