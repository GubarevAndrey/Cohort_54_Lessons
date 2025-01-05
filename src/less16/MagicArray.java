package less16;

public class MagicArray {
    int[] array;
    int cursor;
    public MagicArray() {
        array=new int[10];
    }
    void add (int value) {
        if (cursor==array.length-1) {
            expandArray();
        }
        array[cursor]=value;
        cursor++;
    }
    private void expandArray() {
        int[] newArray= new int [array.length*2];
        for (int i=0; i<cursor; i=i+1) {
            newArray[i]=array[i];
        }
        array=newArray;
    }
    int remove (int index) {
        if (index <0 || index>=cursor) {
            return Integer.MIN_VALUE;
        }
        int value=array[index];
        for (int i=index ; i<cursor-1;i++) {
            array[i]=array[i+1];
        }
        cursor--;
        return value;
    }

    public String toString() {
        String result="[";
        if (cursor==0) return "[]";
        for (int i=0;i<cursor;i++) {
            result=result+array[i] + ((i<cursor-1) ? ", " : "]" );
        }
        return result;
    }
    int size () {
        return cursor;
    }

    int get(int index) {
        if (index <0 || index>=cursor) {
            return Integer.MIN_VALUE;
        }
        return array[index];
    }


    void addAll(int ... values) {
      for (int i=0; i<values.length;i++)  {
          add(values[i]);
      }
    }

}
