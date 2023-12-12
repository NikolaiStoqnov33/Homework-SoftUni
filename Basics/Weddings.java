import java.util.Scanner;

public class Weddings {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int mans = Integer.parseInt(scanner.nextLine());
         int women = Integer.parseInt(scanner.nextLine());
         int tables = Integer.parseInt(scanner.nextLine());
         int count = 0;

         for (int k = 1; k <= mans; k++) {
             if (count == tables){
                 break;
             }
             for (int j = 1; j <= women; j++) {
                    System.out.printf("(%d <-> %d) ",k,j);
                    count++;
                 if (count == tables){
                    break;
                 }
             }
         }
    }
}
