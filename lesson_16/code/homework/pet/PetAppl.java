package homework.pet;

import homework.pet.type.Pet;

public class PetAppl {
    public static void main(String[] args) {

        Pet pet1 = new Pet( 1,  " Dog ",   5,  " Mike ");
        Pet pet2= new Pet( 2,   " Mouse ", 2,  " White ");
        Pet pet3= new Pet( 3,  " Shark ",  5,   " Jaws ");
        Pet pet4 = new Pet( 4,  "Tiger ",  10,   " Amur ");
        pet1.displayPet();
        pet2.displayPet();
        pet3.displayPet();
        pet4.displayPet();

        double averageAll = ((pet1.getAge() + pet2.getAge() + pet4.getAge() + pet4.getAge())/4);
        System.out.println("Average = " + averageAll);

        pet1.go();
        pet2.meat();
        pet4.sleep();
        pet3.meat();
    }

}
