public class Product {
    private Long id;
    private String name;
    private double price;
    private int quantityAvailable;

    public Product(Long id, String name, double price, int quantityAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }
}

