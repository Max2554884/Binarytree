public class Ahne {
   private  String vorname,nachname;
   private char geschlecht;

   public void Ahne(String pVN, String pNN,char pG){
     nachname = pNN;
     vorname =  pVN;
     geschlecht = pG;
   }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }


    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }
}
