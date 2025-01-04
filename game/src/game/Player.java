package game;

import java.util.Scanner;

public class Player {
    String name;
    int attack;
    int health;
    int defense;
    String element;

    public Player(String name) {
        this.name = name;
        this.attack = 5;  
        this.health = 5;  
        this.defense = 5; 
    }

    public void takeTurn(Enemy[] enemies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose action:");
        System.out.println("1. Attack");
        System.out.println("2. Heal (if Water system)");

        int action = scanner.nextInt();

        if (action == 1) {
            // Tấn công kẻ địch
            System.out.println("Choose enemy to attack:");
            for (int i = 0; i < enemies.length; i++) {
                System.out.println((i + 1) + ". " + enemies[i].getName());
            }
            int targetIndex = scanner.nextInt() - 1;
            attackEnemy(enemies[targetIndex]);
        } else if (action == 2 && element.equals("Water")) {
            heal(20);  // Hồi 20% máu nếu là hệ Thủy
        } else {
            System.out.println("Invalid action.");
        }
    }

    public void attackEnemy(Enemy enemy) {
        int damage = this.attack;
        enemy.takeDamage(damage);
        System.out.println(this.name + " attacks " + enemy.getName() + " for " + damage + " damage.");
    }

    public void heal(int percentage) {
        int healAmount = this.health * percentage / 100;
        this.health += healAmount;
        System.out.println(this.name + " heals for " + healAmount + " health.");
    }

    // Phương thức takeDamage
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;  // Đảm bảo máu không giảm dưới 0
        }
        System.out.println(this.name + " takes " + damage + " damage. Remaining health: " + this.health);
    }

    // Getter & Setter
    public String getName() {
        return this.name;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public String getElement() {
        return this.element;
    }

    public int getMaxHealth() {
        return this.health;  // Giả sử max health là giá trị máu hiện tại
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
