import java.util.Scanner;

public class minValu {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());
     int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());

         if (numbers > maxValue){
             maxValue = numbers;
         }
        }

        System.out.println(maxValue);

    }
}
