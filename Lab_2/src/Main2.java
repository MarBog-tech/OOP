import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    //C5 = 11 % 5 = 1   C = Вт
    //C7 = 11 % 7 = 4   type = "long"
    //C11 = 11 % 11 = 0 "Обчислити суму найменших елементів кожного стовпця"
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = 0, columns = 0;
        while (true){
            try{
                System.out.print("Number of rows:");
                rows = Integer.parseInt(scanner.next());
                System.out.print("Number of columns:");
                columns = Integer.parseInt(scanner.next());
                break;
            }
            catch (Exception e){
                System.out.println("Invalid value entered!\n" +
                        "Values must be integers.");
            }
        }
        long[][] matrix = new long[rows][columns];
        while (true){
            try{
                System.out.print("Enter data automatically? Y/N:");
                char key = scanner.next().charAt(0);
                if(key == 'Y' || key == 'y'){
                    for(int i = 0; i < rows; i++){
                        for (int j = 0; j < columns; j++){
                            matrix[i][j] = (long) (Math.random() * 200 - 100);
                        }
                    }
                } else if (key == 'N' || key == 'n') {
                    for(int i = 0; i < rows; i++){
                        for (int j = 0; j < columns; j++){
                            System.out.printf("Element %dx%d:", i, j);
                            matrix[i][j] = scanner.nextLong();
                        }
                    }
                }
                else{
                    System.out.println("The answer must be yes or no!");
                    continue;
                }
                break;
            }
            catch (Exception e){
                System.out.println("Invalid value entered!\n" +
                        "Values must be integers.");
            }
        }
        System.out.println("Matrix created:");
        for (int i = 0; i < rows; i++){
            System.out.print("|");
            for (int j = 0; j < columns; j++){
                System.out.printf("%5s",String.valueOf(matrix[i][j]));
            }
            System.out.println("|");
        }
        long[][] matrixT = new long[columns][rows];
        System.out.println("Transportation of matrix:");
        for (int i = 0; i < columns; i++){
            System.out.print("|");
            for (int j = 0; j < rows; j++){
                matrixT[i][j] = matrix[j][i];
                System.out.printf("%5s",String.valueOf(matrixT[i][j]));
            }
            System.out.println("|");
        }
        long sum = 0;
        for (int i = 0; i < rows; i++){
            long temp = matrixT[0][i];
            for (int j = 0; j < columns; j++){
                if(matrixT[j][i] < temp)
                    temp = matrixT[j][i];
            }
            sum += temp;
        }
        System.out.printf("The sum of the smallest elements: "+ sum + "\n");
    }
}
