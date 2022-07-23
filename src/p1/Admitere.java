package p1;

public class Admitere {
    private static double ultimaMedie;
    private static int locuriTotale;
    private static int locuriOcupate;

    static {
        ultimaMedie=5;
        locuriTotale=10;
    }


    public double getUltimaMedie(){
        return ultimaMedie;
    }

    public int getLocuriTotale(){
        return locuriTotale;
    }

    public int getLocuriOcupate(){
        return locuriOcupate;
    }

    public void setUltimaMedie(double ultimaMedie){
        this.ultimaMedie=ultimaMedie;
    }

    public void setLocuriTotale (int locuriTotale){
        this.locuriTotale = locuriTotale;
    }

    public void setLocuriOcupate (int locuriOcupate){
        this.locuriOcupate = locuriOcupate;
    }

    public static boolean acceptaStudent(Student student){
        if(locuriOcupate == locuriTotale){
            System.out.println("Studentul nu poate fi acceptat, s-au ocupat numarul maxim de locuri");
            return false;
        }
        else if(student.getMedieAdmitere()>ultimaMedie){
            System.out.println("Studentul " + student.getNume()+ " a fost admis");
            locuriOcupate+=1;
            return true;
        }
        else{
            System.out.println("Studentul" + student.getNume()+ " nu a avut media suficient de mare pentru a fi admis");
            return false;
        }
    }

    void schimbaFacultate(Student student, String facultateNoua){
        student.setFacultate(facultateNoua);
    }

}
