public class Auto extends Fahrzeug {
    
    public Auto(String ID){
        super(ID);
    }

    @Override
    public void befahren(){
        System.out.println("Ein Auto möchte reingefahren!");

    }
    
}
