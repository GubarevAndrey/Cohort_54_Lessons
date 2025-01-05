package less25.generics;

// По договоренности используютя символы
// T-type(тип), E-element(элемент), K-key, V-value
// Но можно между <> написать все что угодно
public class GenericBox <T> {
    private  T value;

    //Конструктор
    public GenericBox (T value){
        this.value=value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}
