package SternbackKaffee;

import SternbackKaffee.Getränke.*;
import SternbackKaffee.Zutaten.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Getränk espresso = new Espresso();
        espresso.setGröße(Getränk.GRÖSSE.GRANDE);
        espresso = new Schoko(espresso);
        System.out.println(espresso.getBeschreibung() + " " + espresso.preis() + " €");
    }
    public void lower(){
        int c;
        try(InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")))){
            while((c=in.read()) >= 0){
                System.out.print((char)c);
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
