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

    public void printIntegers() {
        for (int i=0; i<integers.length; i++) System.out.println("Cell: "+i+ " value: "+integers[i].getValue());
    }

    public int getSize(){
        return integers.length;
    }

    public void addAll(int[] newintegers) {
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

    public void insertValueInto (int valueId, int newvalue){
        integers[valueId]= new IntegerValue(newvalue);
    }

    public void add (int newvalue){
        massivChangeLength(integers.length+1);
        integers[integers.length-1]= new IntegerValue(newvalue);
    }

    public int getValue(int valueID){
        return integers[valueID].getValue();
    }

    public boolean contains (int value) {
        for (int i=0; i<integers.length; i++) {
            if (integers[i].getValue()==value) return true;
            }
        return false;
    }

    public int find (int value) {
        for (int i=0; i<integers.length; i++) {
            if (integers[i].getValue()==value) return i;
        }
        return 0;
    }

    public void clear(){
        integers = new IntegerValue[ARRAYSTARTINGLENGTH];
    }

    public boolean equals(int[] newintegers) {
        for (int i=0; i<this.integers.length;i++) {
         if (integers[i].getValue()!=newintegers[i]) return false;
         }
        return true;
    }

    public void sort () {
        int bubble=0;
        for (int i = 0; i < integers.length-1; i++){
            for (int j = 0; j<integers.length -i-1; j++){
                if (integers[j].getValue()>integers[j+1].getValue()) {
                    bubble = integers[j+1].getValue();
                    integers[j+1]=integers[j];
                    integers[j]= new IntegerValue(bubble);
                }
            }
        }
    }


}
