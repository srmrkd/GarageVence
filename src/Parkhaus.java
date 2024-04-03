import java.util.HashMap;
import java.util.Map;

public class Parkhaus {
    private Map<Integer, Etage> etagen;

    //Konstruktur-Flexibel für die Anzahl von Etagen und Parkplätze
    public Parkhaus(int anzahlEtagen, int parkplaetzeProEtage){
        etagen = new HashMap<>();
        for(int i=0; i<anzahlEtagen; i++){
            etagen.put(i+1, new Etage(parkplaetzeProEtage));
        }
    }

    //Methode, um ein Fahrzeug in das Parkhaus einzufahren
    public boolean einfahren(Fahrzeug fahrzeug){
        //jede etage Überprüfen, um einen Platz zu finden
        for(Etage etage: etagen.values()){
            for(ParkPlatz parkplatz: etage.getParkPlaetze()){
                if(parkplatz.istFrei()){
                    parkplatz.einparken(fahrzeug);
                    return true;
                }
            }
        }
        return false;
    }

    //Methode, um ein Fahrzeug aus dem Parkhaus auszufahren
    public boolean verlassen(Fahrzeug fahrzeug){
        for(Etage etage: etagen.values()){
            for(ParkPlatz parkplatz: etage.getParkPlaetze()){
                if(parkplatz.getFahrzeug() == fahrzeug){
                    parkplatz.verlassen();
                    return true;
                }
            }
        }
        return false; // Ausfahrt nicht möglich
    }


    //Methode, nach der Position eines Fahrzeugs zu fragen
    public String findePosition(Fahrzeug fahrzeug) {
        for(int i=0; i<etagen.size(); i++){
            for(int j=0; j<etagen.get(i).getParkPlaetze().size(); j++){
                if(etagen.get(i).getParkPlaetze().get(j).getFahrzeug() == fahrzeug){
                    return "Etage: " + (i+1) + ", Parkplatz: " + (j+1);
                }
            }
        }
        return "Fahrzeug nicht gefunden";
    }


    //Methode, um die Anzahl der noch freien Parkplätze abzufragen
    public int anzahlFreieParkplaetze() {
        int count = 0;
        for (Etage etage : etagen.values()) {
            for (ParkPlatz parkplatz : etage.getParkPlaetze()) {
                if (parkplatz.istFrei()) {
                    count++;
                }
            }
        }
        return count;
    }
}

