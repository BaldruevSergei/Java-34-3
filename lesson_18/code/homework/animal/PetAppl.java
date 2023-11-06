package homework.animal;

import homework.animal.type.Cat;
import homework.animal.type.Dog;
import homework.animal.type.Petty;
import homework.pet.type.Pet;

public class PetAppl {
    public static void main(String[] args) {
        Petty cat1= new Cat("Murka", "Animal", "Cat","Simple", 15,5);
        Petty dog1 = new Dog("Box", "Animal", "dog", "Sheepdog", 50,20);
        cat1.toVoice();
        dog1.toVoice();

        Dog dog2 = new Dog("Irbis", "Animal", "Dog", "Masstiff",60,50);
        dog2.toVoice();
        dog2.toEat();

    }
}
