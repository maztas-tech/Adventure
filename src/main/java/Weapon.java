public abstract class Weapon extends Item {
    private int damage;
    private int bullets;

    public Weapon(String name, String description) {
        super(name, description);

    }

    public int getDamage(){
        return damage;
    }

    public boolean canUse(){
        return true;
    }


    public int getBullets(){
        return bullets;
    }

    public void setBullets(int b){
        bullets = b;
    }
}