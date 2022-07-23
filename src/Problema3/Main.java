package Problema3;

import p1.*;
import static p1.Admitere.acceptaStudent;
import p2.*;


public class Main {
    public static void main(String[] args) {
    Student student1 = new Student("Nume1", "Facultate1", 6.0);
    acceptaStudent(student1);

    Student student2 = new Student("Nume2", "Facultate2", 7.0);
    acceptaStudent(student2);

    Student student3 = new Student("Nume3", "Facultate3", 8.0);
    acceptaStudent(student3);

    Student[] array1 = {student1,student2,student3};
    for(Student s:array1){
        s.afiseaza();
    }

    System.out.println("Mai jos este rezolvarea problemei 4: ");
    Angajat angajat1 = new Angajat("Angajat1",20,1000,5);
    angajat1.munceste();
    angajat1.cerereLiber(4);

    Programator programator1=new Programator("Programtor1", 22, 2000,10,"Java","IntelliJ");
    programator1.munceste();
    programator1.cerereLiber(10);

    Bucatar bucatar1 = new Bucatar("Bucatar1",20,1300,7,20,"Friptura");
    bucatar1.munceste();
    bucatar1.cerereLiber(10);

    Angajat[] arrAngajati = {angajat1, programator1, bucatar1};
    System.out.println("Media salariala a tuturor angajatilor este: " + calculMediaSalariilorPentruAnajati(arrAngajati));
    }

    public static double calculMediaSalariilorPentruAnajati(Angajat[] arrayCuAngajatiPeCareIlIntroducemInMetoda){
        double sumaSalariu=0;
        int counterNrAngajati=0;
        for(Angajat a:arrayCuAngajatiPeCareIlIntroducemInMetoda){
            sumaSalariu=sumaSalariu+ a.salary;
            counterNrAngajati++;
        }
        return(sumaSalariu/counterNrAngajati);
    }

}
