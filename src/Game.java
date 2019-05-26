import java.util.Random;

public class Game {

    private int[][] roulette;
    Player p=new Player("Matteo",2000);
    private int[] redNumbers=new int[]{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36};
    private int[] blackNumbers=new int[]{1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35};
    private String name;
    private double credit;


    public Game() {
        this.roulette = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 },
                { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 }, { 28, 29, 30 }, { 31, 32, 33 }, { 34, 35, 36 } };
    }

    public String bet(int num) {
        String s1 = "You Win";
        String s2 = "You Lose";
        if (num >= 0) {
            for (int i : redNumbers) {
                if (i == num) {
                    if (num == random()) {
                        p.setCredit(500 * 36);
                        return s1;
                    } else {
                        p.setCredit(0);
                        return s2;}
                }
            }
            for (int j : blackNumbers) {
                if (j == num) {
                    if (num == random()) {
                        p.setCredit(500 * 36);
                        return s1;
                    } else {
                        p.setCredit(0);
                        return s2;
                    }
                }
            }
        }
       }

    
    public int random() {
        Random random = new Random();
        int number = random.nextInt(37);
        return number;
    }

    public String toString() {
        String s = "";
        String s1 = "|        0       |\n";
        for (int i = 0; i < this.roulette.length; i++) {
            for (int j = 0; j < this.roulette[i].length; j++) {
                if (this.roulette[i][j] <= 9) {
                    s += "| " + this.roulette[i][j] + "  |";
                } else {
                    s += "| " + this.roulette[i][j] + " |";
                }
            }
            s += "\n";
        }
        return s1 + s;
    }

}
