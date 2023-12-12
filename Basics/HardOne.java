import java.util.Scanner;

public class HardOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstB = scanner.nextLine();
        String lasttB = scanner.nextLine();
        String except = scanner.nextLine();

        String input = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        int startFrom = 0;
        int end = 0;
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < 26; i++) {
                String calc1 = input.charAt(i) + "";

                if (firstB.equals(calc1)) {
                    startFrom = i;
                }
                if (lasttB.equals(calc1)) {
                    end = i;
                    flag = false;
                    break;
                }
            }
        }

            for (int i = startFrom; i <= end; i++) {
                String calc1 = input.charAt(i) + "";
                if (except.equals(calc1)) {
                    continue;
                }
                for (int j = startFrom; j <= end; j++) {
                    String calc2 = input.charAt(j) + "";
                    if (except.equals(calc2)) {
                        continue;
                    }
                    for (int k = startFrom; k <= end; k++) {
                        String calc3 = input.charAt(k) + "";
                        if (except.equals(calc3)) {
                            continue;
                        }

                        count++;
                        System.out.print(calc1 + calc2 + calc3 + " ");
                    }
                }
            }
        System.out.println(count);
        }
    }
