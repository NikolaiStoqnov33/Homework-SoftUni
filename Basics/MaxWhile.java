import java.util.Scanner;

public class MaxWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int Max = Integer.MAX_VALUE;
        String text = scanner.nextLine();
        while (!text.equals("Stop")){
            int num = Integer.parseInt(text);
            if (num < Max){
                Max = num;
            }
            text = scanner.nextLine();
        }
        System.out.println(Max);

    }
}
