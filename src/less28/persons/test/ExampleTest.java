package less28.persons.test;

import less27.enums.days.Day;
import less27.persons.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


//Метод , помеченный @BeforeEach будет выполняться перед каждым тестовым методом
class ExampleTest {
    @BeforeEach
    void setUp(){
        System.out.println("Метод  @BeforeEach");
    }


    /*
    - @BeforeEach - метод помеченный будет выполняться перед каждым тестовым методом
    - @BeforeAll - метод выполнится только один раз до выполнения самого первого тестового метода (требует статику)
    - @AfterEach -метод помеченный будет выполняться  после каждого тестового метода
    - @AfterAll- метод выполнится только один раз после выполнения последнего тестового метода(требует статику)
    - @Disabled - означает что метод будет отключен от теста
    */


    /* Указываем что метод является тестовым. Таким образом JUnit знает что этот метод нужно
    запустить во время выполнения тестов
    */
    @Test
    public void testAddition(){
        System.out.println("Test addition");
        int result=2+2;

        // Методы проверки утверждений

        // assertEquals(expected, actual). Где expected - ожидаемое. actual-фактическое

       // Assertions.assertEquals(4,result);// проверяет равны ли два значения
        /* из-за того что мы вверу перед классом написали import static org.junit.jupiter.api.Assertions.*;
              то можно не прописывать Assertions.     */
        assertEquals(4,result);// то же самое
        Assertions.assertNotEquals(9,result);// проверка что не равны
        assertTrue(result>=4);//возвращает true
        assertFalse(result>4);// возвращает false
        assertNull(null);//Проверяет что обьект равен null
        assertNotNull("Hello");


    }

    @Disabled
    @Test
    public void emptyTest(){
        System.out.println("Empty test");
        //Пустой тестовый метод считается успешно пройденным, т.к в методе нет ложных утверждений
    }

    //параметризированный тест
    @ParameterizedTest
    @ValueSource (ints = {1,5,9,11})  // Тест будет проходить 4 раза для каждого значения элемента массива
    public void testNumbers(int number) {
        System.out.println("number= "+number);
        assertTrue(number>0);

    }
    @ParameterizedTest
    @ValueSource (strings = {"Banana", "Apple","Kokos" })
    public void testFruit(String fruit){
        System.out.println("Fruit=" + fruit);
        assertTrue(fruit.length()>2);
    }

    //CSV -  Comma-Separated-Value - значения, разделенные запятой
    //Это табличный формат данных значений, разделенных запятой. Чаще это файлы
    //Apple,1
    //Banana,2
    @ParameterizedTest
    @CsvSource ({"Apple, 1","banana, 2", "cherry, 3"})
    void testWithCsvSource(String fruit,int rank){
        System.out.println(fruit+" | "+(rank+10));
        assertTrue(fruit.length()>4 && rank>0);

    }

// Источник данных в формате CSV- расширение не обязательно scv
    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testWithCsvFileSource(String fruit, int rank, boolean flag){
        System.out.println(fruit+" | "+rank+" | "+ ! flag);
        assertNotNull(fruit);
        assertTrue(rank>0);
    }


    //Источник данных - Enum
    @ParameterizedTest
    @EnumSource(Day.class)
    void  testEnum (Day day){
        System.out.println("day: "+day);
        assertNotNull(day);
    }

    @ParameterizedTest
    @MethodSource("testDataString")
    public void testWithMethodSource(String argument) {
        System.out.println("argument="+argument);
        assertNotNull(argument);

    }
//Метод, который поставляет данные должен быть статическим
    static Stream<String> testDataString() {
        return Stream.of("apple","banana","cherry");

    }
    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSource2(int value, int expected, boolean isEquals){
        System.out.println(value+" | "+expected+" | "+isEquals);
        int result=value*value;
        assertEquals(isEquals,result==expected);

    }

    static Stream<Arguments> testDataArguments(){
        return Stream.of(
                Arguments.of(2,4,true),
                Arguments.of(3,9,true),
                Arguments.of(4,15,false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonsData")
    void testPersonsData(Person person,String email) {
        System.out.println("person: "+person);
        System.out.println("email: "+email);
        System.out.println("=======");

    }

    static Stream<Arguments> testPersonsData () {
        Person person =new Person("email@mail.net","paSsword1[");
        return Stream.of(
                Arguments.of(person,"new123@mail.net"),
                Arguments.of(new Person("invalid.email.com","password"),"mail.test.com")

        );
    }

}