public class ParkPlatz {
    public int reihenNr;
    public int spaltenNr;
    public int etage;
    Fahrzeug fahrzeug = null;


    ParkPlatz(int reihenNr, int spaltenNr, int etage){
        this.reihenNr = reihenNr;
        this.spaltenNr = spaltenNr;
        this.etage = etage;
    }

    public void einparken(Fahrzeug fahrzeug){
        if(this.fahrzeug == null){
            this.fahrzeug = fahrzeug;
        }else{
            System.out.println("Parkplatz schon besetzt!");
        }
    } 
}

