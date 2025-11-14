package inheritance;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter 1 for bird, 2 for cat, 3 for fish");
        int choice = keyboard.nextInt();
        keyboard.nextLine();

        if (choice == 1) {
            System.out.println("Eye color of the bird: ");
            String EyeColor = keyboard.nextLine();
            System.out.println("Age of the bird: ");
            float Age = keyboard.nextFloat();
            System.out.println("weight of the bird: ");
            float Weight = keyboard.nextFloat();
            keyboard.nextLine();

            System.out.println("Location: ");
            String Location = keyboard.nextLine();
            System.out.println("Feather color");
            String FeatherColor = keyboard.nextLine();
            System.out.println("Wingspan");
            String Wingspan = keyboard.nextLine();
            System.out.print("Beak Type: ");
            String BeakType = keyboard.nextLine();

            bird bird = new bird(EyeColor, Age, Weight, Location, FeatherColor, Wingspan, BeakType);
            System.out.println("\n" + bird);
            bird.squawk();
            bird.fly();

        } else if (choice == 2) {
            System.out.print("Eye color of cat: ");
            String EyeColor = keyboard.nextLine();

            System.out.print("Age of cat: ");
            float Age = keyboard.nextFloat();

            System.out.print("Weight of cat: ");
            float Weight = keyboard.nextFloat();
            keyboard.nextLine();

            System.out.print("Location: ");
            String Location = keyboard.nextLine();

            System.out.print("Fur color: ");
            String FurColor = keyboard.nextLine();

            System.out.print("Whisker color: ");
            String WhiskerColor = keyboard.nextLine();

            System.out.print("Fur length: ");
            String FurLength = keyboard.nextLine();

            System.out.print("Number of toes: ");
            int ToeNumber = keyboard.nextInt();

            cat cat = new cat(EyeColor, Age, Weight, Location, FurColor, WhiskerColor, FurLength, ToeNumber);
            System.out.println("\n" + cat);
            cat.meow();
            cat.groom();
            cat.purr();

        } else if (choice == 3) {
            System.out.print("Eye color of fish: ");
            String EyeColor = keyboard.nextLine();
            System.out.print("Age of fish: ");
            float Age = keyboard.nextFloat();
            System.out.print("Weight of fish: ");
            float Weight = keyboard.nextFloat();
            keyboard.nextLine();
            System.out.print("Location: ");
            String Location = keyboard.nextLine();
            System.out.print("Jawless (true/false): ");
            boolean Jawless = keyboard.nextBoolean();
            keyboard.nextLine();
            System.out.print("Skeleton type: ");
            String SkeletonType = keyboard.nextLine();
            System.out.print("Dorsal fin (true/false): ");
            boolean DorsalFin = keyboard.nextBoolean();
            keyboard.nextLine();
            System.out.print("Body type: ");
            String BodyType = keyboard.nextLine();

            fish fish = new fish(EyeColor, Age, Weight, Location, Jawless, SkeletonType, DorsalFin, BodyType);
            System.out.println("\n" + fish);
            fish.swim("forward");
            fish.eatLight();

        } else {
            System.out.println("Invalid choice.");
        }

    }
}
