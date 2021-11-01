public class Main
{
    public static void main(String[] args)
    {
        FurnitureShop shop = new FurnitureShop();
        Wardrobe w = new Wardrobe("Tree", "Wardrobe", 5000, "Bedroom");
        Bed b = new Bed("Tree", "Bed", 1000, "Bedroom");
        TVset t = new TVset("Electronic device", "TV", 10000, "Living-room");
        Computer c = new Computer("Electronic device", "Computer", 8000, "Study");

        shop.AddFurniture(w);
        shop.AddFurniture(b);
        shop.AddFurniture(t);
        shop.AddFurniture(c);
        shop.PrintAllFurnitures();

    }
}
