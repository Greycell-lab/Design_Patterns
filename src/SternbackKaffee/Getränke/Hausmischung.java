package SternbackKaffee.Getränke;

public class Hausmischung extends Getränk{
    public Hausmischung(){
        beschreibung = "Hausmischung";
    }
    @Override
    public double preis() {
        return 0.89;
    }
}
