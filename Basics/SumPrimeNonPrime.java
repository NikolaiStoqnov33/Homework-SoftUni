import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();
        int prime = 0;
        int nonPrime = 0;

         while (!input.equals("stop")){

             int num = Integer.parseInt(input);

             boolean flag = true;
             for (int i = 2; i <= num - 1; i++) {

                 if (num < 0){
                     break;
                 } else if (num % i == 0){
                     flag = false;
                     break;
                 }
             }
             if (num < 0){
                 System.out.println("Number is negative.");
             } else if (flag){
                 prime += num;
             } else {
                 nonPrime += num;
             }
             input = scanner.nextLine();
         }

        System.out.printf("Sum of all prime numbers is: %d%n",prime);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrime);


    }
}
