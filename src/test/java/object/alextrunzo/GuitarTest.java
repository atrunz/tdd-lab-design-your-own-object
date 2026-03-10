package object.alextrunzo;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class GuitarTest {

    @Test
    public void constructorShouldCreateGuitarWithValidData() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        assertEquals("Gibson", guitar.getBrand());
        assertEquals("Les Paul", guitar.getModel());
        assertEquals("Jumbo", guitar.getColor());
        assertTrue(guitar.isElectric());
        assertEquals(24, guitar.getNumberOfFrets());
        assertEquals(24, guitar.getPrice());
        assertTrue(guitar.isPluggedIn());
        assertEquals(0, guitar.getVolumeKnobSetting());
        assertEquals("E Standard", guitar.getTuning());
    }

    @Test
    public void setBrandShouldUpdateBrand() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        guitar.setBrand("Fender");

        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void setModelShouldUpdateModel() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        guitar.setModel("Stratocaster");

        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void setColorShouldUpdateColor() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        guitar.setColor("Green");

        assertEquals("Green", guitar.getColor());
    }

    @Test
    public void setElectricShouldUpdateElectricField() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        guitar.setElectric(false);

        assertFalse(guitar.isElectric());
    }

    @Test
    public void setNumberOfFretsShouldUpdateNumberOfFrets() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        guitar.setNumberOfFrets(22.5);

        assertEquals(22.5, guitar.getNumberOfFrets());
    }

    @Test
    public void setPriceShouldUpdatePrice() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        guitar.setPrice(225);

        assertEquals(225, guitar.getPrice());
    }

    @Test
    public void setPluggedInShouldUpdatePluggedInField() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        guitar.setPluggedIn(false);

        assertFalse(guitar.isPluggedIn());
    }

    @Test
    public void setVolumeKnobSettingShouldUpdateVolumeKnobSetting() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        guitar.setVolumeKnobSetting(3);

        assertEquals(3, guitar.getVolumeKnobSetting());
    }

    @Test
    public void tuneShouldUpdateTuning() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        guitar.tune("Drop D");

        assertEquals("Drop D", guitar.getTuning());
    }

    @Test
    public void playShouldPrintPlayingMessage() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            guitar.play();
        } finally {
            System.setOut(originalOut);
        }

        assertTrue(output.toString().contains("You are playing the Gibson Les Paul"));
    }

    @Test
    public void plugInShouldPrintPlugInMessage() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, false, "E Standard");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            guitar.plugIn();
        } finally {
            System.setOut(originalOut);
        }

        assertTrue(output.toString().contains("You are pluging the Gibson Les Paulin"));
    }

    @Test
    public void setVolumeShouldTurnVolumeUpWhenInputIsHigher() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayInputStream input = new ByteArrayInputStream("5\n".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setIn(input);
        System.setOut(new PrintStream(output));

        try {
            guitar.setVolume();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        assertEquals(5, guitar.getVolumeKnobSetting());
        assertTrue(output.toString().contains("Enter your new volume"));
        assertTrue(output.toString().contains("You turned up your volume to 5"));
    }

    @Test
    public void setVolumeShouldTurnVolumeDownWhenInputIsLower() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");
        guitar.setVolumeKnobSetting(7);

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayInputStream input = new ByteArrayInputStream("3\n".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setIn(input);
        System.setOut(new PrintStream(output));

        try {
            guitar.setVolume();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        assertEquals(3, guitar.getVolumeKnobSetting());
        assertTrue(output.toString().contains("Enter your new volume"));
        assertTrue(output.toString().contains("You turned down your volume to 3"));
    }

    @Test
    public void setVolumeShouldRejectEqualVolume() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");
        guitar.setVolumeKnobSetting(4);

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayInputStream input = new ByteArrayInputStream("4\n".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setIn(input);
        System.setOut(new PrintStream(output));

        try {
            guitar.setVolume();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        assertEquals(4, guitar.getVolumeKnobSetting());
        assertTrue(output.toString().contains("Enter your new volume"));
        assertTrue(output.toString().contains("Sorry bud, your volume doesn't go that far"));
    }

    @Test
    public void setVolumeShouldRejectInputAboveTen() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayInputStream input = new ByteArrayInputStream("11\n".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setIn(input);
        System.setOut(new PrintStream(output));

        try {
            guitar.setVolume();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        assertEquals(0, guitar.getVolumeKnobSetting());
        assertTrue(output.toString().contains("Enter your new volume"));
        assertTrue(output.toString().contains("Sorry bud, your volume doesn't go that far"));
    }

    @Test
    public void setVolumeShouldRejectNegativeInput() {
        Guitar guitar = new Guitar("Gibson", "Les Paul", "Jumbo",
                true, 24, 24, true, "E Standard");

        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;
        ByteArrayInputStream input = new ByteArrayInputStream("-1\n".getBytes());
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setIn(input);
        System.setOut(new PrintStream(output));

        try {
            guitar.setVolume();
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }

        assertEquals(0, guitar.getVolumeKnobSetting());
        assertTrue(output.toString().contains("Enter your new volume"));
        assertTrue(output.toString().contains("Sorry bud, your volume doesn't go that far"));
    }
}