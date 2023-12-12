import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int downBorder = Integer.parseInt(scanner.nextLine());
        int upBorder = Integer.parseInt(scanner.nextLine());

        for (int i = downBorder; i <= upBorder; i++) {

            String textNum = String.valueOf(i);

            int oddNum = 0;
            int evenNum = 0;
            for (int j = 0; j < textNum.length(); j++) {

                int num = Integer.parseInt(textNum.charAt(j)+ "");


                if (j % 2 == 0){
                    evenNum += num;
                } else {
                   oddNum += num;
                }
            }
         if (oddNum == evenNum){
             System.out.print(i + " ");
         }

        }
    }
}
