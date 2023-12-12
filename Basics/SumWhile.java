import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
         int N = 0;

         while (!(N >= n)){
          int   M = Integer.parseInt(scanner.nextLine());
             N = N + M;

         }
        System.out.println(N);
    }
}
