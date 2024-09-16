/**
 * Clase VirtualPetGame: Maneja la lógica del juego y la interacción con la mascota.
 * Demuestra el principio de composición en POO y el uso de polimorfismo.
 */
public class VirtualPetGame {
    private Pet pet;

    public VirtualPetGame(Pet pet) {
        this.pet = pet;
    }

    public void play() {
        pet.play();
    }

    public void feed() {
        pet.feed();
    }

    public void sleep() {
        pet.sleep();
    }

    public void heal() {
        pet.heal();
    }

    public void passTtime() {
        pet.passTtime();
    }

    public void showPetStatus() {
        pet.showStatus();
    }

    public void makeSound() {
        pet.makeSound();
    }

    public void specialAction() {
        pet.specialAction();
    }
}