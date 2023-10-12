public class Enemy {
    private String enemyName;
    private String enemyDescription;
    private int enemyHealth;
    private Item enemyItem;


    public Enemy(String enemyName, String enemyDescription, int enemyHealth, Item enemyItem) {
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
        this.enemyHealth = enemyHealth;
        this.enemyItem = enemyItem;
    }

    //Getter
    public String getEnemyName() {
        return enemyName;
    }


    public int getEnemyHealth() {
        return enemyHealth;
    }

    public Item getEnemyItem() {
        return enemyItem;
    }


    //Service methods
    public void enemyGetHit(int playerDamage) {
        enemyHealth = getEnemyHealth() - playerDamage;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nYou see the following enemies: \n");
        stringBuilder.append("Enemy: " + enemyName + "\n");
        stringBuilder.append("Enemy type: " + enemyDescription + "\n");
        stringBuilder.append("Enemy health: " + enemyHealth + "\n");
        stringBuilder.append("Enemy weapon: " + enemyItem + "\n");

        return stringBuilder.toString();
    }
}
