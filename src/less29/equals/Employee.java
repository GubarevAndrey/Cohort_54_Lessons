package less29.equals;

import java.util.Objects;

public class Employee {
    private String name;
    private String lastname;
    private int age;

    public Employee(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

 /*   @Override

    public boolean equals(Object obj) {
        if (this==obj) return true; // проверка на сравнение с самим собой
        if(obj==null || this.getClass() != obj.getClass()) return false;// Проверка на совпадение классов

        Employee employee=(Employee) obj; // кастируем obj до Employee

        // Теперь сравнение значимых полей
        if(! Objects.equals(this.name,employee.name)) return false; // Есть метод Objects у дедушки Object
                                // который безопасно сравнивает обьекты даже если ктото из них null

        if( ! Objects.equals(this.lastname,employee.lastname)) return  false;
        return this.age==employee.age;
    }

  */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (!Objects.equals(name, employee.name)) return false;
        return Objects.equals(lastname, employee.lastname);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
