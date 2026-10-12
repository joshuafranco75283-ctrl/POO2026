package domain;

public abstract class BasePrice extends Transports {
    
    public BasePrice(int id, float baseValue){
        super(id);
        setBaseValue(baseValue);
    }

    protected float baseValue = 0;

    
    public void setBaseValue(float baseValue){
        if (baseValue <= 0){
            throw new IllegalArgumentException("base value must be a positive integer.");
        }
        this.baseValue = baseValue;
    }

    public float getBase_value(){
        return baseValue;
    }
}
