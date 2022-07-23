package Problema2;

public class Cat extends Animal{
    String favouriteFood;

    public Cat (String name, int age, double weight, String favouriteFood){
        super(name, age, weight);
        this.favouriteFood=favouriteFood;
    }

    @Override
    void scoateSunet(){
        System.out.println("Miau miau");
    }

    @Override
    void afiseazaAnimal(){
        System.out.println("Numele pisicii este: " + name);
        System.out.println("Varsta pisicii este: " + age);
        System.out.println("Greutatea pisicii este: " + weight);
        System.out.println("Mancarea preferata a pisicii este: " + favouriteFood);
    }
}
