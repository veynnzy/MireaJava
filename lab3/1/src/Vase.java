class Vase extends Dish
{
    private String manufacturer;
    private String type;

    public Vase(float r, String c, String m, String t)
    {
        super(r, c);
        manufacturer = m;
        type = t;
    }

    public void displayInfo()
    {
        System.out.println("Type: " + type + "; Manufacturer: " + manufacturer + "; Radius: " + super.getRadius() + "; Color: " + super.getColor());
    }


    public void setManufacturer(String m)
    {
        manufacturer = m;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }
}
