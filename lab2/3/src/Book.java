public class Book
{
    private String author, name;
    private int year, pages;


    public Book(String a, String n, int y, int p)
    {
        author = a;
        name = n;
        year = y;
        pages = p;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getName()
    {
        return name;
    }

    public float getYear()
    {
        return year;
    }

    public float getPages()
    {
        return pages;
    }

    public void setAuthor(String a)
    {
        author = a;
    }

    public void setName(String n)
    {
       name = n;
    }

    public void setYear(int y)
    {
        year = y;
    }

    public void setPages(int p)
    {
        pages = p;
    }
}
