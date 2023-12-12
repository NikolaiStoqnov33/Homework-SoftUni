import java.util.Scanner;

public class PcStore {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double procesor =Double.parseDouble(scanner.nextLine());
         double videoCard = Double.parseDouble(scanner.nextLine());
         double RAM = Double.parseDouble(scanner.nextLine());
         int amountRAM = Integer.parseInt(scanner.nextLine());
         double percent = Double.parseDouble(scanner.nextLine());

         double allPrice = 0;
         double videoProcesor = 0;
         double procesorVideo = 0;


         allPrice += (RAM * amountRAM) * 1.57;

         videoProcesor = videoCard * 1.57;
         videoProcesor = videoProcesor - (videoProcesor * percent);

         procesorVideo =  procesor * 1.57;
         procesorVideo = procesorVideo - (procesorVideo * percent);

         allPrice += videoProcesor + procesorVideo;
        System.out.printf("Money needed - %.2f leva.", allPrice);

    }
}
