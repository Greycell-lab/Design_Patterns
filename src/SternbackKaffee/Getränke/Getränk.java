package SternbackKaffee.Getränke;

public abstract class Getränk {
    public enum GRÖSSE{
        TALL,
        GRANDE,
        VENTI;
    }
    GRÖSSE größe;
    String beschreibung = "Unbekanntes Getränk";
    public String getBeschreibung(){
        return beschreibung;
    }
    public abstract double preis();
    public GRÖSSE getGröße(){
        return größe;
    }
    public void setGröße(GRÖSSE größe){
        this.größe = größe;
    }
}
