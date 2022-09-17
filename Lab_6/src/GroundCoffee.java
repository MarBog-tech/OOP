public class GroundCoffee extends Coffee{
    private String type = "Ground coffee";

    public GroundCoffee(String name, float price, float weight, int quality) {
        super(name, price, weight, quality);
    }


    @Override
    public String getInformation() {
        return "Type:" + type + " " + super.getInformation();
    }
}
