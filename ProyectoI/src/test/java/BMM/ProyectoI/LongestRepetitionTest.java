package BMM.ProyectoI;

import org.junit.*;
import static org.junit.Assert.*;

public class LongestRepetitionTest {

    @Test
    public void testCadRepetidas() {
        String prueba = "asdholaasdmholasphola";
        String res = LongestRepetition.cadRepetidas(LongestRepetition.subcadenas(prueba));
        assertEquals("hola", res);
}

}
