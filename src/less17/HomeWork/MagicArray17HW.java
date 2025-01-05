package less17.HomeWork;

public class MagicArray17HW {
    private int[] array;
    private int cursor;
    public MagicArray17HW() {
        array=new int[10];
    }
    public MagicArray17HW(int[] ints) {
        if (ints != null) {
            this.array=new int[ints.length*2];
            addAll(ints);
        } else {
            this.array=new int[10];
        }
    }
    public void add (int value) {
        if (cursor==array.length-1) {
            expandArray();
        }
        array[cursor]=value;
        cursor++;
    }
    public int[] toArray(){
        int [] arrayTemp = new int[cursor];
        for (int i=0;i<cursor;i++) {
            arrayTemp[i]=array[i];
        }
        return arrayTemp;
    }
    private void expandArray() {
        System.out.println("Расширяю массив:"+cursor);
        int[] newArray= new int [array.length*2];
        for (int i=0; i<cursor; i=i+1) {
            newArray[i]=array[i];
        }
        array=newArray;
    }
    public int remove (int index) {
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
    public int size () {
        return cursor;
    }


    public int get(int index) {
        if (index>=0 && index<cursor) {
            return array[index];
        }
        return Integer.MIN_VALUE;
    }

    public int indexOf(int value) {
          for (int i=0; i<cursor;i++) {
              if (array[i]==value) {
                  return i;
              }
          }
          return -1;
    }


    public int lastIndexOf(int value) {
        for (int i=0; i<cursor;i++) {
            if (array[i]==value) {
            }
        }
        return -1;
    }

    public int set(int index,int newValue) {
        if (index<0 || index>=cursor) {
            return Integer.MIN_VALUE;
        }
        int oldValue=array[index];
        array[index]=newValue;
        return oldValue;
    }

    public boolean removeByValue(int value) {
        for (int i=0;i<cursor;i=i+1) {
            if (array[i]==value) {
                remove(i);
                return true;
            }
        }
        return false;
    }
    public void addAll(int ... values) {
      for (int i=0; i<values.length;i++)  {
          add(values[i]);
      }
    }

}
