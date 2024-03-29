import java.util.ArrayList;
import java.util.List;

public class Etage {
    public List<ParkPlatz> parkplaetze;
   
    public Etage(int anzahlParkplaeze){
        this.parkplaetze = new ArrayList<>();
        for(int i=0; i < anzahlParkplaeze; i++){
            parkplaetze.add(new ParkPlatz());
        }
    }

    // Methode, um die Liste der Parkplätze auf der Etage abzurufen
    public List<ParkPlatz> getParkPlaetze(){
        return parkplaetze;
    }
}
