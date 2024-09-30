import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the virtual pet game!");
        System.out.println("What type of pet would you like to create?");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Puppy");

        int petChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.println("What would you like to name your pet?");
        String petName = scanner.nextLine();

        Pet pet;
        switch (petChoice) {
            case 1:
                pet = new Dog("Prueba");
                break;
            case 2:
                pet = new Cat(petName, 5, 50, 50, 100, false, 50);
                break;
            case 3:
                pet = new Puppy(petName, 1, 50, 50, 100, false, 50);
                break;
            default:
                System.out.println("Invalid choice. Creating a default Dog.");
                pet = new Dog(petName, 5, 50, 50, 100, false, 50);
        }

        VirtualPetGame game = new VirtualPetGame(pet);

        System.out.println("You have created a " + pet.getClass().getSimpleName() + " named " + pet.getName() + ".");

        boolean continuePlaying = true;

        while (continuePlaying) {
            String petType = pet.getClass().getSimpleName().toLowerCase();
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Play with the " + petType);
            System.out.println("2. Feed the " + petType);
            System.out.println("3. Take the " + petType + " to the vet");
            System.out.println("4. Check " + petType + "'s status");
            System.out.println("5. Make " + petType + " sound");
            System.out.println("6. Special action");
            System.out.println("7. Pass time");
            System.out.println("8. Quit game");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    game.play();
                    break;
                case 2:
                    game.feed();
                    break;
                case 3:
                    game.takeToVet();
                    break;
                case 4:
                    game.showStatus();
                    break;
                case 5:
                    game.makeSound();
                    break;
                case 6:
                    game.specialAction();
                    break;
                case 7:
                    game.passTime();
                    break;
                case 8:
                    continuePlaying = false;
                    System.out.println("Thanks for playing!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

}
    
