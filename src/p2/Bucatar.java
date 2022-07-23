package p2;

public class Bucatar extends Angajat{
    int nrFeluriMancareStiute;
    String felPreferat;

    public Bucatar(String nume, int age, double salary, int zileLibere, int nrFeluriMancareStiute, String felPreferat){
        super(nume, age, salary, zileLibere);
        this.nrFeluriMancareStiute=nrFeluriMancareStiute;
        this.felPreferat=felPreferat;
    }

    @Override
    public void munceste(){
        System.out.println("Bucatarul "+ nume + " stie sa gateasca " + nrFeluriMancareStiute + " iar felul preferat este " + felPreferat);
    }
}
