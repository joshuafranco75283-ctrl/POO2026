package domain;

public class Taxi extends BasePrice {
        protected float kilometersTraveled = 0;
        protected float costKilometer = 0;

        public Taxi(int id, float baseValue, float kilometersTraveled, float costKilometer){
            super(id, baseValue);
            setKilometersTraveled(kilometersTraveled);
            setCostKilometer(costKilometer);
        }

    public void setKilometersTraveled(float kilometersTraveled) {
        if (kilometersTraveled < 0){
            throw new IllegalArgumentException("kilometers traveled must be  positive.");
        }
        this.kilometersTraveled = kilometersTraveled;
    }
    
    public void setCostKilometer(float costKilometer){
        if (costKilometer <= 0 ) {
            throw new IllegalArgumentException("Cost per kilometer must be positive.");
        }
        this.costKilometer = costKilometer;   
    }

    public float getKilometersTraveled() {
            return kilometersTraveled;
        }

        public float getCostKilometer() {
            return costKilometer;
        }
    
    @Override 
    public float getPrice(){
        return baseValue + (kilometersTraveled*costKilometer);
    }

        
}
