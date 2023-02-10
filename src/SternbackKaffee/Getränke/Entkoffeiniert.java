package SternbackKaffee.Getränke;

public class Entkoffeiniert extends Getränk{
    public Entkoffeiniert() {
        beschreibung = "Entkoffeiniert";
    }

    @Override
    public double preis() {
        return 1.05;
    }
}
