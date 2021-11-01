public abstract class Furniture
{
    private String material, type, available;
    private float price;

    public Furniture(String m, String t, float p)
    {
        material = m;
        type = t;
        price = p;
    }

    public abstract void getInfo();

    public float getPrice()
    {
        return price;
    }

    public String getMaterial()
    {
        return material;
    }

    public String getType()
    {
        return type;
    }

    public void setMaterial(String m)
    {
        material = m;
    }

    public void setPrice(float p)
    {
        price = p;
    }

    public void setType(String t)
    {
        type = t;
    }

    public String IsAvailable()
    {
        return available;
    }
}
