package object.alextrunzo;

import object.alextrunzo.Guitar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GuitarTest {
        @Test
        public void constructorShouldCreateGuitarWithValidData() {

            Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                    true, 24, 24, true,
                    "E Standard");

            assertEquals("Gibson", guitar.getBrand());
            assertEquals("Les Paul", guitar.getModel());
            assertEquals("Jumbo", guitar.getColor());
            assertTrue(guitar.isElectric());
            assertEquals(24, guitar.getPrice());
            assertEquals("E Standard", guitar.getTuning());
            assertTrue(guitar.isPluggedIn());
            assertEquals(0, guitar.getVolumeKnobSetting());



        }

    @Test
        public void setBrandShouldUpdateBrand() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true,
                "E Standard");
            guitar.setBrand("Fender");
            assertEquals("Fender", guitar.getBrand());
        }

    @Test
    public void setModelShouldUpdateModel() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true,
                "E Standard");
        guitar.setModel("Stratocastor");
        assertEquals("Stratocastor", guitar.getModel());
    }

    @Test
    public void setColorShouldUpdateColor() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true,
                "E Standard");
        guitar.setColor("Green");
        assertEquals("Green", guitar.getColor());
    }

    @Test
    public void setIsElectricShouldUpdateIsElectric() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true,
                "E Standard");
        guitar.setElectric(false);
        assertEquals(false, guitar.isElectric());
    }


    @Test
    public void setNumberOfFretsShouldUpdateNumberOfFrets() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true,
                "E Standard");
        guitar.setNumberOfFrets(22.5);
        assertEquals(22.5, guitar.getNumberOfFrets());
    }


    @Test
    public void setPriceShouldUpdatePrice() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true,
                "E Standard");
        guitar.setPrice(225);
        assertEquals(225, guitar.getPrice());
    }

    @Test
    public void setIsPluggedInShouldUpdateIsPluggedIn() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true,
                "E Standard");
        guitar.setPluggedIn(false);
        assertEquals(false, guitar.isPluggedIn());
    }

    @Test
    public void setTuningShouldUpdateTuning() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true,
                "E Standard");
        guitar.tune("Drop D");
        assertEquals("Drop D", guitar.getTuning());
    }



//
//        @Test
//        public void constructorWithNegativeAgeShouldThrowException() {
//            assertThrows(
//                    IllegalArgumentException.class,
//                    () -> new Person("Jane", "Smith", -1,
//                            "jane@email.com", "555-1234")
//            );
//        }
//
//        @Test
//        public void setFirstNameShouldUpdateFirstName() {
//            Person person = new Person("Jane", "Smith", 25,
//                    "jane@email.com", "555-1234");
//            person.setFirstName("Jordan");
//            assertEquals("Jordan", person.getFirstName());
//        }
//
//        @Test
//        public void setLastNameShouldUpdateLastName() {
//            Person person = new Person("Jane", "Smith", 25,
//                    "jane@email.com", "555-1234");
//            person.setLastName("Eldridge");
//            assertEquals("Eldridge", person.getLastName());
//        }
//
//        @Test
//        public void setAgeShouldUpdateAge() {
//            Person person = new Person("Jane", "Smith", 25,
//                    "jane@email.com", "555-1234");
//            person.setAge(30);
//            assertEquals(30, person.getAge());
//        }
//
//        @Test
//        public void setAgeWithNegativeValueShouldThrowException() {
//            Person person = new Person("Jane", "Smith", 25,
//                    "jane@email.com", "555-1234");
//            assertThrows(
//                    IllegalArgumentException.class,
//                    () -> person.setAge(-1)
//            );
//        }
//
//        @Test
//        public void setEmailShouldUpdateEmail() {
//            Person person = new Person("Jane", "Smith", 25,
//                    "jane@email.com", "555-1234");
//            person.setEmail("jordan@email.com");
//            assertEquals("jordan@email.com", person.getEmail());
//        }
//
//        @Test
//        public void setPhoneNumberShouldUpdatePhoneNumber() {
//            Person person = new Person("Jane", "Smith", 25,
//                    "jane@email.com", "555-1234");
//            person.setPhoneNumber("555-5678");
//            assertEquals("555-5678", person.getPhoneNumber());
//        }
//
//        @Test
//        public void getFullNameShouldReturnFirstAndLastName() {
//            Person person = new Person("Jane", "Smith", 25,
//                    "jane@email.com", "555-1234");
//            assertEquals("Jane Smith", person.getFullName());
//        }
//
//        @Test
//        public void isAdultShouldReturnTrueWhenAgeIsEighteenOrOver() {
//            Person person = new Person("Jane", "Smith", 18,
//                    "jane@email.com", "555-1234");
//            assertTrue(person.isAdult());
//        }
//
//        @Test
//        public void isAdultShouldReturnFalseWhenAgeIsUnderEighteen() {
//            Person person = new Person("Jane", "Smith", 17,
//                    "jane@email.com", "555-1234");
//            assertFalse(person.isAdult());
//        }

}
