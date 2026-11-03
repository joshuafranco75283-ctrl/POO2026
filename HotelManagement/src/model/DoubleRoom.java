package model;

public class DoubleRoom extends Room {

    public DoubleRoom(int id, int floorNumber, boolean hasOceanView, double basePrice, boolean hasPremiumChannels) {
        super(id, floorNumber, hasOceanView, basePrice, hasPremiumChannels, 2);
    }
    
    @Override 
    public double calculateBedCost(int numberOfGuests){
        double TCD = 0;
        switch (numberOfGuests) {
            case 1:
                TCD =  TCS * 1.45;
                break;
            case 2:
                TCD = TCS * 1.90;
                break;
            default:
                throw new IllegalArgumentException(" Guests must be 1 or 2");
        }
        return TCD;
    }

}
