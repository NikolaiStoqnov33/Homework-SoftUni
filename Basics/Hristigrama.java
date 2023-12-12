import java.util.Scanner;

public class Hristigrama {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());

         double p1 = 0;
         double p2 = 0;
         double p3 = 0;
         double p4 = 0;
         double p5 = 0;

        for (int i = 0; i < n; i++) {
            int numb = Integer.parseInt(scanner.nextLine());

            if (numb < 200){
                p1 += 1;

            } else if (numb <= 399) {
                p2 += 1;

            } else if (numb <= 599) {
                p3 += 1;

            } else if (numb <= 799) {

                p4 += 1;
            } else if (numb >= 800) {
                p5 += 1;
            }

        }

        p1 = (p1 / n) * 100;
        p2 = (p2 / n) * 100;
        p3 = (p3 / n) * 100;
        p4 = (p4 / n) * 100;
        p5 = (p5 / n) * 100;


        System.out.printf("%.2f",p1);
        System.out.print("% \n");
        System.out.printf("%.2f",p2);
        System.out.print("% \n");
        System.out.printf("%.2f",p3);
        System.out.print("% \n");
        System.out.printf("%.2f",p4);
        System.out.print("% \n");
        System.out.printf("%.2f",p5);
        System.out.print("% \n");
    }
}
