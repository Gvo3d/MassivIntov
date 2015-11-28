package MassivIntov;

import java.lang.reflect.Array;

/**
 * Created by Gvozd on 28.11.2015.
 */
public class App {
    public static void main(String[] args) {

        int[] array;
        array = new int[]{4, 6, 3, 7};

        Massiv mass = new Massiv(0);
        mass.setIntegers(array);

        System.out.println("Starting array");
        System.out.println("Array length is "+mass.Size());
        mass.printIntegers();
        System.out.println();

        System.out.println("We are deleting cell 2");
        mass.deleteValue(2);
        System.out.println("Array length is "+mass.Size());
        mass.printIntegers();
        System.out.println();

        System.out.println("We are adding new two cells with value \"9\"");
        mass.InsertValue(9);
        mass.InsertValue(9);
        System.out.println("Array length is "+mass.Size());
        mass.printIntegers();
        System.out.println();

        System.out.println("We are inserting value 0 to cell number 4");
        mass.InsertValueInto(4,0);
        System.out.println("Array length is "+mass.Size());
        mass.printIntegers();
        System.out.println();
    }
}
