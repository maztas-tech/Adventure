public class RangedWeapon extends Weapon {
    private int bullets;
    private int damage;

    public RangedWeapon(String name, String description, int damage, int bullets) {
        super(name, description);
        this.bullets = bullets;
        this.damage = damage;

    }

    public int getDamage(){
        return damage;
    }


    public boolean canUse(){
        if (bullets > 0){
            return true;
        }
        return false;
    }

    public int getBullets(){
        return bullets;
    }

    public void setBullets(int b){
        bullets = b;
    }
}