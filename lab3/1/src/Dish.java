public abstract class Dish
{
    private float radius; private String color;

    public Dish(float r, String c)
    {
        radius = r;
        color = c;
    }

    public float getRadius()
    {
        return radius;
    }
    public String getColor()
    {
        return color;
    }

    public void setRadius(float r)
    {
        radius = r;
    }

    public void setColor(String c)
    {
        color = c;
    }


}

