package MassivIntov;

import java.lang.reflect.Array;

/**
 * Created by Gvozd on 28.11.2015.
 */
public class App {
    public static void main(String[] args) {

        int[] array;
        array = new int[]{4, 6, 3, 2, 1, 2, 6, 7};

        Massiv mass = new Massiv();
        mass.setIntegers(array);

        System.out.println(mass.Size());
        mass.printIntegers();
    }
}
