import java.util.Scanner;

public class GraduadeWhile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int numMarks = 0;
         double sumMarks = 0.00;
         String name = scanner.nextLine();
         while (numMarks < 12){
             numMarks = numMarks + 1;
             double marks = Double.parseDouble(scanner.nextLine());

             if (marks <= 2 ){
                 System.out.printf("%s has been excluded at %d grade",name , numMarks);
             }
             sumMarks = sumMarks + marks;
         }

         double allMarks = sumMarks / numMarks;
        System.out.printf("%s graduated. Average grade: %.2f",name,allMarks);
    }
}
