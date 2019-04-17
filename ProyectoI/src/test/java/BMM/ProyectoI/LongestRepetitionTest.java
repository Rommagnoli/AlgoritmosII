package BMM.ProyectoI;

import org.junit.Test;
import ProyectoI.LongestRepetition;
import static org.junit.Assert.assertEquals;

public class LongestRepetitionTest {

    @Test
    public void testCadRepetidas() {
        String prueba = "asdholaasdmholasphola"
        String res = cadRepetidas(subcadenas(prueba));
        assertEquals("hola", res);
}

}
