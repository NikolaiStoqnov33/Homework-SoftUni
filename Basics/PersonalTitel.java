import java.util.Scanner;

public class PersonalTitel {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

      double age = Double.parseDouble(scanner.nextLine());
         String gender = scanner.nextLine();
         String type = "";

         switch (gender){
             case "m":
                 if (age < 16){
                     type = "Master";
                 } else if (age >= 16) {
                     type = "Mr.";
                 }
                 break;
             case "f":
                 if (age < 16){
                     type = "Miss";
                 } else if (age >= 16) {
                     type = "Ms.";
                 }
                 break;
         }
        System.out.printf("%s",type);
    }
}
