package BMM.ProyectoI;

import org.junit.*;
import static org.junit.Assert.*;

public class LongestRepetitionTest {

    //Tests para corroborar el funcionamiento del metodo cadRepeat de la clase LongestRepetition.
    @Test
    public void testCadRepetidas() {
        String prueba = "asdholaasdmholaholasphola";
        String resultado = LongestRepetition.cadRepetidas(LongestRepetition.subcadenas(prueba));
        assertEquals("hola", resultado);
    }

    @Test
    public void testCadRepetidasNotRepeat() {
        String prueba = "abcdefghijklmnopqrst";
        String resultado = LongestRepetition.cadRepetidas(LongestRepetition.subcadenas(prueba));
        assertEquals("", resultado);
    }

    //Tests para corroborar el funcionamiento del metodo repetitionDC de la clase LongestRepetition.
    @Test
    public void testRepetitionDC(){
        String prueba = "qwerasdasdokp";
        String resultado = LongestRepetition.repetitionDc(prueba);
        assertEquals("asd",resultado);
    }

    @Test
    public void testRepetitionDCNotFound(){
        String prueba = "qwertyuipo";
        String resultado = LongestRepetition.repetitionDc(prueba);
        assertEquals("",resultado);
    }

}
