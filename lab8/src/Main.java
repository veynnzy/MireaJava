import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<String, Pet> petsMap = new HashMap<String, Pet>();
        petsMap.put("first", new Cat("Mett"));
        petsMap.put("second", new Dog("Pineapple"));
        petsMap.put("third", new Owl("Melon"));

        System.out.println("Print hashmap");
        for(HashMap.Entry<String, Pet> entry : petsMap.entrySet())
            entry.getValue().SayHello();

        System.out.println("\nAdd elements\n");
        petsMap.put("fourth", new Dog("Laffi"));
        petsMap.put("fifth", new Cat("Fluffy"));

        System.out.println("Print hashmap");
        for(HashMap.Entry<String, Pet> entry : petsMap.entrySet())
            entry.getValue().SayHello();
    }
}
