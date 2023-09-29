public class Adventure {
    //Attributes
    private Map map;
    private Player player;

    //TODO Add a ArrayList

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

    public void timer(){
        player.timer();
    }
}
