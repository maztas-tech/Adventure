import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private String item;

    private Room east;
    private Room west;
    private Room south;
    private Room north;



    private ArrayList<Item> roomItemList = new ArrayList<>();
    private ArrayList<Enemy> enemies = new ArrayList<>();


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


    //Item Metode
    public void addItem(String name, String longName){
        roomItemList.add(new Item(name, longName));
    }

    //Food Metode
    public void addFood(String name, String longName, int healthPoints){
        roomItemList.add(new Food(name, longName, healthPoints));
    }

    public void addMeleeWeapon(String name, String longName, int damage){
        roomItemList.add(new MeleeWeapon(name, longName, damage));
    }

    public void addRangedWeapon(String name, String longName, int damage, int bullets){
        roomItemList.add(new RangedWeapon(name, longName, damage, bullets));
    }

    public void addEnemy(String enemyName, String enemyDescription, int enemyHealth, Item enemyWeapon){
        enemies.add(new Enemy(enemyName, enemyDescription, enemyHealth, enemyWeapon));
    }

    public ArrayList<Enemy> getEnemy(){
        return enemies;
    }

    public Enemy getSpecificEnemy(String name){
        for (Enemy enemy: enemies) {
            if(enemy.getEnemyName().contains(name)){
                return enemy;
            }
        }
        return null;
    }

    public Item findItem(String name){
        for (Item item: roomItemList) {
            if(item.getName().contains(name)) {
                return item;
            }
        }
        return null;
    }

    public void removeItem(Item item){
        roomItemList.remove(item);
    }
    public void addItem(Item item){
        roomItemList.add(item);
    }

    public ArrayList<Item> getItemList(){
        return roomItemList;
    }

    public void removeDeadEnemy(String name){
        enemies.remove(getSpecificEnemy(name));
    }


    @Override
    public String toString() {
        return
                "You are in " + name + '\n' +
                        "You see " + description + "\n" +
                        "The following items " + item;
    }

}

