package SternbackKaffee.Getränke;

public class Espresso extends Getränk{
    public Espresso(){
        beschreibung = "Espresso";
    }
    @Override
    public double preis() {
        return 1.99;
    }
}
