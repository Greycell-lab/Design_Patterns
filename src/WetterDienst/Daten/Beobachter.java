package WetterDienst.Daten;

public interface Beobachter {
    void aktualisieren(double temperatur, double luftfeuchtigkeit, double luftdruck);
}
