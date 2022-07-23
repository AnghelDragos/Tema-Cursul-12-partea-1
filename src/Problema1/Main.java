package Problema1;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Publicatie publicatie1= new Publicatie();
        publicatie1.setTitlu("Titlul publicatiei 1");

        Ziar ziar1 = new Ziar();
        ziar1.setTitluSiSursa("Titlul ziarului 1", "Sursa ziarului 1");

        Articol articol1 = new Articol();
        articol1.setTitluSiAutor("Titlul articolului 1", "Autorul articolului 1");

        Anunt anunt1 = new Anunt();
        anunt1.setTitluSiZilePanaExpira("Titlul anuntului 1", 5);

        Publicatie[] arrayPublicatii = {publicatie1, ziar1, articol1, anunt1};
        for(Publicatie p:arrayPublicatii){
            p.getInfo();
        }

        // alternativ
        // mai jos adaugam obiectele in un ArrayList si trecem prin fiecare element cu un for
        ArrayList<Publicatie> arrayList1 = new ArrayList<>();
        arrayList1.add(publicatie1);
        arrayList1.add(ziar1);
        arrayList1.add(articol1);
        arrayList1.add(anunt1);

        for(Publicatie a : arrayList1){
            a.getInfo();
        }


    }
}
