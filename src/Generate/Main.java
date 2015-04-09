package Generate;



public class Main {

    public static void main(String[] args) {


        FactorySite fs = new FactorySite();
        Site o1 = fs.pick();
      //  Site o2 = fs.pick();
        o1.generate();
       // o2.generate();


    }
}
