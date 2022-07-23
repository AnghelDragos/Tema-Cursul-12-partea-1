package Problema2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1", 1,1,"Mancarea preferata 1");
        Cat cat2 = new Cat("Cat2", 2, 2, "Mancarea preferata 2");
        Cat cat3 = new Cat("Cat3", 3, 3, "Mancarea preferata 3");

        Dog dog1 = new Dog("Dog1",1,1);
        Dog dog2 = new Dog("Dog2",2,2);
        Dog dog3 = new Dog("Dog3",3,3);

        Animal[] arr1 = {cat1,cat2,cat3,dog1,dog2,dog3};

        showAverageAge(arr1);
        afiseazaPisici(arr1);
        latra(arr1);

    }

    public static void latra(Animal[] animals){ // metodele trebuie sa fie statice
        for(Animal a:animals){
            if(a instanceof Dog){
                a.scoateSunet();
            }

        }
    }

    public static void afiseazaPisici(Animal[] animals){
        for(Animal a:animals){
            if(a instanceof Cat){
                a.afiseazaAnimal();
            }

        }

    }

    public static int showAverageAge(Animal[] arrAlMetodei){
        int averageAge=0;
        int counter=0;
        for(Animal a:arrAlMetodei){
            averageAge+=a.age;
            counter++;
        }
        System.out.println("Varsta medie a animalelor este: " + averageAge/counter);
        return(averageAge/counter);
    }
}
