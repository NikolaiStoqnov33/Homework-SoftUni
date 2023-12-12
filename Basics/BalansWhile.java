import java.util.Scanner;

public class BalansWhile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

     double amount = 0;
        String n = scanner.nextLine();
         while (!n.equals("NoMoreMoney")){
         double sum = Double.parseDouble(n);
         if (sum < 0 ){
             System.out.println("Invalid operation!");
             break;
         }
           amount = amount + sum;
             System.out.printf("Increase: %.2f \n", sum);
           n = scanner.nextLine();
         }


             System.out.printf("Total: %.2f",amount);

    }
}

