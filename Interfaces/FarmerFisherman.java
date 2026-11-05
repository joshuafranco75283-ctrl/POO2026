public class FarmerFisherman extends Villager implements Farmable, Fishable {

    

    @Override 
    public void farm(){
        System.out.println("Cultiva");
    }

    @Override 
    public void fish(){
        System.out.println("Pesca");
    }

    public FarmerFisherman(String name){
        super(name);
    }
    
}
