import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        String  Outfit = null;
        String Shoes = null;

        switch (day) {
            case "Morning":
                if ((degrees >= 10) && (degrees <= 18)) {
                    Outfit = "Sweatshirt";
                    Shoes = "Sneakers";
                }
                if ((degrees > 18) && (degrees <= 24)) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }
                if (degrees >= 25){
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if ((degrees >= 10) && (degrees <= 18)) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }
                if ((degrees > 18) && (degrees <= 24)) {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                }
                if (degrees >= 25) {
                    Outfit = "Swim Suit";
                    Shoes = "Barefoot";
                }
                break;
            case "Evening":
                if ((degrees >= 10) && (degrees <= 18)) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }
                if ((degrees > 18) && (degrees <= 24)) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }
                if (degrees >= 25) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.",degrees ,Outfit ,Shoes  );

    }

}











//         if ((degrees >= 10) && (degrees <= 18))
//        {
//            if (day.equals("Morning"))
//            {
//                Outfit = "Sweatshirt";
//                Shoes = "Sneakers";
//            }
//            if (day.equals("Afternoon"))
//            {
//                Outfit = "Shirt";
//                Shoes = "Moccasins";
//            }
//            if (day.equals("Evening"))
//            {
//                Outfit = "Shirt";
//                Shoes = "Moccasins";
//            }
//        }
//        if ((degrees > 18) && (degrees <= 24))
//        {
//                if (day.equals("Morning"))
//                {
//                    Outfit = "Shirt";
//                    Shoes = "Moccasins";
//                }
//
//                if (day.equals("Afternoon"))
//                {
//                    Outfit = "T-Shirt";
//                    Shoes = "Sandals";
//                {
//                if (day.equals("Evening"))
//                {
//                    Outfit = "Shirt";
//                    Shoes = "Moccasins";
//                }
//        }
//
//
//                if (degrees >= 25)
//                {
//                    if (day.equals("Morning"))
//                    {
//                        Outfit = "T-Shirt";
//                        Shoes = "Sandals";
//                    }
//                    if (day.equals("Afternoon"))
//                    {
//                        Outfit = "Swim Suit";
//                        Shoes = "Barefoot";
//                    }
//                    if (day.equals("Evening"))
//                    {
//                        Outfit = "Shirt";
//                        Shoes = "Moccasins";
//                    }
//                }
//                    System.out.printf("It's %d degrees, get your %s and %s.",degrees ,Outfit ,Shoes  );
//    }
//
//}}}
//
//
