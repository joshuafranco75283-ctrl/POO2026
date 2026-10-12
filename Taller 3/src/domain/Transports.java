package domain;

public abstract  class Transports{
    protected int id = 0;

    public Transports(int id) {
        setId(id);
    }

    public void setId(int id){
        if(id < 0){
            throw new IllegalArgumentException("ID must be a positive integer.");
        }
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public abstract float getPrice();
}
