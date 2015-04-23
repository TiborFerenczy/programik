package Wrapper;

public class Wrap {

    Wrap(String s) {
        if (s.equalsIgnoreCase("Warrior")) {
           Warrior w = new Warrior();
           w.melee();
        }
        if (s.equalsIgnoreCase("Mage")) {
            Mage m = new Mage();
            m.ranged();
        }


    }
}
