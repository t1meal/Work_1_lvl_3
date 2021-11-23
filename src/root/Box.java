package root;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    private float fullWeight;
    private List <T> listOfBox;

    public Box() {
        listOfBox = new ArrayList<>();
        this.fullWeight = 0;
    }

    public float getFullWeight(){
        return fullWeight;
    }
    public void setWeight(float weight){
        this.fullWeight = weight;
    }

    public void addFruit(T fruit){
        listOfBox.add(fruit);
        fullWeight += fruit.getWeight();
    }
    public void addManyFruit(T fruit, int count){
        for (int i = 0; i < count; i++) {
           listOfBox.add(fruit);
           fullWeight += fruit.getWeight();
        }
    }

    public boolean compare(Box<? extends Fruit> compareBox) {
        return (getFullWeight() == compareBox.getFullWeight());
    }


    public void swiftTo(Box<T> box) {
        box.setWeight(box.getFullWeight() + fullWeight);
        this.fullWeight = 0;
    }
}




