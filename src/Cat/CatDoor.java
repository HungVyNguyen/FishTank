package Cat;

import java.util.ArrayList;
import java.util.List;

public class CatDoor {
    private List<Cat> registeredCats;
    private Mode mode;

    public CatDoor() {
        registeredCats = new ArrayList<>();
        mode = Mode.CLOSED;
    }

    public void setMode(Mode newMode) {
        mode = newMode;
    }

    public void addCat(Cat cat) {
        if (registeredCats.size() < 5) {
            registeredCats.add(cat);
        } else {
            System.out.println("Kattelemmen kan kun registrere op til fem katte.");
        }
    }

    public void removeRegisteredCats() {
        registeredCats.clear();
    }

    public boolean canEnter(Cat cat) {
        if (mode == Mode.CLOSED) {
            return false;
        }

        if (cat.isRegistered()) {
            return true;
        }

        if (mode == Mode.IN_OUT || mode == Mode.ONLY_OUT) {
            return true;
        }

        return false;
    }
}
