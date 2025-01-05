package less26.HW.task3;
/*
Задача 9: Обобщенный класс с ограничениями типов
Описание:
Создайте обобщенный класс NumericPair, который хранит две числовые переменные и имеет метод для вычисления их суммы.
Требования:
•	Класс должен иметь конструктор для инициализации двух чисел.
•	Метод double sum() возвращает сумму этих чисел.

Copy
Пример использования:
NumericPair<Integer> intPair = new NumericPair<>(10, 20);
System.out.println(intPair.sum()); // Вывод: 30.0

NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
System.out.println(doublePair.sum()); // Вывод: 10.0
 */
public  class  NumericPair <T extends Number, U extends Number> {
    private T input1;
    private U Input2;

    public NumericPair(T input1, U input2) {
        this.input1 = input1;
        Input2 = input2;
    }

    public static  <T extends Number, U extends Number> double sum(T input1,U input2){
        return input1.doubleValue()+input2.doubleValue();
    }
}
