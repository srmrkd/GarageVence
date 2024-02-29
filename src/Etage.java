import java.util.LinkedList;
import java.util.List;

public class Etage {
    public int etagenNr;
    public int reihenZahl;
    public int spaltenZahl = 2;
    public List<ParkPlatz> besetzePlaetze;
   
    public Etage(int etagenNr, int reihenZahl){
        this.etagenNr = etagenNr;
        this.reihenZahl = reihenZahl; 
        this.besetzePlaetze = new LinkedList<>();
    }

    public ParkPlatz platzFinden(){
        int totalPlaetze = reihenZahl * spaltenZahl;
        if(totalPlaetze <= besetzePlaetze.size()){
            //parkhaus voll
            return null;
        }else if(besetzePlaetze.isEmpty()){
            return new ParkPlatz(0, 0, etagenNr);
        }else{

        }
        return null;
    }

    // ist es möglich in dieser Etage zu parken?
    public boolean einparken(Fahrzeug fahrzeug){
        ParkPlatz freierPlatz = platzFinden();
        if(freierPlatz == null){
            return false;
        }else{
            // hier einparken
            freierPlatz.einparken(fahrzeug);
            besetzePlaetze.add(freierPlatz);
            return true;
        }
    }
}
