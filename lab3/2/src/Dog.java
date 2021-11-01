public abstract class Dog
{
    private String breed, name;
    private float age;

    public Dog(String b, String n, float a)
    {
        breed = b;
        name = n;
        age = a;
    }

    public String getBreed()
    {
        return breed;
    }

    public String getName()
    {
        return name;
    }

    public float getAge()
    {
        return age;
    }
}
