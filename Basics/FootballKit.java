import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double tShirt = Double.parseDouble(scanner.nextLine());
         double shorts = tShirt * 0.75;
         double socks =  shorts * 0.20;
         double boots = (tShirt + shorts) * 2;
         double costForBall = Double.parseDouble(scanner.nextLine());

         double allCost = tShirt + shorts + socks + boots;
         allCost = allCost - (allCost * 0.15);
         if (allCost > costForBall){
             System.out.println("Yes, he will earn the world-cup replica ball!");
             System.out.printf("His sum is %.2f lv.", allCost);
         } else {
             System.out.println("No, he will not earn the world-cup replica ball.");
             System.out.printf("He needs %.2f lv. more.", costForBall - allCost);
         }
    }
}
