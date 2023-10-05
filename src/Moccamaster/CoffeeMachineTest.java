package Moccamaster;

class Drink {
    private String name;
    private String size;
    private boolean whippedCream;

    public Drink(String name, String size, boolean whippedCream) {
        this.name = name;
        this.size = size;
        this.whippedCream = whippedCream;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public boolean hasWhippedCream() {
        return whippedCream;
    }
}

// Klasse til at repræsentere en kop
class Cup {
    private Drink drink;

    public Cup(Drink drink) {
        this.drink = drink;
    }

    public String getContents() {
        String size = drink.getSize();
        String name = drink.getName();
        String cream = drink.hasWhippedCream() ? "med flødeskum" : "uden flødeskum";
        return size + " " + name + " " + cream;
    }
}

// Klasse til kaffemaskinen
class CoffeeMachine {
    public Cup serve(String drinkName, String size, boolean whippedCream) {
        Drink drink = new Drink(drinkName, size, whippedCream);
        return new Cup(drink);
    }
}

public class CoffeeMachineTest {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        // Bestil nogle drikke
        Cup cup1 = coffeeMachine.serve("Sort kaffe", "Medium", false);
        Cup cup2 = coffeeMachine.serve("Latte Machiatto", "Large", true);
        Cup cup3 = coffeeMachine.serve("Chokoladedrik", "Small", true);

        // Vis bestilte drikke
        System.out.println("Drikke lavet:");
        System.out.println("1. " + cup1.getContents());
        System.out.println("2. " + cup2.getContents());
        System.out.println("3. " + cup3.getContents());
    }
}