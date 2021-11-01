class Doberman extends Dog
{
    private String color;
    private float height;
    public Doberman(String b, String n, float a, String c, float h)
    {
        super(b, n, a);
        color = c;
        height = h;
    }

    public String getColor()
    {
        return color;
    }

    public float getHeight()
    {
        return height;
    }

    public void getInfo()
    {
        System.out.println("Breed: " + super.getBreed());
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Color: " + color);
        System.out.println("Height: " + height);
    }
}
