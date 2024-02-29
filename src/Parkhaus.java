import java.util.List;

public class Parkhaus {
    public static List<Etage> etagen;

    public Parkhaus(List<Etage> etagen){
        this.etagen = etagen;
    }

    public boolean einparken(Fahrzeug fahrzeug){
        //jede etage Überprüfen, um einen Platz zu finden
        for(Etage etage: etagen){
            if(etage.einparken(fahrzeug)){
                return true;
            }else{
                continue;
            }
        }
        return false;
    }
}
