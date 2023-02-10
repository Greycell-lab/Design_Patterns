package SternbackKaffee.Zutaten;

import SternbackKaffee.Getränke.Getränk;

public class Schoko extends ZutatenDekorierer{
    public Schoko(Getränk getränk) {
        this.getränk = getränk;
    }
    @Override
    public String getBeschreibung() {
        return getränk.getBeschreibung() + ", Schoko";
    }
    @Override
    public double preis() {
        if(getGröße() == GRÖSSE.TALL) return 0.20 + getränk.preis();
        else if(getGröße() == GRÖSSE.GRANDE) return 0.25 + getränk.preis();
        else if(getGröße() == GRÖSSE.VENTI) return 0.30 + getränk.preis();
        return getränk.preis();
    }

    @Override
    public GRÖSSE getGröße() {
        return getränk.getGröße();
    }
}
