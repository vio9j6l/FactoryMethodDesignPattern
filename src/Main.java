/*
 Course: IST 311
 Instructor: Phil O'Connell (pxo4)
 Student: Your Name
 Email: Your PSU email
*/

public class Main
{
    public static void showOff(Animal animal) {
        System.out.println(animal.getName() + ":");
        System.out.println("  Speak: '" + animal.speak() + "'");
        System.out.println("  Fly: " + animal.fly());
        System.out.println();
    }


    public static void main(String[] args) {
        //IAnimalFactory factory = new AnimalFacroyRandom();
        AnimalFactoryBag factory = new AnimalFactoryBag();

        System.out.println(factory.makeAnimal().getClass().getName());
        System.out.println(factory.makeAnimal().getClass().getName());
        System.out.println(factory.makeAnimal().getClass().getName());
        System.out.println("=======================");

        System.out.println(factory.makeAnimal().getClass().getName());
        System.out.println(factory.makeAnimal().getClass().getName());
        System.out.println(factory.makeAnimal().getClass().getName());
        System.out.println("=======================");

        System.out.println(factory.makeAnimal().getClass().getName());
        System.out.println(factory.makeAnimal().getClass().getName());
        System.out.println(factory.makeAnimal().getClass().getName());
        System.out.println("=======================");

    }

}
