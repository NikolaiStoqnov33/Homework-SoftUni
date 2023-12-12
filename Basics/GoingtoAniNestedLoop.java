import java.util.Scanner;

public class GoingtoAniNestedLoop {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String plug2 = "s";

         String plug = scanner.nextLine();
         while (!plug.equals("End")  && !plug2.equals("End") ){
             double cost = 0;
             int budget = 0;

          cost = Double.parseDouble(scanner.nextLine());
         while  (budget <= cost){
             plug2 = scanner.nextLine();
             if (plug2.equals("End")){
                 break;
             }
             budget += Integer.parseInt(plug2);

             }
             System.out.printf("Going to %s!%n",plug);
             plug = scanner.nextLine();
         }
         }
    }

