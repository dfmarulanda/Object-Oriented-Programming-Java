
public class Puppy extends Dog {
    public Puppy(String name, int age, int hungerLevel, int happinessLevel, int energyLevel, boolean isSick, int loyaltyLevel) {
        super(name, age, hungerLevel, happinessLevel, energyLevel, isSick, loyaltyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof de puppy");
    }

    @Override
    public void specialAction() {
        System.out.println("The puppy is playing with a ball of yarn.");
    }
}
    