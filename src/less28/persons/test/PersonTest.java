package less28.persons.test;

import less27.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PersonTest {
    Person person;
    String startEmail="john@test.com";
    String startPassword="qwerty1Q$";

    @BeforeEach
    void setUp(){
        person=new Person(startEmail,startPassword);

    }
    @Test
    void testValidEmailSet(){
        String validEmail="valid@test.com";
        person.setEmail(validEmail);
        assertEquals(validEmail,person.getEmail());
        assertNotEquals(startEmail,person.getEmail());
    }


    /*
       1. Берем невалидный Email
       2. Устанавливаем его с помощью person.setEmail()
       3. Ожидаемый результат: invalidEmail установлен не будет
     */
    // Хотим проверить что не устанавливается невалидный email
    @ParameterizedTest
    @MethodSource("invalinEmailData")
     void testInvalidEmailSet(String invalidEmail) {
         person.setEmail(invalidEmail);
         assertNotEquals(invalidEmail,person.getEmail());
         assertEquals(startEmail,person.getEmail());

     }

     static Stream<String>invalinEmailData(){
        return Stream.of("qwer@testcom","test2@.com","test3.com");
     }


    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    void testInvalidPasswordSet(String invalidPassword) {
        person.setPassword(invalidPassword);
        assertNotEquals(invalidPassword,person.getPassword());
        assertEquals(startPassword,person.getPassword());

    }

    static Stream<String>invalidPasswordData(){
        return Stream.of("q&wertY1","testpassword","Password");
    }


}
