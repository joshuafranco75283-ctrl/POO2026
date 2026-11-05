import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Villager> 
        villagers = new ArrayList<>();

        villagers.add(new Farmer("Juan"));
        villagers.add(new Fisherman("Maria"));
        villagers.add(new Hunter("Natalia"));
        villagers.add(new FarmerFisherman("Marcelo"));


        for (Villager villager : villagers ){
            System.out.println(villager.getName());
            if (villager instanceof Farmable farmer){
                farmer.farm();
            }
            if (villager instanceof  Fishable  Fisherman ){
                Fisherman.fish();
            }
            if (villager instanceof Hunterable Hunter){
                Hunter.hunt();
            }
            
        }
    }
}
