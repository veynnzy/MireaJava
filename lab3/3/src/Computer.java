class Computer extends Furniture
{
    private String room;
    public Computer(String m, String t, float p, String r)
    {
        super(m, t, p);
        room = r;
    }

    @Override
    public void getInfo()
    {
        System.out.println("Room: " + room);
        System.out.println("Type: " + super.getType());
        System.out.println("Material: " + super.getMaterial());
        System.out.println("Price: " + super.getPrice());
        System.out.println();
    }
}
