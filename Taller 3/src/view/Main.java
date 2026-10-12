package view;
import domain.*;

public class Main {
    public static void main(String[] args) {
        Transports[] transports = new Transports[]{
        new Taxi(101, 3000.0f, 12.5f, 1200.0f),
        new Boat(202, 15000.0f, 25.0f, 2000.0f, 8000.0f),
        new Airplane(303, 120000.0f, 18.5f, 7500.0f),
        new Bus(404, 2800.0f, 5),
        new Train(505, 10000.0f, 45.0f, 350.0f)
        };    


        for(int i = 0; i < transports.length; i++){
            String transportMethod = transports[i].getClass().getSimpleName();
            System.out.println(transportMethod +" With ID " + transports[i].getId());
            System.out.println(transports[i].getPrice());
        }
        

    }  
}
