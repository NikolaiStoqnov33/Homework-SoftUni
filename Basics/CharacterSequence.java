import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String n = scanner.nextLine();

         int numb = n.length();

        for (int i = 0; i < numb ; i++) {
            char symbol = n.charAt(i);
            System.out.println(symbol);
        }

    }
}
