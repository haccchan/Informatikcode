package game;

public class Enemy {
    String name;
    int attack;
    int health;
    int defense;
    String element;

    public Enemy(String name, int attack, int health, int defense) {
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
    }

    // Getter cho defense
    public int getDefense() {
        return this.defense;
    }

    // Kiểm tra xem kẻ địch có thể hành động hay không
    public boolean canAct() {
        return this.health > 0;
    }

    public int getAttack() {
        return this.attack;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
