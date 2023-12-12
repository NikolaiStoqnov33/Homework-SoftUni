import java.util.Scanner;

public class last7 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = 997;

        for (int i = 7; i <= n; i += 10) {
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}
