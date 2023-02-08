package WetterDienst;

public class Main {
    public static void main(String[] args) {
        WetterDaten wetterDaten = new WetterDaten();
        AktuelleBedingungen aktuelleBedingungen = new AktuelleBedingungen(wetterDaten);
        wetterDaten.setMesswerte(12.5, 65, 0.5);
        wetterDaten.setMesswerte(22.3, 32, 21.4);
    }
}
