import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         while (true){
             String n = scanner.nextLine();

             if (n.equals("Stop")){
                 break;
             }

             System.out.println(n);
         }

    }
}
