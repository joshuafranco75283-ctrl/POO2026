
public class TestProduct{
    public static void main(String[] args) {
        
        String[] newName = {"", "Laptop", "Smartphone"};
        double[] newPrice = {500.0, -3.0, 800.0};
        int[] newStock = {10, 5, -4};
        for (int i = 0; i < newName.length; i++) {
            System.out.println("Cambiando el producto " + (i + 1) + ":");
            Product product = new Product();
            boolean acceptedName = product.setName(newName[i]);
            if (acceptedName){
                System.out.println("Product Name: " + product.getName());
            }else{
                System.out.println("Error: Nombre inválido" + " Se conseva el nombre " + product.getName());}
             
            boolean acceptedPrice = product.setPrice(newPrice[i]);
            if(acceptedPrice){
                System.out.println("Product Price: " + product.getPrice());
            } else {
                System.out.println("Error: Precio inválido" + " Se conserva el precio " + product.getPrice() + "$");
            }
            boolean acceptedStock = product.setStock(newStock[i]);
            if(acceptedStock){
                System.out.println("Product Stock: " + product.getStock());
            } else {
                System.out.println("Error: Stock inválido" + " Se conserva el stock " + product.getStock());
            }
            
        }
    }
}

