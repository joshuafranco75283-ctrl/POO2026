public class Hunter extends Villager implements Hunterable{
    @Override 
    public void hunt(){
        System.out.println("Caza");
    }
    public Hunter(String name){
        super(name);
    }
}