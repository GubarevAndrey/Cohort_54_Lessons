package less27.persons;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("email","paS1sword@");
        System.out.println(person);

        person.setPassword("aBcdefgh1&");
        System.out.println(person);
    }

}
