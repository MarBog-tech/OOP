public class InstantCoffee extends Coffee{
    private String type = "Instant coffee";

    public InstantCoffee(String name, float price, float weight, int quality) {
        super(name, price, weight, quality);
    }


    @Override
    public String getInformation() {
        return "Type:" + type + " " + super.getInformation();
    }
}
