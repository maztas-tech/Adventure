public class Adventure {
    //Attributes
    private Map map;
    private Player player;



    //Constructor
    public Adventure(){
        map = new Map();
        player = new Player();
    }

    //Methods
    public void buildMap(){
        map.buildMap();
        player.setCurrentRoom(map.getStarterRoom());
    }
    public Room getCurrentRoom(){
        return player.getCurrentRoom();
    }

    public int getPlayerHealth(){
        return player.getPlayerHealth();
    }

    public boolean inInventory(String name){
        return player.inInventory(name);
    }

    public boolean isFood(String name){
        return player.isFood(name);
    }

    public void eat(String name){
        player.eat(name);
    }

    public void playerMovement(String direction){
        player.move(direction);

    }

    public Room setCurrentRoom(Room currentRoom){
        return setCurrentRoom(currentRoom);
    }

    public boolean takeItem(String name){
        return player.takeItem(name);
    }

    public boolean dropItem(String name){
        return player.dropItem(name);
    }
    public String showItems(){
        return player.showItems();
    }

    public String showInventory(){
        return player.showInventory();
    }
}
