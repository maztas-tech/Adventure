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

    public void move(String direction){
        switch (direction){
            case "north":
                if (currentRoom.getNorth() != null) {
                    Room northRoom = currentRoom.getNorth();
                    System.out.println("You are now going north...");
                    currentRoom = northRoom;
                }else System.out.println("You can't go that way.");
                break;
            case "south":
                if (currentRoom.getSouth() != null){
                    Room southRoom = currentRoom.getSouth();
                    System.out.println("You are now going south...");
                    currentRoom = southRoom;
                }else System.out.println("You can't go that way.");
                break;
            case "west":
                if (currentRoom.getWest() != null){
                    Room westRoom = currentRoom.getWest();
                    System.out.println("You are now going west...");
                    currentRoom = westRoom;
                }else System.out.println("You can't go that way.");
                break;
            case "east":
                if (currentRoom.getEast() != null){
                    Room eastRoom = currentRoom.getEast();
                    System.out.println("You are now going east...");
                    currentRoom = eastRoom;
                }else System.out.println("You can't go that way.");
                break;
        }
    }
}
