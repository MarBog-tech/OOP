public class Van {

    private Coffee[] cargo;

    public Van(Coffee[] cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        String result = "";
        for (int i = 0; i < cargo.length; i++)
            result = result + '\n' + cargo[i].getInformation();
        return result;
    }

    public void setCargo(Coffee[] cargo) {
        this.cargo = cargo;
    }

    public boolean CheckPriceLimit(){
        int allPrice = 0;
        for (int i = 0; i < cargo.length; i++)
            allPrice += cargo[i].getPrice();
        return allPrice < 40000;
    }

    public boolean CheckWeightLimit(){
        int allWeight = 0;
        for (int i = 0; i < cargo.length; i++)
            allWeight += cargo[i].getWeight();
        return allWeight < 500;
    }

    public boolean CheckQuality(){
        for (int i = 0; i < cargo.length; i++)
            if (cargo[i].getQuality() < 0 && cargo[i].getQuality() > 100)
                return false;
        return true;
    }

        public void sortCargoPriceToWeight() {
        for(int i = cargo.length - 1; i >= 0; i--)
            for(int j = 0 ; j < i ; j++)
                if( cargo[i].getPrice() / cargo[i].getWeight() > cargo[j].getPrice() / cargo[j].getWeight()) {
                    Coffee temp = cargo[j];
                    cargo[j] = cargo[i];
                    cargo[i] = temp;
                }
    }
    public String[] searchElementOnDiapason(double limit1, double limit2) {
        String list[] = new String[cargo.length];
        int counter = 0;
        for(int i = 0 ; i < cargo.length ; i++)
            if( (cargo[i].getQuality() >= limit1)
                    &&(cargo[i].getQuality() <= limit2))
                list[counter++] = cargo[i].getName();
        return list;
    }

}
