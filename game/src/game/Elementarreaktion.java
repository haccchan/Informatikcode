package game;

public class Elementarreaktion {
	String[] team;
	boolean wasser = false; 
	boolean erde = false;
	boolean luft = false;
	boolean feuer = false;
	
	boolean sprießen = false;
	boolean verdampfen = false;
	boolean beben = false;
	boolean brennen = false;
	
	public Elementarreaktion() {
		team = new String[0];
	}
	public void Hinzufugen(String element) {
	        String[] neuteam = new String[team.length + 1];
	        for (int i = 0; i < team.length; i++) {
	            neuteam[i] = team[i];
	        }
	        neuteam[team.length] = element;
	        team = neuteam;
	 }
	public void Entfernen() {
	    if (team.length == 3) { 
	        String[] neuteam = new String[1]; 
	        neuteam[0] = team[0];
	        team = neuteam; 
	    }
	}
		 
	 public void ZeigeTeam() {
	        System.out.print("Zeigen: ");
	        for (int i = 0; i < team.length; i++) {
	            System.out.print(team[i]);
	            if (i < team.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println();
	    }
	public void Prufen() {
		for (int i = 0; i < team.length; i++) {
            String element = team[i];
            if (element.equals("Wasser")) {
                wasser = true;
            } else if (element.equals("Erde")) {
                erde = true;
            } else if (element.equals("Feuer")) {
                feuer = true;
            } else if (element.equals("Luft")) {
                luft = true;
            }
        }
		boolean sprießen = wasser && erde;
		boolean verdampfen = wasser && feuer;
		boolean beben = luft && erde;
		boolean brennen = luft && feuer;
	}

}
