package Problema1;
// Problema 1 - Publicatie & subclase

public class Publicatie {
    private String titlu;

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getType(){
        return "Publicatie";
    }

    public String getDetalii(){
        return "Titlul este: " + titlu;

    }

    public String getTitlu(){
        return titlu;
    }

    final void getInfo(){
        System.out.println (getType());
        System.out.println (getDetalii());
    }


}
