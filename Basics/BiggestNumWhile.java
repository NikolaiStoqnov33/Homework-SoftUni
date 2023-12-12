import java.util.Scanner;

public class BiggestNumWhile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


     int Min = Integer.MIN_VALUE;
     String text = scanner.nextLine();
     while (!text.equals("Stop")){
         int num = Integer.parseInt(text);
         if (num > Min){
             Min = num;
         }
         text = scanner.nextLine();
     }
        System.out.println(Min);

    }
}
