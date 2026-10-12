package domain;

public class Bus extends Transports {
    private float personFare;
    private int personCount;

    public void setPersonFare(float personFare){
        if (personFare <= 0 ){
            throw new IllegalArgumentException("person fare must be positive");
        }
        this.personFare = personFare;
    }
    public void setPersonCount(int personCount){
        if (personCount <= 0 ){
            throw new IllegalArgumentException("must be more or equal to 1 person");
        }
        this.personCount = personCount;
    }

    public Bus(int id, float personFare, int personCount){
        super(id);
        setPersonCount(personCount);
        setPersonFare(personFare);
    }
    public float getPersonFare(){
        return personFare;
    }
    public int getPersonCount(){
        return personCount;
    }

    @Override 
    public float getPrice(){
        return personFare * personCount;
    }
}
