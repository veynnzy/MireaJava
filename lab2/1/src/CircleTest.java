import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle circ = new Circle(5,1,1,1);
        Scanner scanner = new Scanner(System.in);
        circ.setCoordx(scanner.nextFloat());
        circ.setCoordy(scanner.nextFloat());
        circ.setCoordz(scanner.nextFloat());
        circ.setRadius(scanner.nextFloat());

        System.out.println("Новые координаты центра: (" + circ.getCoordx() + ", " + circ.getCoordy() + ", " + circ.getCoordz() + ")");
        System.out.println("Радиус: " + circ.getRadius());
    }
}
