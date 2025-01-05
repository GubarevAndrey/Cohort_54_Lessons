package less17;

public class MagicArray17 {
    int[] array;
    int cursor;
    public MagicArray17() {
        array=new int[10];
    }
    public MagicArray17(int[] ints) {
        if (ints != null) {
            this.array=new int[ints.length*2];
            addAll(ints);
        } else {
            this.array=new int[10];
        }
    }
    void add (int value) {
        if (cursor==array.length-1) {
            expandArray();
        }
        array[cursor]=value;
        cursor++;
    }
    private void expandArray() {
        System.out.println("Расширяю массив:"+cursor);
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
        if (index>=0 && index<cursor) {
            return array[index];
        }
        return Integer.MIN_VALUE;
    }

    int indexOf(int value) {
          for (int i=0; i<cursor;i++) {
              if (array[i]==value) {
                  return i;
              }
          }
          return -1;
    }


    int lastIndexOf(int value) {
        for (int i=0; i<cursor;i++) {
            if (array[i]==value) {
            }
        }
        return -1;
    }

    int set(int index,int newValue) {
        if (index<0 || index>=cursor) {
            return Integer.MIN_VALUE;
        }
        int oldValue=array[index];
        array[index]=newValue;
        return oldValue;
    }

    boolean removeByValue(int value) {
        for (int i=0;i<cursor;i=i+1) {
            if (array[i]==value) {
                remove(i);
                return true;
            }
        }
        return false;
    }
    void addAll(int ... values) {
      for (int i=0; i<values.length;i++)  {
          add(values[i]);
      }
    }

}
