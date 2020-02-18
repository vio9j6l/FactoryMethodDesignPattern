import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class AnimalFactoryBag implements IAnimalFactory {
    private enum AnimalType { DOG, CAT, BIRD };

    static Stack<AnimalType> animalTypes = new Stack<>();

    private static void initStack() {
        animalTypes.push(AnimalType.DOG);
        animalTypes.push(AnimalType.CAT);
        animalTypes.push(AnimalType.BIRD);

        // Shuffle around the order of items in the stack
        Collections.shuffle(animalTypes);
    }

    /*
     * Get next type off the stack
     * If the stack empty, fill it again
     */
    static private AnimalType getNextAnimalType() {
        // Have we used all the types
        if (animalTypes.size() == 0) {
            initStack();
        }
        return animalTypes.pop();
    }



    @Override
    public Animal makeAnimal() {
        Animal animal = null;

        AnimalType chosenType = getNextAnimalType();

        switch (chosenType) {
            case DOG:
                animal = new Dog();
                break;
            case CAT:
                animal = new Cat();
                break;
            case BIRD:
                animal = new Bird();
                break;
        }
        return animal;
    }
}
