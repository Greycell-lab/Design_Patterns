package SternbackKaffee.Zutaten;

import SternbackKaffee.Getränke.Getränk;

public abstract class ZutatenDekorierer extends Getränk {
    Getränk getränk;
    public abstract String getBeschreibung();
}
