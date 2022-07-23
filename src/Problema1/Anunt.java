package Problema1;

public class Anunt extends Publicatie{
    private int zilePanaExpira;
    public void setTitluSiZilePanaExpira(String titlu, int zilePanaExpira){
        setTitlu(titlu);
        this.zilePanaExpira=zilePanaExpira;
    }

    @Override
    public String getType(){
        return "Anunt";
    }

    public String getDetalii(){
        return "Titlul este: " + getTitlu() + " si numarul de zile pana expira articolul este: " + zilePanaExpira;
    }

}
