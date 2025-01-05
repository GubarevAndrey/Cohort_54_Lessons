package less25.HW.task1;

public class  MagicArrayGen <T> {
    private T [] array;
    private int cursor;
    public MagicArrayGen() {
        array=(T[])new Object[10];
    }
    public MagicArrayGen(T[] ints) {
        if (ints != null) {
            this.array=(T[])new Object[ints.length*2];
            addAll(ints);
        } else {
            this.array=(T[])new Object[10];
        }
    }
    public void add (T value) {
        if (cursor==array.length-1) {
            expandArray();
        }
        array[cursor]=value;
        cursor++;
    }
    @SuppressWarnings("unchecked")
    public T[] toArray(){
        T [] arrayTemp = (T[])new Object[cursor];
        for (int i=0;i<cursor;i++) {
            arrayTemp[i]=array[i];
        }
     //   System.out.println("arrayTemp"+arrayTemp);
        return arrayTemp;
    }
    private void expandArray() {
        System.out.println("Расширяю массив:"+cursor);
        T[] newArray= (T[])new Object [array.length*2];
        for (int i=0; i<cursor; i=i+1) {
            newArray[i]=array[i];
        }
        array=newArray;
    }
    public T remove (int index) {
        if (index <0 || index>=cursor) {
            return null;
        }
        T value=array[index];
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
            result=result+array[i].toString() + ((i<cursor-1) ? ", " : "]" );
        }
        return result;
    }
    public int size () {
        return cursor;
    }


    public T get(int index) {
        if (index>=0 && index<cursor) {
            return array[index];
        }
        return null;
    }

    public int indexOf(T value) {
          for (int i=0; i<cursor;i++) {
              if (array[i].equals(value)) {
                  return i;
              }
          }
          return -1;
    }


    public int lastIndexOf(T value) {
        int index=0;
        for (int i=0; i<cursor;i++) {
            if (array[i].equals(value)) {
                index=i;
            }
        }
        return index;
    }

    public T set(int index,T newValue) {
        if (index<0 || index>=cursor) {
            return null;
        }
        T oldValue=array[index];
        array[index]=newValue;
        return oldValue;
    }

    public boolean removeByValue(T value) {
        for (int i=0;i<cursor;i=i+1) {
            if (array[i].equals(value)) {
                remove(i);
                return true;
            }
        }
        return false;
    }
    public void addAll(T ... values) {
      for (int i=0; i<values.length;i++)  {
          add(values[i]);
      }
    }

}
