package model;

public class Suite extends Room {
    
    double TCD = TCS * 1.90;
    private final double TMI = 30000;

    public Suite( int id, int floorNumber, boolean hasOceanView, double basePrice){
        super(id, floorNumber, hasOceanView, basePrice, true, 2);
    }

    @Override 
    public double calculateBedCost(int numberOfGuests){
        
        double suiteCost  = TCD + TMI;

        return suiteCost;

    }
}
