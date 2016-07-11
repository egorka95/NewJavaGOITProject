package module3;


import java.util.ArrayList;
import java.util.List;

public class Bouqet {

    private final List<Flower> flowers = new ArrayList<>();

    public boolean add(Flower flower){
        return flowers.add(flower);
    }

    public Flower remove(int index){
        return flowers.remove(index);
    }

    public Flower flower(int index){
        return flowers.get(index);
    }

    public int size(){
        return flowers.size();
    }

    @Override
    public String toString() {
        return "Bouqet{" +
                "flowers=" + flowers +
                '}';
    }

}
