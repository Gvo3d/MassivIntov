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
        for (int i=0; i<integers.length; i++) System.out.println("Cell: "+i+ " value: "+integers[i].getValue());
    }

    public int Size(){
        return integers.length;
    }

    public void setIntegers(int[] newintegers) {
        integers = new IntegerValue[newintegers.length];
        for (int i=0; i<this.integers.length;i++) integers[i]= new IntegerValue(newintegers[i]);
        massivTrim();
    }

    private void massivChangeLength (int newLength){
        IntegerValue[] newArrayOfIntegers = new IntegerValue[newLength];
        System.arraycopy(integers, 0, newArrayOfIntegers, 0, integers.length);
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

    public void deleteValue(int valueId){
        integers[valueId]=null;
        massivTrim();
    }

    public void InsertValueInto (int valueId, int newvalue){
        integers[valueId]= new IntegerValue(newvalue);
    }

    public void InsertValue (int newvalue){
        massivChangeLength(integers.length+1);
        integers[integers.length-1]= new IntegerValue(newvalue);
    }

}
