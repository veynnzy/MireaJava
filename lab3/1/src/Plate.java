class Plate extends Dish
{
    private String type, availability;
    public Plate(float r, String c, String t, String a)
    {
        super(r, c);
        type = t;
        availability = a;
    }
    public void displayInfo()
    {
        System.out.println("Type: " + type + "; Radius: " + super.getRadius() + "; Color: " + super.getColor() + "; Availability: " + availability);

    }

    public String getAvailability()
    {
        return availability;
    }

    public void setAvailability(String a)
    {
        availability = a;
    }
}


