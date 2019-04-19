package BMM.ProyectoI;

import org.junit.*;
import static org.junit.Assert.*;

public class LongestRepetitionTest {

    //Tests para corroborar el funcionamiento del metodo cadRepeat de la clase LongestRepetition.
    @Test
    public void testCadRepetidas() {
        String prueba = "asdholaasdmholaholasphola";
        String res = LongestRepetition.cadRepetidas(LongestRepetition.subcadenas(prueba));
        assertEquals("hola", res);
    }

    @Test
    public void testCadRepetidasNotRepeat() {
        String prueba = "abcdefghijklmnopqrst";
        String res = LongestRepetition.cadRepetidas(LongestRepetition.subcadenas(prueba));
        assertEquals("", res);
    }

}
