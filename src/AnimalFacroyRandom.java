import java.util.concurrent.ThreadLocalRandom;

public class AnimalFacroyRandom implements IAnimalFactory {

    @Override
    public Animal makeAnimal() {
        Animal randomAnimal = null;

        //global random generator, choose random number among 0, 1, 2
        int randomInt = ThreadLocalRandom.current().nextInt(3);

        switch (randomInt) {
            case 0:
                randomAnimal = new Dog();
                break;
            case 1:
                randomAnimal = new Cat();
                break;
            case 2:
                randomAnimal = new Bird();
                break;
        }
        return randomAnimal;
    }
}
