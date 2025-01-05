package less29.equals;

public class lesson29 {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        String s3= new String("Java");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("=================");

        // из-за new будут созданы разные обьекты
        Employee employee = new Employee("Max","Ivanov",25);
        Employee employee1 = new Employee("max","Ivanov",25);
        Employee employee2 = new Employee("Piter","Petrov",33);
        Employee employee3 = new Employee("Piter","Petrov",55);
        Employee employee4 = new Employee("Max","Ivanov",25);

        System.out.println(employee2==employee1); // false
        System.out.println(employee==employee4); // false

        System.out.println("================");

        System.out.println(employee.equals(employee4)); // false- после переопределения будет true
        System.out.println(employee.equals(employee1)); // false - по умолчанию Java не знает какие поля сравнивать
                                                      // нужно переопределить метод equals
        System.out.println(employee2.equals(employee4)); // false
        System.out.println(employee2.equals(employee3)); // false

        System.out.println("================");
        Employee nullemployee = new Employee(null,null,25);
        Employee nullemployee1 = new Employee(null,null,25);
        System.out.println(nullemployee.equals(nullemployee1));//true

    }
}
