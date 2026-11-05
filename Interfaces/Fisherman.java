public class Fisherman extends Villager implements Fishable{
    @Override 
    public void fish(){
        System.out.println("Pesca");
    }
    public Fisherman(String name){
        super(name);
    }
}