package p1;

import static p1.Admitere.acceptaStudent;

public class Student {
    private String nume;
    private String facultate;
    private double medieAdmitere; // poate sa fie intre 1 si 10

    public Student(String nume, String facultate, double medieAdmitere){
        this.nume=nume;
        this.facultate=facultate;
        this.medieAdmitere=medieAdmitere;
    }

    public String getNume(){
        return nume;
    }

    public String getFacutate(){
        return facultate;
    }

    public double getMedieAdmitere(){
        return medieAdmitere;
    }

    public void setMedieAdmitere(double medieAdmitere) {
        this.medieAdmitere = medieAdmitere;
    }

    public void setFacultate(String facultate){
        this.facultate = facultate;
    }

    public void afiseaza(){
        System.out.println("Numele studentului este: " + getNume()+ ", facultatea aleasa de el este: " + getFacutate() + ", media lui de admitere este: "+getMedieAdmitere());
    }
}
