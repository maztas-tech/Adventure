import java.util.Scanner;

public class UserInterface {
    Adventure adventure;

    public void startProgram() {
        adventure = new Adventure();
        adventure.buildMap();


        Scanner keyboard = new Scanner(System.in);
        String userChoice;


        System.out.println("""
                Welcome to the adventure game!
                
                Exit - To exit the program!
                Help - For a tutorial!
                Look - To look around in your current room!
                """);


        do {
            System.out.println("""
                    East -> Go east
                    South -> Go south
                    West -> Go west
                    North -> Go north
                    """);
            userChoice = keyboard.nextLine().toLowerCase();
            switch (userChoice){
                case "help":
                    System.out.println("Write east/west/north/south to move in that direction. " +
                            "Write look to look around. Write exit to exit the game");
                    break;
                case "look":
                    System.out.println("You are in " + adventure.getCurrentRoom().getName() + " and you see " + adventure.getCurrentRoom().getDescription());
                    break;
                case "north":
                    adventure.playerMovement(userChoice);
                    System.out.println("You are now going north...");
                    break;
                case "west":
                    adventure.playerMovement(userChoice);
                    System.out.println("You are now going west...");
                    break;
                case "east":
                    adventure.playerMovement(userChoice);
                    System.out.println("You are now going east...");
                    break;
                case "south":
                    adventure.playerMovement(userChoice);
                    System.out.println("You are now going south...");
                    break;
            }

        } while (!userChoice.contains("exit"));
        System.out.println("You will now exit the game!");
        System.exit(0);
    }



}


