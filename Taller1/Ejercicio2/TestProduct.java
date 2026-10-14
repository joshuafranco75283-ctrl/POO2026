
public class TestProduct{
    public static void main(String[] args) {
        
        String[] newName = {"", "Laptop", "Smartphone", "Tablet"};
        double[] newPrice = {500.0, -3.0, 800.0, 300.0};
        int[] newStock = {10, 5, -4, 7};
        for (int i = 0; i < newName.length; i++) {
            System.out.println("Cambiando el producto " + (i + 1) + ":");
            Product product = new Product();
            boolean acceptedName = product.setName(newName[i]);
            if (acceptedName){
                System.out.println("Product Name: " + product.getName());
                boolean acceptedPrice = product.setPrice(newPrice[i]);
                if(acceptedPrice){
                System.out.println("Product Price: " + product.getPrice());
                boolean acceptedStock = product.setStock(newStock[i]);
                    if(acceptedStock){
                    System.out.println("Product Stock: " + product.getStock());
                    System.out.println("Estado aceptado valor total del producto: " + (product.getPrice() * product.getStock()));
                } else {
                    System.out.println("Error: Stock inválido " + " Estado rechazado");
                }
                } else {
                System.out.println("Error: Precio inválido " + " Estado rechazado");


            }}else{
                System.out.println("Error: Nombre inválido " + "Estado rechazado ");}
             
            
            
            
           
            
        }
    }
}

