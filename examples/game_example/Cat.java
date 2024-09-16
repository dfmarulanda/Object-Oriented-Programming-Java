/**
 * Clase Cat: Subclase de Pet.
 * Demuestra herencia y polimorfismo.
 */
public class Cat extends Pet {
    private int independenceLevel;

    public Cat(String name) {
        super(name);
        this.independenceLevel = 50;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow!");
    }

    @Override
    public void specialAction() {
        System.out.println(name + " chases a toy mouse.");
        independenceLevel = Math.min(100, independenceLevel + 10);
        happinessLevel = Math.min(100, happinessLevel + 15);
    }

    @Override
    public void play() {
        super.play();
        independenceLevel = Math.min(100, independenceLevel + 5);
        System.out.println(name + " becomes more independent.");
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("Independence level: " + independenceLevel + "%");
    }
}