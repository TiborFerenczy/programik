package Factory;


public class Main {

    public static void main(String[] args) {


        FactoryOsoba fo1 = new FactoryOsoba("m");
        FactoryOsoba fo2 = new FactoryOsoba("k");
        Osoba o1 = fo1.whois();
        Osoba o2 = fo2.whois();
        o1.greet();
        o2.greet();


    }
}
