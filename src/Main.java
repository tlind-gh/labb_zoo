import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Add animal\n 2. View Animals\n 3. Show animal details\n 4. Remove animal\n 5. Exit ");
        ArrayList<String> animals = new ArrayList<>();
        ArrayList<String> animalDescriptions = new ArrayList<>();
        System.out.println(animals);
        Scanner sc = new Scanner(System.in);

        System.out.println("Select an option:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("What animal do you want to add: ");
                String animal = sc.nextLine();
                animals.add(animal);
                System.out.print("Describe the animal further: ");
                String description = sc.nextLine();
                animalDescriptions.add(description);
                System.out.println("\nAnimal has been added to the zoo.");
            case 2:
                //code read list
            case 3:
                //code read details of chosen animal
            case 4:
                //remove animal
            case 5:
                System.out.println("Program has been terminated.");

        }

    }
}