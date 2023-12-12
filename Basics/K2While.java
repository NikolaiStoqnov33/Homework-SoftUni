import java.util.Scanner;

public class K2While {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
     int n = Integer.parseInt(scanner.nextLine());
     int m = 1;
        System.out.println(m);
     while (!( n <= m)){
          m = (m * 2)+ 1;
          if (n < m){
              break;
          }
         System.out.println(m);

     }

    }
}
