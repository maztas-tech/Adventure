public class MeleeWeapon extends Weapon {
    private int damage;

    public MeleeWeapon(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;

    }

    public boolean canUse(){
        return true;
    }

    public int getDamage(){
        return damage;
    }
}