import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double budget = Double.parseDouble(scanner.nextLine());
         String season = scanner.nextLine();
         String where = null;
         double spendMoney = 0.00;
         String Where = null;

        if (budget <= 100){
            where = "Bulgaria";
            switch (season){
                case "summer":
                    spendMoney =(budget * 0.30);
                    Where = "Camp";
                    break;
                case "winter":
                    spendMoney = (budget * 0.70);
                    Where = "Hotel";
                    break;
            }
        } else if (budget <= 1000) {
            where = "Balkans";
            switch (season){
                case "summer":
                    spendMoney = (budget * 0.40);
                    Where = "Camp";
                    break;
                case "winter":
                    spendMoney =  (budget * 0.80);
                    Where = "Hotel";
                    break;
             }
        } else {    where = "Europe";
            Where = "Hotel";
            spendMoney =  (budget * 0.90);
        }

        System.out.printf("Somewhere in %s\n", where);
        System.out.printf("%s - %.2f",Where ,spendMoney  );
    }
}
