package Problema1;

public class Ziar extends Publicatie{
    private String sursa;

    public void setTitluSiSursa(String titlu, String sursa){
        setTitlu(titlu);
        this.sursa = sursa;
    }

    @Override
    public String getType(){
        return "Ziar";
    }

    @Override
    public String getDetalii(){
        return "titlul este: " + getTitlu() + " si sursa este: " + sursa;
    }





}
