public class Motorrad extends Fahrzeug {
    
    Motorrad(String ID){
        super(ID);
    }

    @Override
    public void befahren(){
        System.out.println("Ein Motorrad möchte reingefahren");
    }   
}
