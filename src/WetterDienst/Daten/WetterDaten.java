package WetterDienst.Daten;

import java.util.ArrayList;

public class WetterDaten implements Subjekt{
    private ArrayList<Beobachter> beobachter;
    private double temperatur;
    private double luftfeuchtigkeit;
    private double luftdruck;

    public WetterDaten(){
        beobachter = new ArrayList<>();
    }
    @Override
    public void registriereBeobachter(Beobachter beobachter) {
        this.beobachter.add(beobachter);
    }

    @Override
    public void entferneBeobachter(Beobachter beobachter) {
        int i = this.beobachter.indexOf(beobachter);
        if(i >= 0) this.beobachter.remove(beobachter);
    }

    @Override
    public void benachrichtigeBeobachter() {
        for(Beobachter b : beobachter){
            b.aktualisieren(temperatur, luftfeuchtigkeit, luftdruck);
        }
    }
    public void messwerteGeändert(){
        benachrichtigeBeobachter();
    }
    public void setMesswerte(double temperatur, double luftfeuchtigkeit, double luftdruck){
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.luftdruck = luftdruck;
        messwerteGeändert();
    }
}
