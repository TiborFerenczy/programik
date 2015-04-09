package Factory;


public class FactoryOsoba {

    protected String g;
FactoryOsoba(String k)
{
    g=k;
}

    public Osoba whois() {
        if (g.equals("m")) {
            return new OsobaM();
        }
        if (g.equals("k")) {
            return new OsobaK();
        }
        return null;
    }
}
