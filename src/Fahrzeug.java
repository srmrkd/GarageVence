public class Fahrzeug {
    public String ID;

    public Fahrzeug(String ID){
        this.ID = ID;
    }

    public void befahren(){
        System.out.println("Ich möchte reinfahren!");
    }
    
    public void verlassen(){
        System.out.println("Ich möchte rausfahren!");
    }

}
