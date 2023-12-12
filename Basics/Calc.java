import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int people = Integer.parseInt(scanner.nextLine());
         String season = scanner.nextLine();
         double cost = 0.00;

         switch (season){
             case "spring":
                 if (people <= 5){
                     cost = people * 50.00;
                 } else {
                     cost = people * 48.00;
                 }
                 break;
             case "summer":
                 if (people <= 5){
                     cost = people * 48.50;
                 } else {
                     cost = people * 45.00;
                 }
                 cost = cost - (cost * 0.15);
                 break;
             case "autumn":
                 if (people <= 5){
                     cost = people * 60.00;
                 } else {
                     cost = people * 49.50;
                 }
                 break;
             case "winter":
                 if (people <= 5){
                     cost = people * 86.00;
                 } else {
                     cost = people * 85.00;
                 }
                 cost = cost + (cost * 0.08);
                 break;
         }
        System.out.printf("%.2f leva.", cost);
    }
}
