/**
 * Clase Main: Punto de entrada del programa.
 * Demuestra el uso de herencia y polimorfismo.
 */
public class Main {
    public static void main(String[] args) {
        // Creamos instancias de diferentes tipos de mascotas
        Pet dog = new Dog("Buddy");
        Pet cat = new Cat("Whiskers");

        // Creamos juegos para cada mascota
        VirtualPetGame dogGame = new VirtualPetGame(dog);
        VirtualPetGame catGame = new VirtualPetGame(cat);

        // Simulación de algunos días con el perro
        System.out.println("=== Dog Simulation ===");
        for (int day = 1; day <= 3; day++) {
            System.out.println("\n--- Day " + day + " with " + dog.getName() + " ---");
            dogGame.feed();
            dogGame.play();
            dogGame.makeSound();
            dogGame.specialAction();
            dogGame.showPetStatus();
            dogGame.passTtime();
        }

        // Simulación de algunos días con el gato
        System.out.println("\n=== Cat Simulation ===");
        for (int day = 1; day <= 3; day++) {
            System.out.println("\n--- Day " + day + " with " + cat.getName() + " ---");
            catGame.feed();
            catGame.play();
            catGame.makeSound();
            catGame.specialAction();
            catGame.showPetStatus();
            catGame.passTtime();
        }
    }
}