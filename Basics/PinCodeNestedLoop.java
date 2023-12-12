import java.util.Scanner;

public class PinCodeNestedLoop {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int firstNumMax = Integer.parseInt(scanner.nextLine());
         int secondNumMax = Integer.parseInt(scanner.nextLine());
         int thirdNumMax = Integer.parseInt(scanner.nextLine());
         boolean flag = true;

        for (int first = 1; first <= firstNumMax; first++) {
                if (first % 2 == 1){
                    continue;
                }
            for (int second = 2; second <= secondNumMax; second++) {

               switch (second){
                   case 4:
                   case 6:
                   case 8:
                   case 9:
                   continue;

               }
                for (int third = 1; third <= thirdNumMax; third++) {

                    if (third % 2 == 1) {
                        continue;
                    }
                        System.out.printf("%d %d %d%n",first,second,third);

                }
            }
        }

    }
}
