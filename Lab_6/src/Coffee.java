

public class Coffee {

    public String name;
    public float price;
    public float weight;
    public int quality;

    public Coffee(String name, float price, float weight, int quality) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getInformation() {
        return "Name:" + name + " Price:" + String.valueOf(price)  + "UA" + " Weight:" +
                String.valueOf(weight) + "kg" + " Quality:" + String.valueOf(quality) + "%";
    }
}
