package module04.Task3;

/**
 * Created by nikitarozhkov on 01.06.16.
 */
public class Dote {

    private int x;
    private int y;

    public Dote(int x, int y) {

        this.x = x;
        this.y = y;


    }

    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculator( Dote dote2) {
        return Math.sqrt(Math.pow((this.x - dote2.getX()), 2) + Math.pow((this.y - dote2.getY()), 2));
    }


}
