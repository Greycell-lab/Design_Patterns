package WetterDienst.Anzeige;

import WetterDienst.Daten.Beobachter;
import WetterDienst.Daten.Subjekt;

public class AktuelleBedingungen implements AnzeigeElement, Beobachter {
    private double temperatur;
    private double luftfeuchtigkeit;
    Subjekt wetterDaten;
    public AktuelleBedingungen(Subjekt wetterDaten){
        this.wetterDaten = wetterDaten;
        wetterDaten.registriereBeobachter(this);
    }
    @Override
    public void aktualisieren(double temperatur, double luftfeuchtigkeit, double luftdruck) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        anzeigen();
    }
    @Override
    public void anzeigen() {
        System.out.println("Aktuelle Wetterbedingungen: " + temperatur
                + " Grad Celcius und " + luftfeuchtigkeit + "% Luftfeuchtigkeit");
    }
}
