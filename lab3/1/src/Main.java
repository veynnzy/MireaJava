import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);

        Plate plate = new Plate(20, "White", "Plate", "Yes");
        plate.setColor(scl.nextLine());
        plate.setRadius(scn.nextFloat());
        plate.setAvailability(scl.nextLine());

        Vase vase = new Vase(10, "Black", "England", "Vase");
        vase.setColor(scl.nextLine());
        vase.setRadius(scn.nextFloat());
        vase.setManufacturer(scl.nextLine());

        plate.displayInfo();
        vase.displayInfo();
    }
}
