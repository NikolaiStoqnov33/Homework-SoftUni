import java.util.Scanner;

public class SumFrom2NestedLoops {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int downInterval = Integer.parseInt(scanner.nextLine());
        int upInterval = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean flag = false;

        for (int i = downInterval; i <= upInterval; i++) {
            for (int j = downInterval; j <= upInterval; j++) {

                int result = i + j;
                count++;
                if (result == n){
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,result);
                   flag = true;
                   break;
                }
            }
            if (flag){
                break;
            }

        }
       if (!flag) {
            System.out.printf("%d combinations - neither equals %d",count,n);
        }
    }
}
