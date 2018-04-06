
package adressgenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author schulung
 */
public class AdressGenerator {

    public static void main(String[] args) {
        List<Address> adressen=new ArrayList<>();
        for(int i=0;i<11;i++){
            Address a = new Address();
            adressen.add(a);
            System.out.println("Ausgabe:"+a.toString());
      }
        System.out.println("Anzahl der Adressen="+adressen.size());
    }
    
}
