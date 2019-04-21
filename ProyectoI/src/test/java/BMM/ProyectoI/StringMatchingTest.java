package BMM.ProyectoI;

import org.junit.*;
import static org.junit.Assert.*;

public class StringMatchingTest{

    //Tests para corroborar el funcionamiento del metodo match de la clase StringMatching.
    @Test
    public void testMatchCadenas(){
        String texto = "dsfaksvmsidododfsasd";
        String cadMatch = "dodo";
        int resultado = StringMatching.match(texto,cadMatch);
        assertEquals(10,resultado);
    }

    @Test
    public void testMatchCadenasNotFound(){
        String texto = "dsfaksvmsidododfsasd";
        String cadMatch = "hola";
        int resultado = StringMatching.match(texto,cadMatch);
        assertEquals(-1,resultado);
    }

    //Tests para corroborar el funcionamiento del metodo matchKmp de la clase StringMatching.
    @Test
    public void testMatchCadenasKmp(){
        String texto = "aswqqeavooewzaratewqxcvsa";
        String cadMatch = "zarate";
        int resultado = StringMatching.matchKmp(texto,cadMatch);
        assertEquals(12,resultado);
    }

    @Test
    public void testMatchCadenasKmpNotFound(){
        String texto = "qwertyuiopasdf";
        String cadMatch = "zeta";
        int resultado = StringMatching.matchKmp(texto,cadMatch);
        assertEquals(-1,resultado);
    }
}
