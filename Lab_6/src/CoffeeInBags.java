public class CoffeeInBags extends Coffee{

    private String type = "Coffee in bags";

    public CoffeeInBags(String name, float price, float weight, int quality) {
        super(name, price, weight, quality);
    }


    @Override
    public String getInformation() {
        return "Type:" + type + " " + super.getInformation();
    }
}
