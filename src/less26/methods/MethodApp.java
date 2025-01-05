package less26.methods;

import less26.MyArrayList;
import less26.MyList;

public class MethodApp {
    public static void main(String[] args) {

        Integer[] integers={1,2,3,4,5,6};
        String str=UtilsGeneric.printArray(integers);
        System.out.println(str);

        String[] strings ={"a","b","c","d"};
        String str1= UtilsGeneric.printArray(strings);
        System.out.println(str1);

        Double[] doubles={2.3,5.7,7.74,6.765};
        String str2= UtilsGeneric.printArray(doubles);
        System.out.println(str2);

        UtilsGeneric.swap(doubles,0,2);
        str2= UtilsGeneric.printArray(doubles);
        System.out.println(str2);

        double sum = UtilsGeneric.sum(integers);
        System.out.println(sum);

        sum=UtilsGeneric.sum(doubles);
        System.out.println(sum);

        MyList<Integer> integerMyList=new MyArrayList<>();
        integerMyList.addAll(1,2,3,4,5);
        double intSum=UtilsGeneric.listSum(integerMyList);
        System.out.println(intSum);

        UtilsGeneric.addNumbers(integerMyList);
        System.out.println(integerMyList);




    }
}
