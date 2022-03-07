public class Biscuits extends ShopItems{

    protected String type;
    protected int weight;
    protected int amount;

    public Biscuits() {
        super();
    }


    public Biscuits(String brand,String dealer, String type, int weight, int amount) {
        super();
        this.brand = brand;
        this.dealer = dealer;
        this.type = type;
        this.weight = weight;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public double capacity() {
        return weight * amount;
    }

    @Override
    public String toString() {
        return "Biscuits{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", amount=" + amount +
                ", brand='" + brand + '\'' +
                ", dealer='" + dealer + '\'' +
                "} " + super.toString();
    }
}
