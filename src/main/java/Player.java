import java.util.ArrayList;

public class Player {
    Room currentRoom;
    //Health of player
    private int playerHealth = 100;

    public void setCurrentRoom(Room newRoom) {
        this.currentRoom = newRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public int getPlayerHealth(){
        return playerHealth;
    }


    ArrayList<Item> itemList = new ArrayList<>();
    ArrayList<Item> equippedWeapons = new ArrayList<>();

    public Item findItem(String name) {
        for (Item item : itemList) {
            if (item.getName().contains(name)) {
                return item;
            }
        }
        return null;
    }

    public Item findWeapon(String name) {
        for (Item item : equippedWeapons) {
            if (item.getName().contains(name)) {
                return item;
            }
        }
        return null;
    }



    public boolean takeItem(String name) {
        Item found = currentRoom.findItem(name);
        if (found != null) {
            itemList.add(found);
            currentRoom.removeItem(found);
            return true;
        } else {
            return false;
        }
    }

    public void eat(String name){
        Item found = findItem(name);
        playerHealth = playerHealth + found.getHealthPoints();
        itemList.remove(found);
    }

    public int howManyBullets(){
        for (Item item : equippedWeapons) {
            return item.getBullets();
        }
        return 0;
    }


    public boolean usable(){
        for (Item item : equippedWeapons) {
            return item.canUse();
        }
        return false;
    }

    public int attack() {
        for (Item item : equippedWeapons) {
            return item.getDamage();
        }
        return 0;
    }



    public void useABullet(){
        for (Item item : equippedWeapons){
            item.setBullets(item.getBullets()-1);
        }
    }


    public Boolean isAWeaponEquipped(){
        if (equippedWeapons.size()>0){
            return true;
        }
        return false;
    }

    public void equipWeapon(String name){
        Item found = findItem(name);
        equippedWeapons.add(found);
        itemList.remove(found);
    }

    public void removeWeapon(){
        Item item = equippedWeapons.get(0);
        equippedWeapons.remove(item);
        itemList.add(item);
    }

    public boolean dropItem(String name) {
        Item found = findItem(name);
        if (found != null) {
            itemList.remove(found);
            currentRoom.addItem(found);
            return true;
        } else {
            return false;
        }
    }


    public boolean inInventory(String name) {
        Item found = findItem(name);
        return found != null;
    }

    public boolean inEquippedWeapons(String name) {
        Item found = findWeapon(name);
        return found != null;
    }
    public boolean isFood(String name) {
        Item found = findItem(name);
        if (found instanceof Food) {
            return true;
        }
        return false;
    }



    public boolean isWeapon(String name) {
        Item found = findItem(name);
        if (found instanceof Weapon) {
            return true;
        }
        return false;
    }

    public String showItems() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Item item : currentRoom.getItemList()) {
            stringBuilder.append(item.getName());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }



    public String showInventory() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Item item : itemList) {
            stringBuilder.append(item.getName());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String showWeapons() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Item item : equippedWeapons) {
            stringBuilder.append(item.getName());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }



    public void playerGetHit(int enemyDamage){
        playerHealth = playerHealth - enemyDamage;
    }


    public boolean move(String direction) {
        switch (direction) {
            case "north", "n":
                if (currentRoom.getNorth() != null) {
                    Room northRoom = currentRoom.getNorth();
                    currentRoom = northRoom;
                    return true;

                } else return false;


            case "south", "s":
                if (currentRoom.getSouth() != null) {
                    Room southRoom = currentRoom.getSouth();

                   // System.out.println("You are now going south...");
                    currentRoom = southRoom;
                    return true;
                } else return false;
            case "west", "w":
                if (currentRoom.getWest() != null) {
                    Room westRoom = currentRoom.getWest();
                    System.out.println("You are now going west...");
                    currentRoom = westRoom;
                    return true;
                } else return false;

            case "east", "e":
                if (currentRoom.getEast() != null) {
                    Room eastRoom = currentRoom.getEast();
                    currentRoom = eastRoom;
                    return true;
                } else return false;
        }
        return false;
    }
}