package less17;

public class Cat {
    String name;
    int age;
    int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString(){
        return "Cat "+name+ ", Age "+age+", weight "+weight;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName (String name) {
        if (name==null || name.isEmpty()) {
            System.out.println("Некорректоное имя");
            return;
        }
        this.name=name;
    }

    public void setAge (int age) {
        if (age >0 && age< 20) {
            this.age=age;
        }
    }

}
