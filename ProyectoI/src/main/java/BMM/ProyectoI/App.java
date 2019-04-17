package BMM.ProyectoI;
import java.util.*;

public class App {

    public static void main( String[] args) {
        // Inciso 1
    	String text = "aca puede estar separado todo";
    	String pattern = "todo";

    	// Llamando al metodo match de StringMatching
    	System.out.println("------ INCISO 1 ------\n");
    	Long iniTime1match = System.currentTimeMillis();
    	int res = StringMatching.match(text, pattern);
    	Long endTime1match = System.currentTimeMillis() - iniTime1match;
    	if (res != -1)
    		System.out.println("La palabra " + "-" + pattern + "- " + "comienza en la posicion: " + res +" del texto");
    	else
    		System.out.println("La palabra " + "-" + pattern + "- " + "no se encuentra en el texto");
    	System.out.println("El tiempo para String Matching con FB es: " + endTime1match + " milisegundos\n");

    	// Llamando al metodo matchKmp de StringMatching
    	Long iniTime1kmp = System.currentTimeMillis();
    	res = StringMatching.matchKmp(text, pattern);
    	Long endTime1kmp = System.currentTimeMillis() - iniTime1kmp;

    	if (res != -1)
    		System.out.println("La palabra " + "-" + pattern + "- " + "comienza en la posicion: " + res +" del texto");
    	else
    		System.out.println("La palabra " + "-" + pattern + "- " + "no se encuentra en el texto");
    	System.out.println("El tiempo para String Matching con el algoritmo de KMP es: " + endTime1kmp + " milisegundos\n");

    	// Inciso 2
    	ArrayList<String> todasCad = new ArrayList<String>();
    	Long iniTime2 = System.currentTimeMillis();
    	System.out.println("------ INCISO 2 ------\n");
    	String textLR = "y va el tercero,y va el tercero y gol de river, gooooooool\n";
    	System.out.println("Texto: " + textLR);
    	todasCad = LongestRepetition.subcadenas(textLR);
        System.out.println("La cadena que se repite es: " + LongestRepetition.cadRepetidas(todasCad));
        Long endTime2 = System.currentTimeMillis() - iniTime2;
        System.out.println("El tiempo para cadRepetidas es: " + endTime2 + " milisegundos");
    }
}
