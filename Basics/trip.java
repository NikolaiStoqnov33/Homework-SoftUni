import java.util.Scanner;

public class trip {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int sea = Integer.parseInt(scanner.nextLine());
         int mount = Integer.parseInt(scanner.nextLine());
         int profit = 0;
         
         String input = scanner.nextLine();
        while (!input.equals("Stop")){
            
            if (input.equals("sea")){
                if (sea > 0){
                    sea = sea - 1;
                    profit += 680;
                } 
            } else if (input.equals("mountain")) {
                if (mount > 0){
                    mount = mount - 1;
                    profit += 499;
                }
            }
            if (sea + mount == 0){
                break;
            }
            input = scanner.nextLine();
        }
         if (sea + mount == 0){
             System.out.println("Good job! Everything is sold.");
             System.out.printf("Profit: %d leva.",profit);
         } else {
             System.out.printf("Profit: %d leva.",profit);
         }
    }
}
