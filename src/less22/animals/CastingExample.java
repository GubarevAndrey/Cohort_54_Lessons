package less22.animals;

public class CastingExample {
    public static void main(String[] args) {
        // Восходящее и нисходящее преобразование

        /* Восходящее преобразование- возможность
        присвоить переменной типа предка ссылку на обьект
        потомка

         */


        Cat cat = new Cat();
        Animal animal=cat;// Восходящее неявное преобразование
        Animal animal1=new Cat(); /* Тип обьекта Cat
                       автоматически преобразуется к
                       типу Animal
              Восходящее преобразование является безопасным,
              т.к у родительского класса гарантировано есть все методы
              родительского класса
                       */
/*
     Тип ссылочной переменной определяет:
     1. Ссылки на оьбекты каких типов здесь могут храниться
        (быть присвоены)
     2. Какие методы мне доступны для вызова с этой переменной
 */
        System.out.println("==================");
        animal1.voice();

        System.out.println("==================");
        Animal animal2 = new Dog();
        Animal animal3 = new Hamster();
        Animal [] animals=new Animal[3];
        animals[0]=animal1;
        animals[1]=animal2;
        animals[2]=animal3;
        for (int i=0; i<animals.length;i++){
            animals[i].voice();
        }

        Cat catLink;
        Animal animalLink=new Cat();
        /* animalLink.eat(); на ссылке типа Animal медот eat()
        из класса Cat не доступен
         */

        catLink= (Cat)animalLink; /* нисходящее явное преобразование
             не является безопасным.
        */
        catLink.eat();

        for(int i=0;i<animals.length;i++){
            Animal current= animals[i];
            System.out.println("sout: "+current);

            /* В классе Object есть метод getClass() -
            получение типа обьекта
             */
            System.out.println("getClass:"+current.getClass());
            System.out.println("getClass:"+current.getClass().getName());
            System.out.println("getClass:"+current.getClass().getSimpleName());

            /* istanceof - возвращает значение boolean, проверят
            является ли обьект экземпляром нужного подкласса.Т.е
            проверяет можно ли преобразовать обьект к типу ссылки
             */
            if(animals[i] instanceof Cat) {
                System.out.println(i+"-й индекс можно безопасно привести к Cat");
                Cat tempCat = (Cat) current; /* небезопасное преобразование
                 */
                tempCat.eat();

                System.out.println("===========");
            }

        }

    }
}
