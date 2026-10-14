public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(){
        this.name = "Default Product";
        this.price = 1.0;
        this.stock = 0;
    }

    private boolean isValidName(String name) {
        return name != null && !name.isBlank() && !name.isEmpty();
    }
    private boolean isValidPrice(double price) {
        return price > 0;
    }
    private boolean isValidStock(int stock) {
        return stock >= 0;
    }

    public boolean setName(String name) {
        if (isValidName(name)) {
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPrice(double price) {
        if (isValidPrice(price)) {
            this.price = price;
            return true;
        } else {
            return false;
        }
    }

    public boolean setStock(int stock) {
        if (isValidStock(stock)) {
            this.stock = stock;
            return true;
        } else {
            return false;
        }
    }
    public String getName() {
        return this.name;
    }
    public double getPrice(){
            return this.price;
        }
    public int getStock() {
        return this.stock;
    }
}