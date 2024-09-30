public class Cat extends Pet {
    private int independenceLevel;

    public Cat(String name, int age, int hungerLevel, int happinessLevel, int energyLevel, boolean isSick, int independenceLevel) {
        super(name, age, hungerLevel, happinessLevel, energyLevel, isSick);
        this.independenceLevel = independenceLevel;
    }

    public int getIndependenceLevel() {
        return independenceLevel;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void specialAction() {
        System.out.println("The cat is playing with a ball of yarn.");
    } 
  
}