public class Farmer extends Villager implements Farmable{
    
    
    @Override 
    public void farm(){
        System.out.println("Cultiva");
    }

    public Farmer (String name){
        super(name);
    }
    
}
