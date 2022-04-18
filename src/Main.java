import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Dog fluffy = new Dog("Fluffy", "pomeranian");
        fluffy.printPetInfo();

        ArrayList<Pet> petList = new ArrayList<Pet>();

        /* put your code segment for part (b) here */
        Pet pet1 = new Pet("Floppy", "rabbit");
        Dog pet2 = new Dog("Arty", "pug");

        petList.add(pet1);
        petList.add(pet2);

        PetOwner owner1 = new PetOwner(pet1, "Jerry");
        owner1.printOwnerInfo();
        PetOwner owner2 = new PetOwner(pet2, "Kris");
        owner2.printOwnerInfo();

    }
}
