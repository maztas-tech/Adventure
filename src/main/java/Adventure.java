import java.util.ArrayList;

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

    public boolean playerMovement(String direction){
        return player.move(direction);

    }


    public boolean takeItem(String name){
        return player.takeItem(name);
    }

    public boolean dropItem(String name){
        return player.dropItem(name);
    }

    public boolean inInventory(String name){
        return player.inInventory(name);
    }

    public boolean isAWeaponEquipped(){
        return player.isAWeaponEquipped();
    }


    public int attack(){
        return player.attack();
    }

    public boolean usable(){
        return player.usable();
    }

    public boolean isFood(String name){
        return player.isFood(name);
    }

    public boolean isWeapon(String name){
        return player.isWeapon(name);
    }
    public void equipWeapon(String name){
        player.equipWeapon(name);
    }

    public void removeWeapon(){
        player.removeWeapon();
    }

    public String showItems(){
        return player.showItems();
    }

    public String showInventory(){
        return player.showInventory();
    }

    public String showWeapons(){
        return player.showWeapons();
    }

    public int howManyBullets(){
        return player.howManyBullets();
    }

    public void eat(String name){
        player.eat(name);
    }


    public ArrayList<Enemy> showEnemies(){
        return getCurrentRoom().getEnemy();
    }


    public Enemy getSpecificEnemy(String name){
        return getCurrentRoom().getSpecificEnemy(name);
    }


    public void playerGetHit(int enemyDamage){
        player.playerGetHit(enemyDamage);
    }


    public void useABullet(){
        player.useABullet();
    }

}
