import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
         boolean flag = false;

        for (int a = 1; a <= 9; a++) {
            if (flag){
                break;
            }
            for (int b = 9; b > a; b--) {
                if (flag){
                    break;
                }
                for (int c = 0; c <= 9; c++) {
                    if (flag){
                        break;
                    }
                    for (int d = 9; d > c; d--) {

                        if (a + b + c + d == a * b *c * d && n % 10 == 5){
                            System.out.printf("%d",a);
                            System.out.printf("%d",b);
                            System.out.printf("%d",c);
                            System.out.printf("%d",d);
                            flag = true;
                            break;
                        }

                        if (((a * b * c * d) / (a + b + c + d)) == 3 && n % 3 == 0 ) {
                            System.out.printf("%d", d);
                            System.out.printf("%d", c);
                            System.out.printf("%d", b);
                            System.out.printf("%d", a);
                            flag = true;
                            break;
                        }
                    }
                }
            }
        }
        if (!flag){
            System.out.println("Nothing found");
        }
    }
}