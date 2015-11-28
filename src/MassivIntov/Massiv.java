package MassivIntov;

/**
 * Created by Gvozd on 28.11.2015.
 */
public class Massiv {
    private static final int ARRAYSTARTINGLENGTH=0;
    private int[] integers;
    private boolean[] integersValidation;
 //   private int integersCount=0;

    public Massiv() {
        integers = new int[ARRAYSTARTINGLENGTH];
        integersValidation = new boolean[ARRAYSTARTINGLENGTH];
    }

    public Massiv(int userArrayStartingLength) {
        this.integers = new int[userArrayStartingLength];
        integersValidation = new boolean[userArrayStartingLength];
    }

    public void printIntegers() {
        for (int result:integers) System.out.println("Value "+result+ " is"+integersValidation[result]);
    }

    public int Size(){
        return integers.length;
    }

    public void setIntegers(int[] integers) {
        this.integers = integers;
        this.integersValidation= new boolean[integers.length];
        for (int i=0; i<integersValidation.length; i++) integersValidation[i]=true;
    }

    private void massivChangeLength (int newLength){
        int[] newArrayOfIntegers = new int[newLength];
        newArrayOfIntegers = integers.clone();
        integers=newArrayOfIntegers;
    }

    private void massivTrim () {
        int resultingArrayLength=0;
        for (int i =0; i<integers.length; i++) {
            if (integersValidation[i]) resultingArrayLength++;
        }
        int[] newArrayOfIntegers = new int[resultingArrayLength];
        int newValueOfNewArrayOfIntegers=0;
        for (int i =0; i<integers.length; i++) {
            if (integersValidation[i]) {
                newArrayOfIntegers[newValueOfNewArrayOfIntegers]=integers[i];
                newValueOfNewArrayOfIntegers++;
            }
        }
        integersValidation = new boolean[resultingArrayLength];
        for (int i=0; i<integersValidation.length; i++) integersValidation[i]=true;
        integers=newArrayOfIntegers;
    }


}
