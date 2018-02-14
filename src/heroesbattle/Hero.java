package heroesbattle;

public class Hero {
    
    private String name;
    private int health;
    private Armor armor;
    private Weapon weapon;
    
    public Hero(String batman, int health, Armor armor, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
    }

    public void changeArmor(Armor armor) {
        this.armor = armor;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }
    
    public int getAttactPower() {
        return weapon.getPower();
    }

    void attacted(int power) {
        this.health = this.health - (power - armor.getArmor());
        
    }

    void attacted(Hero enemy) {
        // this.health = this.health - (enemy.getAttactPower() - armor.getArmor());
    // attacted(enemy.getAttactPower());
    }
    
}
