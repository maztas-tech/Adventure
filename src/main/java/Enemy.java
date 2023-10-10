public class Enemy {
    private String enemyName;
    private String enemyDescription;
    private int enemyHealth;
    private Item enemyItem;

    Player getCurrentRoom = new Player();



    public Enemy(String enemyName, String enemyDescription, int enemyHealth, Item enemyItem){
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
        this.enemyHealth = enemyHealth;
        this.enemyItem = enemyItem;
    }

    //Getter
    public String getEnemyName() {
        return enemyName;
    }

    public String getEnemyDescription() {
        return enemyDescription;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public Item getEnemyItem() {
        return enemyItem;
    }

    //Setter

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public void setEnemyDescription(String enemyDescription) {
        this.enemyDescription = enemyDescription;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public void setEnemyItem(Item enemyItem) {
        this.enemyItem = enemyItem;
    }

    //Service methods
    public void enemyGetHit(int playerDamage){
        enemyHealth = getEnemyHealth() - playerDamage;
    }

    public int enemyAttack(){
        return enemyItem.getDamage();
    }

    public void enemyItemDrop(){
        getCurrentRoom.getCurrentRoom().addItem(enemyItem);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return enemyName + '\'' +
                ", enemyDescription='" + enemyDescription + '\'' +
                ", enemyHealth=" + enemyHealth +
                ", enemyItem=" + enemyItem +
                '}';
    }
}
