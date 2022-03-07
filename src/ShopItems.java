public abstract class ShopItems {

    protected String brand;
    protected String dealer;

    public ShopItems() {
        super();
        brand = null;
        dealer = null;
    }

    public ShopItems(String brand, String dealer) {
        super();
        this.brand = brand;
        this.dealer = dealer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public abstract double capacity();

    @Override
    public String toString() {
        return "ShopItems{" +
                "brand='" + brand + '\'' +
                "dealer='" + dealer + '\'' +
                '}';
    }
}
