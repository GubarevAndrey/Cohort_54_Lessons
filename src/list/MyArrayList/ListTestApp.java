package list.MyArrayList;

public class ListTestApp {
    public static void main(String[] args) {

        MyArrayList<Integer> arrayList=new MyArrayList<>();
        arrayList.add(2);

        // Если не указать параметр типа по по умолчанию будет тип Object
        MyArrayList arrayList1 = new MyArrayList<>();
        arrayList1.add("ytyt");



    }
}
