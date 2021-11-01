import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Human human = new Human();
        Human.Head headpar = human.new Head(1,1);
        System.out.println("Введите длину головы:");
        headpar.setLenght(scanner.nextFloat());
        System.out.println("Введите ширину головы:");
        headpar.setWidth(scanner.nextFloat());

        Human.Hand handpar = human.new Hand(1,1);
        System.out.println("Введите длину руки:");
        handpar.setLenght(scanner.nextFloat());
        System.out.println("Введите ширину руки:");
        handpar.setWidth(scanner.nextFloat());


        Human.Leg legpar = human.new Leg(1,1);
        System.out.println("Введите длину ноги:");
        legpar.setLenght(scanner.nextFloat());
        System.out.println("Введите ширину ноги:");
        legpar.setWidth(scanner.nextFloat());

        System.out.println("HeadLen: " + headpar.getLenght());
        System.out.println("HeadWid: " + headpar.getWidth());
        System.out.println("HandLen: " + handpar.getLenght());
        System.out.println("HandWid: " + handpar.getWidth());
        System.out.println("LegLen: " + legpar.getLenght());
        System.out.println("LegWid: " + legpar.getWidth());

    }
}
