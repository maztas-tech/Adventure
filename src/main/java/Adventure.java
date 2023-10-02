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

    public Item showItems(){
        return player.showItems();
    }

    /*
    public void showItemInRoom(){
        for (Item item: map.getItemList()) {
            System.out.println(item);
            break;
        }
    }

     */


}
