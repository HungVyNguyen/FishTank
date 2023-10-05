package Cat;

public class CatDoorTest {
    public static void main(String[] args) {
        // Opret katte
        Cat c1 = new Cat("chip1");
        Cat c2 = new Cat("chip2");
        Cat c3 = new Cat("chip3");
        Cat c4 = new Cat("chip4");
        Cat c5 = new Cat("chip5");
        Cat c6 = new Cat("chip6");

        // Opret kattelem
        CatDoor catDoor = new CatDoor();

        // Tilføj katte
        catDoor.addCat(c1);
        catDoor.addCat(c2);
        catDoor.addCat(c3);
        catDoor.addCat(c4);
        catDoor.addCat(c5);
        catDoor.addCat(c6);

        // Test med forskellige tilstande
        testMode(catDoor, Mode.IN_OUT, c1, c5, c6);
        testMode(catDoor, Mode.ONLY_IN, c1, c5, c6);
        testMode(catDoor, Mode.ONLY_OUT, c1, c5, c6);
        testMode(catDoor, Mode.CLOSED, c1, c5, c6);

        // Fjern alle registrerede katte
        catDoor.removeRegisteredCats();
        // Tilføj nogle andre katte
    }

    private static void testMode(CatDoor catDoor, Mode mode, Cat cat1, Cat cat2, Cat cat3) {
        catDoor.setMode(mode);

        System.out.println("Mode " + mode + ":");

        System.out.println(cat1.getChipId() + ": " + catDoor.canEnter(cat1));
        System.out.println(cat2.getChipId() + ": " + catDoor.canEnter(cat2));
        System.out.println(cat3.getChipId() + ": " + catDoor.canEnter(cat3));

        System.out.println();
    }
}