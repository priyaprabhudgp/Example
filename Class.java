public class Monster {
    private String name;
    private int health;
    private String attackName;
    private String attack;
    private int attackPower;
    public String monsterImage;
//dfbbdgl
    public Monster(){
        name = "";
        health = 100;
        attack = "";
        attackName = "";
    }
    public Monster(String name, int health, String attack, String attackName) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.attackName = attackName;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void updateHealth(int damage) {
        health -= damage;
    }

    public String getAttack() {
        return attack;
    }

    public String getAttackName() {
        return attackName;
    }

    public void resetAttackPower(){
        attackPower = (int)(Math.random()*10)+1;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setAttack(String attack) {
        this.attack = attack;
    }
    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public int fight(){
        resetAttackPower();

        //System.out.println("Strength: "+attackPower+" attacks");
        return attackPower;
    }

}
