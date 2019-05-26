public class Player {
    private String name;
    private double credit;
    private double bet;

    public Player(String name,double credit) {
        this.name = name;
        this.credit=credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public boolean removeCredit(double credit) {
        if (this.credit > credit) {
            this.credit -= credit;
            return true;
        }
        return false;
    }

    public void addCredit(double credit) {
        this.credit += credit;
    }


    @Override
    public String toString() {
        return "Player:" + " "+ name + "\n" +
                "Credit:" + credit +" "
                ;
    }
}
