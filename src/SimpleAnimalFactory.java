public class SimpleAnimalFactory
{
  public static Animal buildAnimal(String animalType) {
    Animal animalInstance = null;

    if (animalType == "dog") {
      animalInstance = new Dog();
    } else if (animalType == "cat") {
      animalInstance = new Cat();
    } else if (animalType == "bird") {
      animalInstance = new Bird();
    }

    return animalInstance;

  }
}
