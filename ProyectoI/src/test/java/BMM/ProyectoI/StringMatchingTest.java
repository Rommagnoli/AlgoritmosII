package BMM.ProyectoI;

import org.junit.*;
import static org.junit.Assert.*;

public class StringMatchingTest{

    //Test para corroborar el funcionamiento del metodo match de la clase StringMatching.
    @Test
    public void testMatchCadenas(){
        String text = "dsfaksvmsidododfsasd";
        String cadMatch = "dodo";
        int res = StringMatching.match(text,cadMatch);
        assertEquals(10,res);
    }

    //Test para corroborar el funcionamiento del metodo matchKmp de la clase StringMatching.
    @Test
    public void testMatchCadenasKmp(){
        String text = "aswqqeavooewzaratewqxcvsa";
        String cadMatch = "zarate";
        int res = StringMatching.matchKmp(text,cadMatch);
        assertEquals(12,res);
    }
}
