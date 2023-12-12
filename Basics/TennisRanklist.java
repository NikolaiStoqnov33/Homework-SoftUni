import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());
         int startPoints = Integer.parseInt(scanner.nextLine());
         int allPoints = startPoints;
         double wins = 0;

        for (int i = 0; i < n; i++) {
            String type = scanner.nextLine();


            if (type.equals("W")){
                allPoints = allPoints + 2000;
                wins = wins + 1;
            } else if (type.equals("F")) {
                allPoints = allPoints + 1200;
            } else if (type.equals("SF")) {
                allPoints = allPoints + 720;
            }
        }
        double kk = allPoints - startPoints;
        double sredPoints =kk / n;
        double procent = (wins / n) * 100;

        System.out.printf("Final points: %d \n", allPoints);
        System.out.printf("Average points: %.0f \n", Math.floor(sredPoints));
        System.out.printf("%.2f%%", procent);
    }
}
