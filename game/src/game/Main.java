package game;

public class Main {
    public static void main(String[] args) {
        Elementarreaktion team = new Elementarreaktion();
 
        team.Hinzufugen("Feuer");
        team.Hinzufugen("Feuer");
        team.ZeigeTeam();
        team.Prufen();

        team.Hinzufugen("Wasser");
        team.ZeigeTeam();
        team.Prufen();

      
        team.Entfernen();
        team.Hinzufugen("Wasser");
        team.ZeigeTeam();
        team.Prufen();
    }
}