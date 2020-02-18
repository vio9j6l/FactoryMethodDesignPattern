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
        Animal dog = SimpleAnimalFactory.buildAnimal("dog");
        Animal cat = SimpleAnimalFactory.buildAnimal("cat");
        Animal bird = SimpleAnimalFactory.buildAnimal("bird");

        dog.setName("Fido");
        showOff(dog);

        cat.setName("Toonces");
        showOff(cat);

        bird.setName("Tweety");
        showOff(bird);
    }

}
