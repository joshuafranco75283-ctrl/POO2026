package domain;

public class Train extends Transports {
    private float railFare;
    private float distance;
    private float kilometerPrice;

    public Train (int id, float railFare, float distance, float kilometerPrice){
        super(id);
        setRailFare(railFare);
        setDistance(distance);
        setKilometerPrice(kilometerPrice);
    }


    public float getKilometerPrice() {
        return kilometerPrice;
    }
    public void setKilometerPrice(float kilometerPrice) {
        if (kilometerPrice <= 0){
            throw new IllegalArgumentException("Kilometers value must be positive");
        }
        this.kilometerPrice = kilometerPrice;
    }
    public float getRailFare() {
        return railFare;
    }
    public void setRailFare(float railFare) {
        if (railFare < 0){
            throw new IllegalArgumentException("rail fares mustn't be negative ");
        }
        this.railFare = railFare;
    }
    public float getDistance() {
        return distance;
    }
    public void setDistance(float distance) {
        if (distance <= 0){
            throw new IllegalArgumentException("Kilometers recorred must be positive");
        }
        this.distance = distance;
    }
    
    @Override 
    public float getPrice(){
        return railFare + (distance * kilometerPrice);
    }
    
    
}
