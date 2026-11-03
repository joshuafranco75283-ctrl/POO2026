package model;

public class Familiar extends Room  {

    private int extraSingleBeds;
    protected double TCD = TCS * 1.90;

    public Familiar( int id, int floorNumber, boolean hasOceanView , double basePrice, boolean hasPremiumChannels, int extraSingleBeds){
        super(id, floorNumber, hasOceanView, basePrice, hasPremiumChannels, 8);
        setExtraSingleBeds(extraSingleBeds);


    }

    public void setExtraSingleBeds(int extraSingleBeds){
        if ( extraSingleBeds == 1 || extraSingleBeds == 2 || extraSingleBeds == 0){
            this.extraSingleBeds = extraSingleBeds;
        }
    }

    @Override 
    public double calculateBedCost(int numberOfGuests){
         double extraSingleBedsValue = 0.70 * TCS * extraSingleBeds;
        
        double Cost  = ((TCD * 2) + (TCS * 2) + extraSingleBedsValue);
        
        return Cost;

    }

}
