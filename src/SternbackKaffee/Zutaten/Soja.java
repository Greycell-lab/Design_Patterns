package SternbackKaffee.Zutaten;

import SternbackKaffee.Getränke.Getränk;

public class Soja extends ZutatenDekorierer{
    public Soja(Getränk getränk){
        this.getränk = getränk;
    }
    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibung() + ", Soja";
    }
    @Override
    public double preis() {
        return 0.15 + getränk.preis();
    }
}
