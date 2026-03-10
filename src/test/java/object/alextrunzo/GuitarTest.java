package object.alextrunzo;

import object.example.Person;
import object.alextrunzo.Guitar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GuitarTest {
        @Test
        public void constructorShouldCreateGuitarWithValidData() {

            Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                    "Alder", "Rosewood", "Suburst",
                    true, false, 24, 6,
                    "Humbucker", 2000.00, "10s",
                    false, 0, "E Standard");

            assertEquals("Gibson", guitar.getBrand());
            assertEquals("Les Paul", guitar.getModel());
            assertEquals("Jumbo", guitar.getBodyStyle());
            assertEquals("Alder", guitar.getBodyWoodType());
            assertEquals("Rosewood", guitar.getFretboardType());
        }


        @Test
        public void constructorWithNegativeAgeShouldThrowException() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> new Person("Jane", "Smith", -1,
                            "jane@email.com", "555-1234")
            );
        }

        @Test
        public void setFirstNameShouldUpdateFirstName() {
            Person person = new Person("Jane", "Smith", 25,
                    "jane@email.com", "555-1234");
            person.setFirstName("Jordan");
            assertEquals("Jordan", person.getFirstName());
        }

        @Test
        public void setLastNameShouldUpdateLastName() {
            Person person = new Person("Jane", "Smith", 25,
                    "jane@email.com", "555-1234");
            person.setLastName("Eldridge");
            assertEquals("Eldridge", person.getLastName());
        }

        @Test
        public void setAgeShouldUpdateAge() {
            Person person = new Person("Jane", "Smith", 25,
                    "jane@email.com", "555-1234");
            person.setAge(30);
            assertEquals(30, person.getAge());
        }

        @Test
        public void setAgeWithNegativeValueShouldThrowException() {
            Person person = new Person("Jane", "Smith", 25,
                    "jane@email.com", "555-1234");
            assertThrows(
                    IllegalArgumentException.class,
                    () -> person.setAge(-1)
            );
        }

        @Test
        public void setEmailShouldUpdateEmail() {
            Person person = new Person("Jane", "Smith", 25,
                    "jane@email.com", "555-1234");
            person.setEmail("jordan@email.com");
            assertEquals("jordan@email.com", person.getEmail());
        }

        @Test
        public void setPhoneNumberShouldUpdatePhoneNumber() {
            Person person = new Person("Jane", "Smith", 25,
                    "jane@email.com", "555-1234");
            person.setPhoneNumber("555-5678");
            assertEquals("555-5678", person.getPhoneNumber());
        }

        @Test
        public void getFullNameShouldReturnFirstAndLastName() {
            Person person = new Person("Jane", "Smith", 25,
                    "jane@email.com", "555-1234");
            assertEquals("Jane Smith", person.getFullName());
        }

        @Test
        public void isAdultShouldReturnTrueWhenAgeIsEighteenOrOver() {
            Person person = new Person("Jane", "Smith", 18,
                    "jane@email.com", "555-1234");
            assertTrue(person.isAdult());
        }

        @Test
        public void isAdultShouldReturnFalseWhenAgeIsUnderEighteen() {
            Person person = new Person("Jane", "Smith", 17,
                    "jane@email.com", "555-1234");
            assertFalse(person.isAdult());
        }

}
