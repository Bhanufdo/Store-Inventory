public class Drinks extends ShopItems{

    protected String type;
    protected int volume;
    protected int amount;

    public Drinks() {
        super();
    }

    public Drinks(String brand,String dealer, String type, int volume, int amount) {
        super();
        this.brand = brand;
        this.dealer = dealer;
        this.type = type;
        this.volume = volume;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public double capacity() {
        return volume*amount;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "type='" + type + '\'' +
                ", volume=" + volume +
                ", amount=" + amount +
                ", brand='" + brand + '\'' +
                ", dealer='" + dealer + '\'' +
                "} " + super.toString();
    }
}
