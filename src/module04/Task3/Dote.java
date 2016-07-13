package module04.Task3;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Dote {

    private int poin1;
    private int poin2;

    public Dote(int poin1, int poin2) {

        this.poin1 = poin1;
        this.poin2 = poin2;

    }

    public int getPoin1() {
        return poin1;
    }

    public void setPoin1(int poin1) {
        this.poin1 = poin1;
    }

    public int getPoin2() {
        return poin2;
    }

    public void setPoin2(int poin2) {
        this.poin2 = poin2;
    }

    public double calculator(Dote dote2) {
        return Math.sqrt(Math.pow((this.poin1 - dote2.getPoin1()), 2) + Math.pow((this.poin2 - dote2.getPoin2()), 2));
    }


}
