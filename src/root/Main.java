package root;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer array [] = {1, 2, 3};
        Main app = new Main();
        app.change(array, 1, 2);
        app.convertToArrayList(array);

        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        appleBox1.addFruit(new Apple("Antonovka"));
        appleBox1.addManyFruit(new Apple("Shafran"), 3);
        appleBox2.addManyFruit(new Apple("Melba"), 7);
        orangeBox1.addFruit(new Orange("Pomelo"));
        orangeBox1.addManyFruit(new Orange("Mandarin"), 5);

        System.out.println(appleBox1.getFullWeight());
        System.out.println(orangeBox1.getFullWeight());
        System.out.println(appleBox1.compare(orangeBox1));
        System.out.println(appleBox1.getFullWeight());
        System.out.println(appleBox2.getFullWeight());
        appleBox1.swiftTo(appleBox2);
        System.out.println(appleBox1.getFullWeight());
        System.out.println(appleBox2.getFullWeight());
    }

    public <E> E[] change (E[] arr, int i, int j){
        i--;
        j--;
        E a = arr[j];
        arr[j] = arr [i];
        arr[i] = a;
        return arr;
    }

    public <A> List<A> convertToArrayList (A[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

}
