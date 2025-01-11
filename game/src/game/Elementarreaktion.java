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
    boolean tropfen = false;
    boolean uberladen = false;
    
    public Elementarreaktion() {
        team = new String[0];
    }

    // Thêm element vào team
    public void Elementhinzufugen(String element) {
        String[] neuteam = new String[team.length + 1];
        System.arraycopy(team, 0, neuteam, 0, team.length);
        neuteam[team.length] = element;
        team = neuteam;
    }

    // Loại bỏ element đầu tiên khỏi team
    public void Elemententfernen() {
        if (team.length > 0) { 
            String[] neuteam = new String[team.length - 1]; 
            System.arraycopy(team, 1, neuteam, 0, team.length - 1);
            team = neuteam; 
        }
    }

    // Kiểm tra các phản ứng nguyên tố
    public void Elementprufen() {
        // Khởi tạo lại các phản ứng nguyên tố mỗi lần kiểm tra
        sprießen = false;
        verdampfen = false;
        beben = false;
        brennen = false;
        tropfen = false;
        uberladen = false;

        // Kiểm tra các yếu tố có trong team
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

        // Kiểm tra các phản ứng nguyên tố
        sprießen = wasser && luft;
        beben = luft && erde;
        brennen = luft && feuer;
        verdampfen = wasser && feuer;
        tropfen = wasser && erde;
        uberladen = feuer && erde;
    }

    // Getter cho các phản ứng nguyên tố
    public boolean isSprießen() {
        return sprießen;
    }

    public boolean isVerdampfen() {
        return verdampfen;
    }

    public boolean isBeben() {
        return beben;
    }

    public boolean isBrennen() {
        return brennen;
    }

    public boolean isTropfen() {
        return tropfen;
    }

    public boolean isUberladen() {
        return uberladen;
    }

    // Getter cho team
    public String[] getTeam() {
        return team;
    }
}
