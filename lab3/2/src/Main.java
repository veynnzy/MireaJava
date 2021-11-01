public class Main
{
    public static void main(String[] args)
    {
        Retriever r = new Retriever("Retriever", "Tom", 10, "yellow", 18);
        Doberman d = new Doberman("Doberman", "Nick", 8, "Black", 10);
        r.getInfo();
        System.out.println();
        d.getInfo();

    }

}
