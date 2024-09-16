/**
 * Clase abstracta Pet: Base para todas las mascotas del juego.
 * Demuestra conceptos de POO como encapsulación, métodos abstractos y herencia.
 */
public abstract class Pet {
    // Atributos protegidos (accesibles por las subclases)
    protected String name;
    protected int age;
    protected int hungerLevel;
    protected int happinessLevel;
    protected int energyLevel;
    protected boolean isSick;

    // Constructor
    public Pet(String name) {
        this(name, 0, 50, 50, 100, false);
    }

    // Constructor sobrecargado
    public Pet(String name, int age, int hungerLevel, int happinessLevel, int energyLevel, boolean isSick) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
        this.happinessLevel = happinessLevel;
        this.energyLevel = energyLevel;
        this.isSick = isSick;
    }

    // Métodos abstractos que deben ser implementados por las subclases
    public abstract void makeSound();
    public abstract void specialAction();

    // Métodos comunes para todas las mascotas
    public void feed() {
        hungerLevel = Math.max(0, hungerLevel - 20);
        energyLevel = Math.min(100, energyLevel + 10);
        System.out.println(name + " has been fed.");
    }

    public void play() {
        happinessLevel = Math.min(100, happinessLevel + 15);
        energyLevel = Math.max(0, energyLevel - 20);
        hungerLevel = Math.min(100, hungerLevel + 10);
        System.out.println(name + " played and is happier!");
    }

    public void sleep() {
        energyLevel = 100;
        hungerLevel = Math.min(100, hungerLevel + 10);
        System.out.println(name + " slept and recovered all energy.");
    }

    public void passTtime() {
        age++;
        hungerLevel = Math.min(100, hungerLevel + 5);
        happinessLevel = Math.max(0, happinessLevel - 5);
        energyLevel = Math.max(0, energyLevel - 5);

        if (Math.random() < 0.05) {
            isSick = true;
            System.out.println("Oh no! " + name + " got sick.");
        }
    }

    public void heal() {
        if (isSick) {
            isSick = false;
            happinessLevel = Math.min(100, happinessLevel + 10);
            System.out.println(name + " has been healed and feels better.");
        } else {
            System.out.println(name + " is not sick.");
        }
    }

    public void showStatus() {
        System.out.println("\nStatus of " + name + ":");
        System.out.println("Type: " + this.getClass().getSimpleName());
        System.out.println("Age: " + age + " days");
        System.out.println("Hunger level: " + hungerLevel + "%");
        System.out.println("Happiness level: " + happinessLevel + "%");
        System.out.println("Energy level: " + energyLevel + "%");
        System.out.println("Is sick? " + (isSick ? "Yes" : "No"));
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getHungerLevel() { return hungerLevel; }
    public int getHappinessLevel() { return happinessLevel; }
    public int getEnergyLevel() { return energyLevel; }
    public boolean isSick() { return isSick; }
}