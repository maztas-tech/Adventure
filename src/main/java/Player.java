import java.util.ArrayList;

public class Player {
    Room currentRoom;

    public void setCurrentRoom(Room newRoom){
        this.currentRoom = newRoom;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }


    //TODO Create an ArrayList
    ArrayList<Item> itemList = new ArrayList<>();

    public Item findItem(String name){
        for (Item item: itemList) {
            if(item.getName().contains(name)) {
                return item;
            }
        }
        return null;
    }


    public boolean takeItem(String name) {
        Item found = currentRoom.findItem(name);
        if(found != null){
            itemList.add(found);
            currentRoom.removeItem(found);
            return true;
        }else {
            return false;
        }
    }

  public boolean dropItem(String name) {
        Item found = findItem(name);
        if(found != null){
            itemList.remove(found);
            currentRoom.addItem(found);
            return true;
        }else {
            return false;
        }
    }

    public String showItems(){
        StringBuilder stringBuilder = new StringBuilder("");
        for (Item item: currentRoom.getItemList()) {
            stringBuilder.append(item.getName());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String showInventory(){
        StringBuilder stringBuilder = new StringBuilder("");
        for (Item item: itemList) {
            stringBuilder.append(item.getName());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }



    public void move(String direction){
        switch (direction){
            case "north", "n":
                if (currentRoom.getNorth() != null) {
                    Room northRoom = currentRoom.getNorth();
                    System.out.println("You are now going north...");
                    currentRoom = northRoom;
                }else System.out.println("You can't go that way.");
                break;
            case "south", "s":
                if (currentRoom.getSouth() != null){
                    Room southRoom = currentRoom.getSouth();
                    System.out.println("You are now going south...");
                    currentRoom = southRoom;
                }else System.out.println("You can't go that way.");
                break;
            case "west", "w":
                if (currentRoom.getWest() != null){
                    Room westRoom = currentRoom.getWest();
                    System.out.println("You are now going west...");
                    currentRoom = westRoom;
                }else System.out.println("You can't go that way.");
                break;
            case "east", "e":
                if (currentRoom.getEast() != null){
                    Room eastRoom = currentRoom.getEast();
                    System.out.println("You are now going east...");
                    currentRoom = eastRoom;
                }else System.out.println("You can't go that way.");
                break;
        }
    }
}
