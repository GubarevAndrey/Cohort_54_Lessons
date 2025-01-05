package less26.HW.task1;

public class Pair<T> {
     /*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.
Требования:
Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
 */

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
    public void setFirst(T value){
        this.first=value;
    }
    public void setSecond(T value){
        this.second=value;
    }
    public void swap(){
        T temp=this.first;
        this.first=this.second;
        this.second=temp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
