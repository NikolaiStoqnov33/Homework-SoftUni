import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int comps = Integer.parseInt(scanner.nextLine());
        double reiting = 0.00;
      double  count = 0;
      double seals = 0;


        for (int i = 0; i < comps; i++) {
            int reit = Integer.parseInt(scanner.nextLine());

            reiting += reit % 10;
            count++;
          double reitForsel = reit % 10;
         double  Sseals = (reit - reitForsel) / 10;
          double percent = 0;

          switch ((int) reitForsel){
              case 2:
                  seals += 0;
                  break;
              case 3:
                  seals += Sseals * 0.5;
                  break;
              case 4:
                  seals += Sseals * 0.7;
                  break;
              case 5:
                  seals += Sseals * 0.85;
                  break;
              case 6:
                  seals += Sseals * 1;
                  break;
          }
        }
        System.out.printf("%.2f%n", seals);
        System.out.printf("%.2f", reiting / count);


    }
}
