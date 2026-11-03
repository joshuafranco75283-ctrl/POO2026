package model;

public class SingleRoom extends Room {

    public SingleRoom(int id, int floorNumber, boolean hasOceanView, double basePrice, boolean hasPremiumChannels){
        super( id, floorNumber, hasOceanView, basePrice, hasPremiumChannels, 1);
    }



    
    @Override
    public double calculateBedCost(int numberOfGuests) {
        return TCS;
    }
}
