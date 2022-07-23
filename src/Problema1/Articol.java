package Problema1;

public class Articol extends Publicatie{
    private String autor;

    public void setTitluSiAutor(String titlu, String autor) {
        setTitlu(titlu);
        this.autor = autor;
    }

        @Override
        public String getType(){
            return "Articol";
        }

        @Override
        public String getDetalii(){
            return "Titlul este: " + getTitlu() + " si autorul este: " + autor;
        }
        

}
