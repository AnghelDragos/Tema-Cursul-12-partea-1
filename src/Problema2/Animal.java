package Problema2;

public class Animal {
    String name;
    int age;
    double weight;

    public Animal(String name, int age, double weight){
        this.name=name;
        this.age = age;
        this.weight=weight;
    }

    void scoateSunet(){
        System.out.println("Sunet de animal");
    }

    void afiseazaAnimal(){
        System.out.println("Numele animalului este: " + name);
        System.out.println("Varsta animalului este: " + age);
        System.out.println("Greutatea animalului este: " + weight);
    }


}
