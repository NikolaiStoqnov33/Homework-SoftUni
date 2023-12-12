import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String type = scanner.nextLine();
         String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
         double price = 0.00;

         switch (city){
             case "Sofia":
                 switch (type){
                     case "coffee":
                         price = 0.50;
                         break;
                     case  "water":
                         price = 0.80;
                         break;
                     case  "beer":
                         price = 1.20;
                         break;
                     case  "sweets":
                         price = 1.45;
                         break;
                     case  "peanuts":
                         price = 1.60;
                         break;
                 }
                 break;
             case "Plovdiv":
                 switch (type){
                     case "coffee":
                         price = 0.40;
                         break;
                     case  "water":
                         price = 0.70;
                         break;
                     case  "beer":
                         price = 1.15;
                         break;
                     case  "sweets":
                         price = 1.30;
                         break;
                     case  "peanuts":
                         price = 1.50;
                         break;
                 }
                 break;
             case "Varna":
                 switch (type){
                     case "coffee":
                         price = 0.45;
                         break;
                     case  "water":
                         price = 0.70;
                         break;
                     case  "beer":
                         price = 1.10;
                         break;
                     case  "sweets":
                         price = 1.35;
                         break;
                     case  "peanuts":
                         price = 1.55;
                         break;
                 }
                 break;
         }
        System.out.printf("%.2f",price * amount);
    }
}
