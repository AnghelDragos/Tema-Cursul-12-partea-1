package p2;

public class Programator extends Angajat{
    String limbajProgramare;
    String editorCod;

    public Programator(String nume, int age, double salary, int zileLibere, String limbajProgramare, String editorCod){
        super(nume, age, salary, zileLibere);
        this.limbajProgramare=limbajProgramare;
        this.editorCod=editorCod;
    }

    public boolean cerereLiber(int zileLibereCerute){
        //super(zileLibereCerute);
        return (super.cerereLiber(zileLibereCerute));
    }

    @Override
    public void munceste(){
        System.out.println("Programatorul cu numele " + nume + " scrie cod " + limbajProgramare + "in editorul " + editorCod);
    }
}
