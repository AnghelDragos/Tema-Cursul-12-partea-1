package p2;

public class Angajat{
    public String nume;
    public int age;
    public double salary;
    public int zileLibere;

    public Angajat(String nume, int age, double salary, int zileLibere){
        this.nume=nume;
        this.age=age;
        this.salary=salary;
        this.zileLibere=zileLibere;
    }

    public void munceste(){
        System.out.println("Acest angajat munceste");
    }

    public boolean cerereLiber(int zileLibereCerute){
        if(zileLibereCerute<=zileLibere){
            System.out.println("Cererea de concediu este aprobata");
            return true;
        }
        else{
            System.out.println("Cererea de concediu pentru " + nume+ " nu este aprobata");
            return false;
        }
    }
}
