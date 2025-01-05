package less26;

import java.lang.reflect.Array;

public class  MyArrayList <T>  implements MyList<T> {
    private T [] array;
    private int cursor;
    public MyArrayList() {
        array=(T[])new Object[10];
    }
    public MyArrayList(T[] ints) {
        if (ints != null) {
            this.array=(T[])new Object[ints.length*2];
            addAll(ints);
        } else {
            this.array=(T[])new Object[10];
        }
    }

    @Override
    public void add(T value) {
            if (cursor==array.length-1) {
                expandArray();
            }
            array[cursor]=value;
            cursor++;
    }

    @Override
    public T[] toArray(){
        //  T [] result= (T[])new Object[cursor]; // Это не работает
        if (cursor==0) {
            return null;
        }
        /*
         Нужно использовать рефлексию:
         Нужно взять какой то обьект у моего массива и узнать  на стадии выполнения программы
         тип этого обьекта и потом используя рефлексию я могу создать массив этого типа данных
         * */
        Class<T> clazz = (Class) array[0].getClass(); // вытаскиваем тип элемента массива

        /* Дальше создать массив такого же типа как нулевой элемент*/
        T[] result = (T[]) Array.newInstance(clazz,cursor);// Класс Array отвечает за рефлексию массивов.
                                                            // Создаем массив с типом clazz и длинной cursor


        for (int i=0;i<cursor;i++) {
            result[i]=array[i];
        }
        return result;
    }
    private void expandArray() {
        System.out.println("Расширяю массив:"+cursor);
        T[] newArray= (T[])new Object [array.length*2];
        for (int i=0; i<cursor; i=i+1) {
            newArray[i]=array[i];
        }
        array=newArray;
    }

    @Override
    public boolean isEmpty(){
        return cursor==0;
    }



    @Override
    public boolean remove (T value) {
        for (int i=0 ; i<cursor;i++) {
            if (array[i].equals(value)) {
                remove(i);
                return true;
            }
        }
        return false;
    }


    @Override
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
    @Override
    public boolean contains(T value){
        return indexOf(value)>=0;
    }


    public String toString() {
        String result="[";
        if (cursor==0) return "[]";
        for (int i=0;i<cursor;i++) {
            result=result+array[i].toString() + ((i<cursor-1) ? ", " : "]" );
        }
        return result;
    }
    @Override
    public int size () {
        return cursor;
    }

    @Override
    public T get(int index) {
        if (index>=0 && index<cursor) {
            return array[index];
        }
        return null;
    }

    @Override
    public int indexOf(T value) {
          for (int i=0; i<cursor;i++) {
              if (array[i].equals(value)) {
                  return i;
              }
          }
          return -1;
    }


    @Override
    public int lastIndexOf(T value) {
        int index=0;
        for (int i=0; i<cursor;i++) {
            if (array[i].equals(value)) {
                index=i;
            }
        }
        return index;
    }

    @Override
    public void set(int index,T newValue) {
        if (index>=0 || index<cursor) {
            T oldValue = array[index];
            array[index] = newValue;
        }
    }


    @Override
    public void addAll(T ... values) {
      for (int i=0; i<values.length;i++)  {
          add(values[i]);
      }
    }

}
