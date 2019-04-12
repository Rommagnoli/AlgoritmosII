package BMM.ProyectoI;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        /*String s = "romanyagustin hola josuegato";
        System.out.println(StringMatching.match(s,"hola"));
        */
        ArrayList<String> todasCad = new ArrayList<String>();

        todasCad = LongestRepetition.subcadenas("abaaadsaaavbbbbbdaffffffsybbbbbaffffffd");
        System.out.println(LongestRepetition.cadRepetidas(todasCad));
    }
}
