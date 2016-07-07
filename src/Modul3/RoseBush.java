package Modul3;


import java.util.List;

public class RoseBush extends Rose {

    private List<Rose> roses;

    public RoseBush(String name, Size size, List<Rose> roses) {
        super(name, size);
        this.roses = roses;
    }

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }


}
