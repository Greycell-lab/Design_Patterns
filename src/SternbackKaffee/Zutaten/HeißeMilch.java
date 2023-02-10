package SternbackKaffee.Zutaten;

import SternbackKaffee.Getränke.Getränk;

public class HeißeMilch extends ZutatenDekorierer{
    public HeißeMilch(Getränk getränk) {
        this.getränk = getränk;
    }
    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibung() + ", Heiße Milch";
    }
    @Override
    public double preis() {
        return 0.10 + getränk.preis();
    }
}
