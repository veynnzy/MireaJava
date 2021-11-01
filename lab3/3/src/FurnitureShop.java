import java.util.ArrayList;

public class FurnitureShop
{
    public FurnitureShop()
    {
        furnitures = new ArrayList<Furniture>();
    }

    public void AddFurniture(Furniture furniture)
    {
        furnitures.add(furniture);
    }

    public void PrintAllFurnitures()
    {
        for (int i = 0; i < furnitures.size(); i++)
            furnitures.get(i).getInfo();
    }

    ArrayList<Furniture> furnitures;
}
