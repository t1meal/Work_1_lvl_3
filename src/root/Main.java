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
