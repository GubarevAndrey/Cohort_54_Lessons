package less17.persons;

public class PersonsApp {
    public static void main(String[] args) {

        Person garry = new Person("Garry",31,"Photo");
        System.out.println(garry.toString());
        Person john = new Person("John",75,"reading, music");
        Person[] people = new Person[5]; // создан массив ссылок на обьекты типа Person
        System.out.println("================");
        people[0]=garry;
        people[2]=john;
        System.out.println(john.toString());
        System.out.println(people[2].toString());

        for (int i=0;i< people.length;i=i+1) {
            if (people[i] !=null) {
                System.out.println(people[i].toString());
            } else {
                System.out.println("people["+i+"] is null");
            }
        }
   }
}
