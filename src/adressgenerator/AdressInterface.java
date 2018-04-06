/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adressgenerator;

/**
 *
 * @author Schulung
 */
public interface AdressInterface {
   
 public final static String[] VORNAME = {"Uwe","Andreas","Max","Moritz","Susi",
    "Steffi","Janine","Tim","Tom","Marko","Hans","Thomas","Maria","Bernd","Mandy",
    "Ben","Thorsten","Sabine","Ines","Isabell","Maria","Nicole","Sabrina","Jenny",
    "Klaus","Heinz","Sabrina", "Tatjana","Felix","Patricia-Elisabeth","Maria Theresia"};
    // Nachnamen-Array
 public final static String[] NACHNAME = {"Meier","Meyer","Mayer","Müller","Schulze","Lehmann",
    "Köster","Schmidt","Schuster","Wagner","Schmied","Küster","Möller","Berger","Grünwald","Meier-Lehmann",
    "Schulze-Müller","von Fallersleben-Burghausen","Maier","Hausen"};
 
    // ein paar Initiale, könnte man auch aus den Namen entnehmen
 public final static String[] INITIAL = {" "," "," "," "," A. "," B. "," C. "," D. "," E. "," "," "};
    // Für Adressen der Form 10a oder b
 public final static String[] ADRESSINITIAL ={"","a","b","c","d","","","","","",""};
    // Adresszusätze
 public final static String[] ADDRESSZUSATZ = {"bei Schmidt","c/o Schmidt","p.Adr. Max Mustermann"};
    // Ortsnamen sind zusammengesetzt aus Präfix und Suffix
 public final static String[] ORTSPREFIX = {"Wald","Wiesen","Groß","Klein","Mittel","Ober","Ham","Nieder","Alt","Alten",
    "Königs","Langen","Moos","Mühl","Morgen","Schön","Tannen","Vogel","Wolfen","Kirch","Bären","Heide","Hohen","Breiten","Ehren","Eber",
    "Fichten","Grün","Roten", "Ehr"};
 public final static String[] ORTSSUFFIX = {"heim","dorf","hausen","burg","ow","au","furt","stein","aue","finow","tal","thal"};
 
    // Straßen setzen sich ebenso zusammen aus Präfix und Suffix
 public final static String[] STRASSENPREFIX = {"Sieges","Kaiser Willhelm","Konrad Adenauer","Drossel","Finken","Wasser","Sonnen","Schiller","Goethe","Nachtigall","Spatzen"};
 public final static String[] STRASSENSUFFIX = {"straße","weg","gasse","allee","platz"};
 
    // Domains für die Email-Adresse
 public final static String[] TLD ={".info",".de",".com",".info",".net",".eu",".it"};
 public final static String[] DOMAIN = {"web", "example", "hotmail", "gmail", "yahoo", "aol", "gmx", "msn", "live", "googlemail", "free", "outlook"};
}
