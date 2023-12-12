import java.util.Scanner;

public class PasswordWhile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String name= scanner.nextLine();
         String password = scanner.nextLine();
         String pass = scanner.nextLine();

         while (!pass.equals(password)){
             pass = scanner.nextLine();
         }
         
        System.out.printf("Welcome %s!",name);

    }
}
