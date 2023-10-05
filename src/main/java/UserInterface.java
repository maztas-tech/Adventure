import java.util.Scanner;

public class UserInterface {
    Adventure adventure;

    public void startProgram() {
        adventure = new Adventure();
        adventure.buildMap();


        Scanner keyboard = new Scanner(System.in);
        String userChoice;
        String itemInput;


        System.out.println("""
                Welcome to the adventure game!
            
                Exit - To exit the program!
                Help - For a tutorial!
                Look - To look around in your current room!
                """);


        do {
            System.out.println("Awaiting your command");
            userChoice = keyboard.nextLine().toLowerCase();
            switch (userChoice){
                case "help":
                    System.out.println("Write east/west/north/south to move in that direction. " +
                            "Write look to look around. Write exit to exit the game");
                    break;
                case "take":
                    System.out.println("Type in the item you want: ");
                    itemInput = keyboard.nextLine().toLowerCase();

                    if(adventure.takeItem(itemInput)){
                        System.out.println("You have taken " + itemInput);
                    }else {
                        System.out.println("Such item does not exist!");
                    }
                    break;
                case "drop":
                    System.out.println("Type in the item you want to drop: ");
                    itemInput = keyboard.nextLine().toLowerCase();

                    if (adventure.dropItem(itemInput)){
                        System.out.println("You have dropped the following item: " + itemInput);
                    }
                    else {
                        System.out.println("You do not have such item! ");
                    }
                case "eat":
                    System.out.println("Type in the item you want to eat: ");
                    itemInput = keyboard.nextLine().toLowerCase();

                    if (adventure.inInventory(itemInput)){
                        if(adventure.isFood(itemInput)){
                            adventure.eat(itemInput);
                            System.out.println("You have eaten the food!");

                        }
                        else {
                            System.out.println("This item is not edible");
                        }
                    }
                    else {
                        System.out.println("You do not have such item! ");
                    }
                    break;
                case "look":
                    System.out.println("You are in " + adventure.getCurrentRoom().getName() + "\n"+
                            "You see " + adventure.getCurrentRoom().getDescription() + "\n");
                    if(!adventure.showItems().isEmpty()){
                        System.out.println("You see the following items: \n" + adventure.showItems());
                    }
                    break;
                case "hp":
                    System.out.println("Your health is " + adventure.getPlayerHealth());
                    break;
                case "inventory":
                    System.out.println("You have the following items: \n" + adventure.showInventory());
                    break;
                case "health":
                    System.out.println("You have the following health: ");
                    break;
                case "north", "n":
                    adventure.playerMovement(userChoice);
                    break;
                case "west", "w":
                    adventure.playerMovement(userChoice);
                    break;
                case "east", "e":
                    adventure.playerMovement(userChoice);
                    break;
                case "south", "s":
                    adventure.playerMovement(userChoice);
                    break;
            }

        } while (!userChoice.contains("exit"));
        System.out.println("You will now exit the game!");
        System.exit(0);
    }



}


