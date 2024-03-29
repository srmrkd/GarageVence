public class App {
    public static void main(String[] args) throws Exception {
        
        Parkhaus venceParkhaus = new Parkhaus(3, 2);

        Auto mercedes = new Auto("SU 147");
        Auto volkswagen = new Auto("K 2420");
        Motorrad toSi = new Motorrad("B 27");

        venceParkhaus.einfahren(mercedes);
        venceParkhaus.einfahren(volkswagen);
        venceParkhaus.einfahren(toSi);

        System.out.println("Position von mercedes: " + venceParkhaus.findePosition(mercedes));

        System.out.println("Position von mercedes: " + venceParkhaus.findePosition(toSi));

        System.out.println("Anzahl der freien Plätze: " + venceParkhaus.anzahlFreieParkplaetze());

        venceParkhaus.verlassen(volkswagen);

        System.out.println("Anzahl der freien Plätze: " + venceParkhaus.anzahlFreieParkplaetze());

        
    }
}
