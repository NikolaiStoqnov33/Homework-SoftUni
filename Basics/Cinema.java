import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String projection = scanner.nextLine();
         int rows = Integer.parseInt(scanner.nextLine());
         int columns = Integer.parseInt(scanner.nextLine());
         double price = 0.00;

         switch (projection){
             case "Premiere":
                 price = 12.00;
                 break;
             case  "Normal" :
                 price = 7.50;
                 break;
             case  "Discount":
                 price = 5.00;
                 break;
         }

         int allSeats = rows * columns;
         double allPrice = allSeats * price;
         System.out.printf("%.2f",allPrice);

    }
}
