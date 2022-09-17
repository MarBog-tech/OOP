public class CoffeeInCans extends Coffee{
    private String type = "Coffee in cans";

    public CoffeeInCans(String name, float price, float weight, int quality) {
        super(name, price, weight, quality);
    }


    @Override
    public String getInformation() {
        return "Type:" + type + " " + super.getInformation();
    }
}
