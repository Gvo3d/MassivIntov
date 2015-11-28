package MassivIntov;

/**
 * Created by Gvozd on 28.11.2015.
 */
public class Massiv {
    private static final int ARRAYSTARTINGLENGTH=0;
    private IntegerValue[] integers;

    public Massiv() {
        integers = new IntegerValue[ARRAYSTARTINGLENGTH];
    }

    public Massiv(int userArrayStartingLength) {
        this.integers = new IntegerValue[userArrayStartingLength];
    }

    public void printIntegers() {
        for (int i=0; i<integers.length; i++) {
            if (integers[i].isNull()) {
                System.out.println("Value "+i+ " is "+integers[i].getValue());
            } else System.out.println("Value "+i+ " is null");
        }
    }

    public int Size(){
        return integers.length;
    }

    public void setIntegers(int[] newintegers) {
        integers = new IntegerValue[newintegers.length];
        for (int i=0; i<this.integers.length;i++) integers[i]= new IntegerValue(newintegers[i]);
    }

    private void massivChangeLength (int newLength){
        IntegerValue[] newArrayOfIntegers = new IntegerValue[newLength];
        newArrayOfIntegers = integers.clone();
        integers=newArrayOfIntegers;
    }

    private void massivTrim () {
        int resultingArrayLength=0;
        for (int i =0; i<integers.length; i++) {
            if (integers[i]!=null) resultingArrayLength++;
        }
        IntegerValue[] newArrayOfIntegers = new IntegerValue[resultingArrayLength];
        int newValueOfNewArrayOfIntegers=0;
        for (int i =0; i<integers.length; i++) {
            if (integers[i]!=null) {
                newArrayOfIntegers[newValueOfNewArrayOfIntegers]=integers[i];
                newValueOfNewArrayOfIntegers++;
            }
        }
        integers=newArrayOfIntegers;
    }

    public void deleteValue(){
        integers[5]=null;
    }

    public void InsertValueInto (int valueId, int newvalue){
        integers[valueId]= new IntegerValue(newvalue);
    }

    public void InsertValue (int newvalue){
        massivChangeLength(integers.length+1);
        integers[integers.length-1]= new IntegerValue(newvalue);
    }

}
