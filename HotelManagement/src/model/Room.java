package model;

public abstract class Room {

    private final int id;
    private int floorNumber;
    private final boolean hasOceanView;
    protected double basePrice;
    private boolean hasPremiumChannels;
    private int maxCapacity;
    protected double TCS = 50000;
     

    public Room(int id, int floorNumber, boolean hasOceanView, double basePrice, boolean hasPremiumChannels, int maxCapacity){
        this.id = id;
        setFloorNumber(floorNumber);
        this.hasOceanView = hasOceanView;
        setBasePrice(basePrice);
        this.hasPremiumChannels = hasPremiumChannels;
        setMaxCapacity(maxCapacity);
    }

    public void setFloorNumber(int floorNumber){
        if(floorNumber >= 1 ){
            this.floorNumber = floorNumber;
        }
    }
    public void setMaxCapacity(int maxCapacity){
        if (maxCapacity >= 1){
            this.maxCapacity = maxCapacity;
        }
    }
    public double floorRecharge(){
        double recharge;
        if (floorNumber >= 1 && floorNumber <= 3){
            recharge = 0.0;
        }
        else if (floorNumber >3 && floorNumber <=6){
            recharge = 0.1;
        }
        else{
            recharge = 0.2;
        }
        return recharge;
    }

    public double calculateOceanViewSubChargues(){
        double PVM;
        double RVM;
        double rechargePerFloor;
        double subcharge;
        double RPI;
        if(hasOceanView){
            PVM = 30;
            RVM = basePrice * (PVM / 100);
            rechargePerFloor = floorRecharge();
            RPI = rechargePerFloor * RVM;
            subcharge = RPI + RVM;
        }
        else{
            subcharge = 0;
        }
        return subcharge;

    }

    public double tvRecharge(){
        double premiumRecharge;
        if (hasPremiumChannels){
            premiumRecharge = 3500;
        }
        else {
            premiumRecharge = 0;
        }
        return premiumRecharge;
    }

    public void setBasePrice(double basePrice){
        if(basePrice > 0){
            this.basePrice = basePrice;
        }
    }

    public int getId() {
        return id;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public double getBasePrice() {
        return basePrice;
    }
    

    public double pricePerNightWitoutBeds(){
        double costNightWithoutBeds = basePrice + calculateOceanViewSubChargues() +  tvRecharge();
        return costNightWithoutBeds;
    }

    public double pricePerNight(int numberOfGuests) {
        double costNight = pricePerNightWitoutBeds()+ calculateBedCost(numberOfGuests);
        return costNight;
    }

    public abstract double calculateBedCost(int numberOfGuests);
}
 