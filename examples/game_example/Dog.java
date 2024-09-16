/**
 * Clase Dog: Subclase de Pet.
 * Demuestra herencia y polimorfismo.
 */
public class Dog extends Pet {
    private int loyaltyLevel;

    public Dog(String name) {
        super(name);
        this.loyaltyLevel = 50;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof woof!");
    }

    @Override
    public void specialAction() {
        System.out.println(name + " fetches the ball.");
        loyaltyLevel = Math.min(100, loyaltyLevel + 10);
        happinessLevel = Math.min(100, happinessLevel + 20);
    }

    @Override
    public void play() {
        super.play();
        loyaltyLevel = Math.min(100, loyaltyLevel + 5);
        System.out.println(name + " becomes more loyal.");
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("Loyalty level: " + loyaltyLevel + "%");
    }
}