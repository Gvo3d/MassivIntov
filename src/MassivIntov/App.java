package MassivIntov;

/**
 * Made by Yakimov Denis, 29/11/2015 for Hillel Java course
 */

public class App {
    public static void main(String[] args) {

        int[] array;
        array = new int[]{4, 6};

        Massiv mass = new Massiv();
        mass.addAll(array);

        System.out.println("Starting array testing");
        System.out.println("Array length is "+mass.getSize());
        mass.printIntegers();
        System.out.println();

        System.out.println("We are deleting cell 0");
        mass.deleteValue(0);
        System.out.println("Array length is "+mass.getSize());
        mass.printIntegers();
        System.out.println();

        System.out.println("We are adding new two cells with value \"9\"");
        mass.add(9);
        mass.add(9);
        System.out.println("Array length is "+mass.getSize());
        mass.printIntegers();
        System.out.println();

        System.out.println("We are inserting value 0 to cell number 2");
        mass.insertValueInto(2,0);
        mass.printIntegers();
        System.out.println();

        System.out.println("In cell number 1 value is "+mass.getValue(1));
        System.out.println("Are there any value of 0 in array? - " + mass.contains(0));
        System.out.println("And in what cell is number 0 contains? - cell "+mass.find(0));

        System.out.println();
        System.out.println("We are clearing the array!");
        mass.clear();
        System.out.println("Array length is "+mass.getSize());

        System.out.println();
        array = new int[]{5, 3, 1};
        System.out.println("And we are adding all data from \"integerarray = new int[]{5, 3, 1}\" into our array");
        mass.addAll(array);
        System.out.println("Array length is "+mass.getSize());
        mass.printIntegers();
        System.out.println("Is our array equal to integerarray? - "+mass.equals(array));

        System.out.println();
        System.out.println("And we are sorting our array!");
        mass.sort();
        mass.printIntegers();

    }
}
