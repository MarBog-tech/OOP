public class CoffeeBeans extends Coffee {
    private String type = "Coffee beans";

    public CoffeeBeans(String name, float price, float weight, int quality) {
        super(name, price, weight, quality);
    }


    @Override
    public String getInformation() {
        return "Type:" + type + " " + super.getInformation();
    }
}
