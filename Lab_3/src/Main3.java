import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    //C3 = 11 % 3 = 2 type = String
    //C13 = 11 % 17 = 11 Із заданого тексту видалити всі слова
    // визначеної довжини, що починаються з приголосної літери.
    public static void main(String[] args){
        int len = 4;
        String text = "A fictional story of a band " +
                "of five heroes who go off on a dragon hunt. " +
                "It is poorly written and structurally incoherent! Its value lies in the many lessons that can be learned from failure.";

        StringBuilder newsentence = new StringBuilder();

        String[] words = text.replace(".", " .")
                .replace("!", " !")
                .replace("?", " ?")
                .replace(",", " ,").split(" ");
        for (String word : words) {
            if (word.length() == len) {
                switch (word.toLowerCase().charAt(0)) {
                    case 'a', 'o', 'i', 'e', 'y', 'u', '.', '?', ',', '!' -> newsentence.append(" ").append(word);
                }
            }
            else {
                switch (word.charAt(0)) {
                    case '.', '?', ',', '!' -> newsentence.append(word);
                    default -> newsentence.append(" ").append(word);
                }
            }
        }
        System.out.println(newsentence);
    }
}
