import java.util.Scanner;

public class UserInterface {
    private Room currentInterface;
    Adventure adventure = new Adventure();

    public void startProgram() {
        adventure.buildMaze();

        Scanner keyboard = new Scanner(System.in);
        String userChoice;

        currentInterface = adventure.getCurrent();


        do {
            System.out.println("Would you like to move or would you like to look around ");
            userChoice = keyboard.nextLine().toLowerCase();
            switch (userChoice){
                case "help":
                    System.out.println("Write east/west/north/south to move in that direction. " +
                            "Write look to look around. Write exit to exit the game");
                    break;
                case "look":
                    System.out.println(currentInterface.toString());
                    break;
            }


            if (userChoice.contains("look")) {
                System.out.println(currentInterface.getDescription());
            } else if (userChoice.contains("east") && currentInterface.getEast() != null) {
                currentInterface = currentInterface.getEast();
            } else if (userChoice.contains("east") && currentInterface.getEast() == null) {
                System.out.println("You cannot move that direction");
            } else if (userChoice.contains("west") && currentInterface.getWest() != null) {
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
            }

        } while (!userChoice.contains("exit"));
        System.out.println("You will now exit the game!");
        System.exit(0);
    }



}


