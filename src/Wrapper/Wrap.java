package Wrapper;

public class Wrap implements Fight {

    Wrap(String s) {

        if (s.equalsIgnoreCase("Mage")) {
            ranged();
        }
        if (s.equalsIgnoreCase("Warrior")) {
            melee();
        }
    }

    @Override
    public void melee() {
        Warrior w = new Warrior();
        w.melee();
    }

    @Override
    public void ranged() {
        Mage m = new Mage();
        m.ranged();

    }
}
