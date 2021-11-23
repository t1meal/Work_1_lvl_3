package root;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	Integer array [] = {1, 2, 3};
    change(array, 1, 2);
    System.out.println(convertToArrayList(array));

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

    public static void change (Integer[] arr, int i, int j){
        i--;
        j--;
        int a = arr[j];
        arr[j] = arr [i];
        arr[i] = a;
    }

    public static List<Integer> convertToArrayList (Integer [] arr) {
        return Arrays.asList(arr);
    }


}
