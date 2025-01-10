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
	 public void Entfernen(String element) {
	        if (team.length > 1) {
	            String[] neuteam = new String[team.length - 1];
	            int index = 0;
	            for (int i = 0; i < team.length; i++) {
	                if (!team[i].equals(element)) {
	                    if (index < neuteam.length) {
	                    	neuteam[index] = team[i];
	                        index++;
	                    }
	                }
	            }
	            team = neuteam;
	        }
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
