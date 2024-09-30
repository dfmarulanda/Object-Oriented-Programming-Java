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

    public void takeToVet() {
        pet.taketoVet();
    }

    public void passTime() {
        pet.passTime();
        pet.checkHealth();
    }

    public void showStatus() {
        pet.showStatus();
    }

    public void makeSound() {
        pet.makeSound();
    }

    public void specialAction() {
        pet.specialAction();
    }

}
