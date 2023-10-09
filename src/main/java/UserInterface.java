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
                    break;
                case "attack":
                    if (!adventure.isAWeaponEquipped()){
                        System.out.println("You need a weapon to attack!");
                    }
                    else {
                        if (!adventure.usable()) {
                            System.out.println("You do not have any bullets left!");
                        } else {
                            System.out.println("You dealt " + adventure.attack() + " damage!");
                            if (adventure.howManyBullets() > 0) {
                                System.out.println("You have " + adventure.howManyBullets() + " bullets left!");
                            }
                        }
                    }
                    break;
                case "eat":
                    System.out.println("Type in the item you want to eat: ");
                    itemInput = keyboard.nextLine().toLowerCase();

                    if (adventure.inInventory(itemInput)){
                        if(adventure.isFood(itemInput) == true){
                            adventure.eat(itemInput);
                            System.out.println("You have eaten the food!");
                        }
                        else{
                            System.out.println("This item is not edible");
                        }
                    }
                    else {
                        System.out.println("You do not have such item! ");
                    }
                    break;
                case "bullets":
                    if (adventure.howManyBullets() > 0)
                        System.out.println("You have " + adventure.howManyBullets() + " bullets left!");
                    else if (adventure.usable()) {
                        System.out.println("This weapon does not use bullets!");
                    }
                    if (!adventure.usable()){
                        System.out.println("You have 0 bullets left");
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
                case "weapon":
                    System.out.println("You have the following weapon equipped: \n" + adventure.showWeapons());
                    break;
                case "equip":
                    if (!adventure.isAWeaponEquipped()) {
                        System.out.println("Type in the weapon you want to equip:");
                        itemInput = keyboard.nextLine().toLowerCase();
                        if (adventure.inInventory(itemInput)) {
                            if (adventure.isWeapon(itemInput)) {
                                adventure.equipWeapon(itemInput);
                                System.out.println("You have equipped your weapon!");
                            } else {
                                System.out.println("This item is not a weapon");
                            }
                        } else {
                            System.out.println("You do not have such item! ");
                        }
                    }
                    else {
                        System.out.println("You can only have one weapon equipped. " +
                                "Remove your other weapon before equipping a new one!");
                    }
                    break;
                case "remove":
                    if (adventure.isAWeaponEquipped()) {
                        adventure.removeWeapon();
                        System.out.println("You have removed your weapon!");
                    }
                    else{
                        System.out.println("You do not have a weapon equipped!");
                    }
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


