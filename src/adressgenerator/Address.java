package adressgenerator;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Random;





public class Address implements AdressInterface{
    private String lastName;
    private String firstName;
    private String ort;
    private String plz;
    private String strasse;
    private String email;
   
    /*
    * Minimaler Konstruktor
    */
    
    public Address() {
       startGenerate();
    }    
   
   
    public Address(String lastName) {
       this.lastName = lastName;
    }

    public Address(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
        startGenerate();
    }
    
    
    /**
    * Vollständiger Kontruktor; Dieser enthält alle Attribute dieses
    * Objektes und erleichtert die Erzeugung von neuen Objekten
    */
   
    public Address(String lastName, String firstName, String ort, String plz, String strasse, String email) {
       
        this.lastName = lastName;
        this.firstName = firstName;
        this.ort = ort;
        this.plz = plz;
        this.strasse = strasse;
        this.email = email;
    }

   
   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

  
    
   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

  
   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   
   
    public void startGenerate() {
        boolean email = true;
        
        // Zahlenformat, um PLZ der Form 0xxxx darzustellen
        DecimalFormat format = new DecimalFormat("00000");
   
         // initialisiere den Zufallszahlengenerator
        Random generator = new Random();
        
        //generierung beginnt
       
        // Generiere Vor- und Nachnamen
        this.firstName = VORNAME[generator.nextInt(VORNAME.length)];
        this.lastName = NACHNAME[generator.nextInt(NACHNAME.length)];
           
  
        // Generiere Strassennamenss.
        this.strasse = (STRASSENPREFIX[generator.nextInt(STRASSENPREFIX.length)] 
                     + STRASSENSUFFIX[generator.nextInt(STRASSENSUFFIX.length)] 
                     + " " + generator.nextInt(99) 
                      + ADRESSINITIAL[generator.nextInt(ADRESSINITIAL.length)]);
                       // Generiere PLZ und Ortsnamen
        this.plz = (format.format(generator.nextInt(99999)));
        this.ort = (ORTSPREFIX[generator.nextInt(ORTSPREFIX.length)] 
                  + ORTSSUFFIX[generator.nextInt(ORTSSUFFIX.length)]);

           

        // Wenn Email-Adressen generiert werden sollen, dann
        // ersetze Umlaute und generiere die Adresse
        if (email == true) {
            String name = this.firstName.toLowerCase() + "." 
                          + this.lastName.toLowerCase();
        
            name = name.replaceAll("ä", "ae");
            name = name.replaceAll("ö", "oe");
            name = name.replaceAll("ü", "ue");
            name = name.replaceAll("ß", "ss");
            name = name.replaceAll(" ", "_");


            this.email=(name + "@" + DOMAIN[generator.nextInt(DOMAIN.length)]
                    + TLD[generator.nextInt(TLD.length)]);
            //Ausgabe
               
           

          
        }

    }
 
    @Override
    public String toString(){
        return this.strasse + " " 
                + this.plz+" "
                + this.ort+" ";
    } 
}