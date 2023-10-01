import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private String item;
    
    private Room east;
    private Room west;
    private Room south;
    private Room north;

    //TODO Add ArrayList
    ArrayList<Item> roomItemList = new ArrayList<>();

    public Room(String name, String description, String item) {
        this.name = name;
        this.description = description;
        this.item = item;
    }

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }


    //Set
    public void setEast(Room east){
        this.east = east;
    }
    public void setWest(Room west){
        this.west = west;
    }
    public void setNorth(Room north){
        this.north = north;
    }
    public void setSouth(Room south){
        this.south = south;
    }

    public void setItem(String item) {
        this.item = item;
    }

    //Get
    public Room getEast(){
        return east;
    }
    public Room getWest(){
    return west; }

    public Room getNorth(){
    return north; }

    public Room getSouth(){
    return south;
    }

    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return
                 "You are in " + name + '\n' +
                 "You see " + description;
    }
}

