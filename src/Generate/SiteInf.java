package Generate;

import java.io.BufferedWriter;
import java.util.Random;
import java.io.PrintWriter;

public class SiteInf implements Site {
    
    @Override
    public void generate() {
        
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        
        for (int i = 0; i < 50000; i++) {  
            int a = r.nextInt(122 - 97) + 97;
            if (i%100==0)s.append("<br>");
             if (i%r.nextInt(10)==0)s.append(" ");
            s.append((char) a);
        }
       
        
        
        try {
            PrintWriter pw = new PrintWriter("Strona_Informacyjna.html");
            BufferedWriter bw = new BufferedWriter(pw);
            bw.write(s.toString());
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        
    }
}
