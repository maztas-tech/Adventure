public class Item {
    private String name;
    private String longName;
    private int healthPoints;
    private int damage;
    private int bullets;

    public Item(String name, String longName) {
        this.name = name;
        this.longName = longName;
    }

    public String getName() {

        return name;
    }

    public int getHealthPoints(){
        return healthPoints;
    }
    public int getDamage(){
        return damage;
    }

    public int getBullets(){
        return bullets;
    }
    public void setBullets(int b){
        bullets = b;
    }

    public boolean canUse(){
        return true;
    }





    @Override
    public String toString() {
        return name;
    }
//health point metode
}
