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
                Look - To look around in your current room
                """);



        do {
            System.out.println("Would you like help or would you like to look around ");
            userChoice = keyboard.nextLine().toLowerCase();
            switch (userChoice){
                case "help":
                    System.out.println("Write east/west/north/south to move in that direction. " +
                            "Write look to look around. Write exit to exit the game");
                    break;
                case "look":
                    System.out.println(adventure.getCurrentRoom().getDescription());
                    break;
            }

            System.out.println("Choose a direction !");
            String playerMove;
            playerMove = keyboard.nextLine().toLowerCase();

            switch (playerMove){
                case "north":
                    adventure.playerMovement(playerMove);
                    break;
                case "west":
                    adventure.playerMovement(playerMove);
                    break;
                case "east":
                    adventure.playerMovement(playerMove);
                    break;
                case "south":
                    adventure.playerMovement(playerMove);
                    break;
            }


            /*
            if (userChoice.contains("east") && currentInterface.getEast() != null) {
                currentInterface = currentInterface.getEast();
            } else if (userChoice.contains("east") && currentInterface.getEast() == null) {
                System.out.println("You cannot move that direction");
            }else if (userChoice.contains("west") && currentInterface.getWest() != null) {
                currentInterface = currentInterface.getWest();
            } else if (userChoice.contains("west") && currentInterface.getWest() == null) {
                System.out.println("You cannot move that direction");
            } else if (userChoice.contains("north") && currentInterface.getNorth() != null) {
                currentInterface = currentInterface.getNorth();
            } else if (userChoice.contains("north") && currentInterface.getNorth() == null) {
                System.out.println("You cannot move that direction!");
            } else if (userChoice.contains("south") && currentInterface.getSouth() != null) {
                currentInterface = currentInterface.getSouth();
            } else if (userChoice.contains("south") && currentInterface.getSouth() == null) {
                System.out.println("You cannot move that direction!");
            }*/

        } while (!userChoice.contains("exit"));
        System.out.println("You will now exit the game!");
        System.exit(0);
    }



}


