package Generate;
import java.util.Random;

public class FactorySite {

Random r = new Random();
//int a= r.nextInt(1)+1;
int a=1;

    public Site pick() {
        if (a==2) {
            return new SiteGal();
        }
        if (a==1) {
            return new SiteInf();
        }
        return null;
    }
}
