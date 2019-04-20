package BMM.ProyectoI;

import org.junit.*;
import static org.junit.Assert.*;

public class StringMatchingTest{

    //Tests para corroborar el funcionamiento del metodo match de la clase StringMatching.
    @Test
    public void testMatchCadenas(){
        String text = "dsfaksvmsidododfsasd";
        String cadMatch = "dodo";
        int res = StringMatching.match(text,cadMatch);
        assertEquals(10,res);
    }

    @Test
    public void testMatchCadenasNotFound(){
        String text = "dsfaksvmsidododfsasd";
        String cadMatch = "hola";
        int res = StringMatching.match(text,cadMatch);
        assertEquals(-1,res);
    }

    //Tests para corroborar el funcionamiento del metodo matchKmp de la clase StringMatching.
    @Test
    public void testMatchCadenasKmp(){
        String text = "aswqqeavooewzaratewqxcvsa";
        String cadMatch = "zarate";
        int res = StringMatching.matchKmp(text,cadMatch);
        assertEquals(12,res);
    }

    @Test
    public void testMatchCadenasKmpNotFound(){
        String text = "hola";
        String cadMatch = "z";
        int res = StringMatching.matchKmp(text,cadMatch);
        assertEquals(-1,res);
    }
}
