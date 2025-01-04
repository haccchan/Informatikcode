package game;

public class Battle {
    Player player;
    Player[] allies;
    Enemy[] enemies;

    public Battle(Player player, Player[] allies, Enemy[] enemies) {
        this.player = player;
        this.allies = allies;
        this.enemies = enemies;
    }

    public void start() {
        int turnCount = 0;
        boolean battleOver = false;

        while (!battleOver) {
            System.out.println("\nTurn " + (turnCount + 1));
            player.takeTurn(enemies);

            // Kẻ địch tấn công
            for (Enemy enemy : enemies) {
                if (enemy.isAlive()) {
                    int damage = enemy.getAttack();
                    player.takeDamage(damage);
                    System.out.println(enemy.getName() + " attacks for " + damage + " damage.");
                }
            }

            // Kiểm tra kết quả trận đấu
            battleOver = checkBattleStatus();
            turnCount++;

            if (turnCount % 5 == 0 && player.getElement().equals("Water")) {
                System.out.println("Water Element - Healing 20% health.");
                player.heal(20);
            }

            if (battleOver) {
                System.out.println("Battle Over!");
                if (player.isAlive()) {
                    System.out.println(player.getName() + " wins!");
                } else {
                    System.out.println(player.getName() + " has fallen!");
                }
            }
        }
    }

    private boolean checkBattleStatus() {
        boolean enemiesAlive = false;
        for (Enemy enemy : enemies) {
            if (enemy.isAlive()) {
                enemiesAlive = true;
                break;
            }
        }
        return !player.isAlive() || !enemiesAlive;
    }
}
