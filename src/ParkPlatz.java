public class ParkPlatz {
    private Fahrzeug fahrzeug = null;

    //Methode zu überprüfen, ob der Parkplatz frei ist
    public boolean istFrei(){
        return fahrzeug == null;
    }

    public void einparken(Fahrzeug fahrzeug){
        if(this.fahrzeug == null){
            this.fahrzeug = fahrzeug;
        }else{
            System.out.println("Parkplatz schon besetzt!");
        }
    }

    public void verlassen(){
        this.fahrzeug = null;
    }

    // Methode, um das Fahrzeug auf dem Parkplatz abzurufen
    public Fahrzeug getFahrzeug(){
        return fahrzeug;
    }
}

