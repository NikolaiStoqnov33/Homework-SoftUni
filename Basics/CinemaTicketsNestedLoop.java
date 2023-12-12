import java.util.Scanner;

public class CinemaTicketsNestedLoop {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
         int totalTick = 0;
        double student = 0;
        double standard = 0;
        double kid = 0;
         while (!input.equals("Finish")){

             double tickets = 0;

             double seats = Double.parseDouble(scanner.nextLine());
             String type = scanner.nextLine();
             while (!type.equals("End")){

                 if (type.equals("student")){
                     student++;
                 } else if (type.equals("standard")) {
                     standard++;
                 } else if (type.equals("kid")) {
                     kid++;
                 }
                 tickets++;
                 totalTick++;
                 if (tickets == seats){
                     break;
                 }
                 type = scanner.nextLine();
             }
             System.out.printf("%s - %.2f%% full.%n",input,(tickets / seats) * 100);
             input = scanner.nextLine();
         }
        System.out.printf("Total tickets: %d%n",totalTick);
        System.out.printf("%.2f%% student tickets.%n",(student / totalTick) * 100);
        System.out.printf("%.2f%% standard tickets.%n",(standard / totalTick) * 100);
        System.out.printf("%.2f%% kids tickets.%n",(kid / totalTick) * 100);

    }
}
