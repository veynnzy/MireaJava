import java.util.Scanner;

public class BookTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book("Джоан Роулинг", "Гарри Поттер и Филосовский камень", 1995, 400);
        book.setAuthor(scanner.nextLine());
        book.setName(scanner.nextLine());
        book.setYear(scanner.nextInt());
        book.setPages(scanner.nextInt());

        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getName());
        System.out.println("Год написания: " + book.getYear());
        System.out.println("Кол-во страниц: " + book.getPages());
    }
}
