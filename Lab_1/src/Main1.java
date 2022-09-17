import java.util.Scanner;
public class Main1 {
    //C2 = 11 % 2 = 1; O1 = "-"
    //C3 = 11 % 3 = 2; C = 2
    //C5 = 11 % 5 = 1; O2 = "/"
    //C7 = 11 % 7 = 4; type = "char"
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0, a = 0, b = 0;
        while (true){
            try {
                System.out.print("Enter a value n:");
                n = Integer.parseInt(scanner.nextLine());
                if (n < 2){
                    System.out.println("Value n must be greater than 2");
                    continue;
                }
                System.out.print("Enter a value m:");
                m = Integer.parseInt(scanner.nextLine());
                if (m <= 0){
                    System.out.println("Value m must be greater than 0");
                    continue;
                }
                System.out.print("Enter a value a:");
                a = Integer.parseInt(scanner.nextLine());
                if (a < 2){
                    System.out.println("Value a must be greater than 2");
                    continue;
                } else if (a >= n) {
                    System.out.println("The value of n must be greater than a");
                    continue;
                }
                System.out.print("Enter a value b:");
                b = Integer.parseInt(scanner.nextLine());
                if (b <= 0){
                    System.out.println("Value b must be greater than 2");
                    continue;
                } else if (b >= m) {
                    System.out.println("The value of m must be greater than b");
                    continue;
                }
                break;
            }
            catch (Exception e){
                System.out.println("Invalid value entered!\n" +
                        "Values must be integers.");
            }
        }
        float result = 0;
        for (char i = (char)a; i <= (char)n; i = (char)((int)i + 1)){
            for (char j = (char)b; j <= (char)m; j = (char)((int)j + 1)){
                result += ((float)i/(float)j)/((float)i - 2);
            }
        }
        System.out.println(("Result is " + result));

    }
}