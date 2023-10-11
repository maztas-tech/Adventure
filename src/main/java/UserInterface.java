import java.util.Scanner;

public class UserInterface {
    Adventure adventure;

    public void startProgram() {
        adventure = new Adventure();
        adventure.buildMap();


        Scanner keyboard = new Scanner(System.in);
        String userChoice;
        String itemInput;
        String enemyInput;


        System.out.println("""
                Welcome to the adventure game!
                            
                Exit - To exit the program!
                Help - For a tutorial!
                Look - To look around in your current room!
                Take - takes an item in the current room you are in
                Drop - drops item in inventory
                Attack - attacks the desired enemy in the current room you are in
                Eat - eats an edible item
                Bullets - checks how many bullets you have left
                Inventory - see all the items you have in your inventory
                HP - shows your current health
                Weapon - displays your current weapon
                Equip - equip a weapon in your inventory
                Remove - remove your equipped weapon back into inventory
                Damage - shows the amount of damage you give
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
                    System.out.println("Choose an enemy you would like to attack: ");
                    enemyInput = keyboard.nextLine().toLowerCase();
                    adventure.getSpecificEnemy(enemyInput);
                    System.out.println("You choose: ");
                    if (!adventure.isAWeaponEquipped()){
                        System.out.println("You need a weapon to attack!");
                    }
                    else {
                        if (!adventure.usable()) {
                            System.out.println("You do not have any bullets left!");
                        } else {

                            //Enemy health loss
                            System.out.println("The enemy has " + adventure.getSpecificEnemy(enemyInput) + " hp");
                            System.out.println("You dealt " + adventure.attack() + " damage!");
                            adventure.getSpecificEnemy(enemyInput).enemyGetHit(adventure.attack());

                            System.out.println("The enemy has " + adventure.getSpecificEnemy(enemyInput).getEnemyHealth() + " hp left");
                            if (adventure.howManyBullets() > 0) {
                                adventure.useABullet();
                                System.out.println("You have " + adventure.howManyBullets() + " bullets left!");
                            }

                            //Player health loss
                            if (adventure.getSpecificEnemy(enemyInput).getEnemyHealth() > 0) {
                                adventure.playerGetHit(adventure.getSpecificEnemy(enemyInput).getEnemyItem().getDamage());
                                System.out.println("You have " + adventure.getPlayerHealth() + " hp left");
                                System.out.println("The enemy dealt " + adventure.getSpecificEnemy(enemyInput).getEnemyItem().getDamage() + " damage");
                            }
                            if (adventure.getSpecificEnemy(enemyInput).getEnemyHealth() <= 0) {

                                adventure.getSpecificEnemy(enemyInput);
                                adventure.getCurrentRoom().addItem(adventure.getSpecificEnemy(enemyInput).getEnemyItem());
                                System.out.println("The enemy has dropped its weapon. Type 'look' to see");
                                adventure.getCurrentRoom().removeDeadEnemy(enemyInput);
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

                    if(!adventure.showEnemies().isEmpty()){
                        System.out.println(adventure.showEnemies());
                    }
                    break;
                case "hp":
                    System.out.println("Your health is " + adventure.getPlayerHealth());
                    break;
                case "inventory":
                    System.out.println("You have the following items: \n" + adventure.showInventory());
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
                case "damage", "dmg":
                    System.out.println("Your weapon deals " + adventure.attack());
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
                    if (!adventure.playerMovement(userChoice)){
                        System.out.println("You cannot go that way!");
                    }else {
                        System.out.println("You are now going north...");
                    }
                    break;

                case "west", "w":
                    if (!adventure.playerMovement(userChoice)){
                        System.out.println("You cannot go that way!");
                    }else {
                        System.out.println("You are now going west...");
                    }
                    break;
                case "east", "e":
                    if (!adventure.playerMovement(userChoice)){
                        System.out.println("You cannot go that way!");
                    }else {
                        System.out.println("You are now going east...");
                    }

                    break;
                case "south", "s":
                    if (!adventure.playerMovement(userChoice)){
                        System.out.println("You cannot go that way!");
                    }else {
                        System.out.println("You are now going south...");
                    }
                    break;
            }

        } while (!userChoice.contains("exit"));
        System.out.println("You will now exit the game!");
        System.exit(0);


    }

}


