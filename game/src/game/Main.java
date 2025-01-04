package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo nhân vật người chơi
        System.out.print("Enter your character name: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        // Người chơi chọn hệ nguyên tố
        System.out.println("Choose your elemental affinity:");
        System.out.println("1. Water (Healer - Heal 20% health every 5 turns)");
        System.out.println("2. Earth (Tank - 8% chance to avoid damage)");
        System.out.println("3. Fire (Warrior - 18% chance for critical hit)");
        System.out.println("4. Air (Quick - 18% chance for an extra turn)");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1: player.setElement("Water"); break;
            case 2: player.setElement("Earth"); break;
            case 3: player.setElement("Fire"); break;
            case 4: player.setElement("Air"); break;
            default: System.out.println("Invalid choice, defaulting to Water.");
                     player.setElement("Water");
        }

        // Tạo đội và kẻ địch
        Enemy[] enemies = { new Enemy("Wolf1", 1, 5, 0), new Enemy("Wolf2", 1, 5, 0) };
        Player[] allies = { player };

        // Bắt đầu trận chiến
        Battle battle = new Battle(player, allies, enemies);
        battle.start();

        scanner.close();
    }
}
