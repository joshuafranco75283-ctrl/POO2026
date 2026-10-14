public class TestRoomReservation {
    public static void main(String[] args) {
        RoomReservation reservation = new RoomReservation("Pepe", 202, 7, 150.0);
        System.out.println("Guest Name: " + reservation.getGuestName());
        System.out.println("Room Number: " + reservation.getRoomNumber());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Price per Night: " + reservation.getPricePerNight());
        System.out.println("Total Cost: " + reservation.getTotalCost());
    
        int validNights = 3;
        if(reservation.setNumberOfNights(validNights)){
            System.out.println("Number of Nights updated successfully to " + reservation.getNumberOfNights());
            System.out.println("Total Cost after update: " + reservation.getTotalCost());
        } else {
            System.out.println("Failed to update Number of Nights. Current nights: " + reservation.getNumberOfNights());
            System.out.println("Total Cost remains after failure: " + reservation.getTotalCost());
        }
        int invalidNights = -1;
        if(reservation.setNumberOfNights(invalidNights)){
            System.out.println("Number of Nights updated successfully to " + reservation.getNumberOfNights());
            System.out.println("Total Cost after update: " + reservation.getTotalCost());
        } else {
            System.out.println("Failed to update Number of Nights. Current nights: " + reservation.getNumberOfNights());
            System.out.println("Total Cost remains after failure: " + reservation.getTotalCost());
        }
        double validPrice = 200.0;
        if(reservation.setPricePerNight(validPrice)){
            System.out.println("Price per Night updated successfully to " + reservation.getPricePerNight());
            System.out.println("Total Cost after update: " + reservation.getTotalCost());
        } else {
            System.out.println("Failed to update Price per Night. Current value: " + reservation.getPricePerNight());
            System.out.println("Total Cost remains after failure: " + reservation.getTotalCost());
        }
        double invalidPrice = -50.0;
        if(reservation.setPricePerNight(invalidPrice)){
            System.out.println("Price per Night updated successfully to " + reservation.getPricePerNight());
            System.out.println("Total Cost after update: " + reservation.getTotalCost());
        } else {
            System.out.println("Failed to update Price per Night. Current value: " + reservation.getPricePerNight());
            System.out.println("Total Cost remains after failure: " + reservation.getTotalCost());
        }
    }
}
