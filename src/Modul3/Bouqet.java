package Modul3;


import java.util.List;

public class Bouqet {

    private List<Flower>flowers;

    public Bouqet(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public boolean add(Flower flower){
        return flowers.add(flower);
    }

    public Flower remove(int index){
        return flowers.remove(index);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

}
