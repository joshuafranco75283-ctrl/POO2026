package domain;

public class Boat extends Taxi {
    private float fixedCharges;

    public float getFixedCharges() {
        return fixedCharges;
    }

    public void setFixedCharges(float fixedCharges){
        if(fixedCharges <= 0){
            throw new IllegalArgumentException("Fixed charge must be positive");
        }
        this.fixedCharges = fixedCharges;
    }

    public Boat(int id, float baseValue, float kilometersTraveled, float costKilometer, float fixedCharges){
        super(id, baseValue, kilometersTraveled, costKilometer);
        setFixedCharges(fixedCharges);
    }
    
    @Override 
    public float getPrice(){
        return super.getPrice() + this.fixedCharges;
    }

    
}
