package domain;

public class Airplane extends BasePrice {
    private float kilogramsCharged;
    private float kilogramsValue;

    public void setKilogramsCharged(float kilogramsCharged) {
        if(kilogramsCharged< 0){
            throw new IllegalArgumentException("Kilograms charged must be positive");
        }
        this.kilogramsCharged = kilogramsCharged;
    }
    public void setKilogramsValue(float kilogramsValue) {
        if(kilogramsValue< 0){
            throw new IllegalArgumentException("Kilograms Value must be positive");
        }
        this.kilogramsValue = kilogramsValue;
    }

    public Airplane(int id , float baseValue, float kilogramsCharged, float kilogramsValue){
        super(id, baseValue);
        setKilogramsCharged(kilogramsCharged);
        setKilogramsValue(kilogramsValue);
    }

    @Override 
    public float getPrice(){
        return baseValue + (kilogramsCharged * kilogramsValue);
    }

    public float getKilogramsValue(){
        return kilogramsValue;
    }
    public float getkilogramsCharged(){
        return kilogramsCharged;
    }

    
}
