import java.util.*;

public class Main6 {
    static Scanner scanner;

    public static void main(String[] args){
        scanner = new Scanner(System.in);
        Coffee[] coffees = {
                new CoffeeBeans("Lavazza", 1700, 0.5F,98),
                new GroundCoffee("Paulig",2000, 0.7F, 65),
                new InstantCoffee("Jardin",600, 0.25F, 74),
                new CoffeeInCans("Carraro",1800, 0.6F, 58),
                new CoffeeInBags("Carte Noire",3500, 0.7F, 79),
                new CoffeeBeans("Nescafe",800, 0.4F, 91),
                new GroundCoffee("Jacobs",4000, 0.9F, 86),
        };
        boolean flag = true;
        Van cargo = new Van(coffees);
        if (!cargo.CheckPriceLimit()){
            flag = false;
            System.out.println("The total price should not exceed 40000!");
        }
        else if(!cargo.CheckWeightLimit()){
            flag = false;
            System.out.println("The total weight should not exceed 500!");
        }
        else if(!cargo.CheckQuality()){
            flag = false;
            System.out.println("Quality must be in the range of 0 to 100!");
        }

        if (flag) {
            cargo.setCargo(coffees);
            System.out.println(cargo.getCargo());

            System.out.println("\nResults of sorting" );
            cargo.sortCargoPriceToWeight();
            System.out.println(cargo.getCargo());

            int minQuality = 30;
            int maxQuality = 90;
            System.out.println("\nCoffee from diapason " +
                    minQuality + " : " + maxQuality + "%:\n");
            String[] foundCoffee =
                    cargo.searchElementOnDiapason(minQuality,maxQuality);
            for (int i = 0; i < foundCoffee.length; i++)
                if (foundCoffee[i] != null)
                    System.out.println(foundCoffee[i]);
        }
    }
}
