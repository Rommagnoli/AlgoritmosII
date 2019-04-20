package BMM.ProyectoI;
import java.util.*;

public class App {

    private static void printMenu(){
        System.out.println("------------------------------------------------------------");
        System.out.println("-------------------TRABAJO PRACTICO 1-----------------------");
        System.out.println("-+   OPCION 1: String Matching Force Brute                +-");
        System.out.println("-+   OPCION 2: String Matching KMP                        +-");
        System.out.println("-+   OPCION 3: Longest Repeated Substring Force Brute     +-");
        System.out.println("-+   OPCION 4: Longest Repeated Substring Divide & Conquer+-");
        System.out.println("-+   OPCION 5: SALIR                                      +-");
        System.out.println("------------------------------------------------------------");
    }

    public static void main( String[] args) {
        /*// Inciso 1
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
    	String textLR = "y va el tercero,y va el tercero, y gol de river, gooooooool\n";
    	System.out.println("Texto: " + textLR);
    	todasCad = LongestRepetition.subcadenas(textLR);
        System.out.println("La cadena que se repite es: " + LongestRepetition.cadRepetidas(todasCad));
        Long endTime2 = System.currentTimeMillis() - iniTime2;
        System.out.println("El tiempo para cadRepetidas es: " + endTime2 + " milisegundos\n");

        String ejemplo = "kjsdbkjwefjwasdasdjwhdi";
        System.out.println("Tamaño de la cadena que se repite: " + LongestRepetition.repetitionDc(ejemplo));
    */
    Scanner scan = new Scanner(System.in);
    int opcion = 1;
    String texto = "";
    String saltoLinea;
    String pattern = "";
    while (opcion != 5){
        printMenu();
        System.out.println("Ingrese una opcion ..");
        opcion = scan.nextInt();
        while ((opcion < 1) && (opcion > 5)){
            System.out.println("Opcion incorrecta, intentelo de nuevo ..");
            opcion = scan.nextInt();
        }
        switch(opcion){
            case 1:
                System.out.println("Ingrese el texto: ");
                saltoLinea = scan.nextLine();
                texto = scan.nextLine();
                System.out.println("Ingrese una palabra para ver si se encuentra en el texto: ");
                pattern = scan.nextLine();
                Long iniTime1match = System.currentTimeMillis();
                int res = StringMatching.match(texto, pattern);
                Long endTime1match = System.currentTimeMillis() - iniTime1match;
                if (res != -1)
                    System.out.println("La palabra " + "-" + pattern + "- " + "comienza en la posicion: " + res +" del texto");
                else
                    System.out.println("La palabra " + "-" + pattern + "- " + "no se encuentra en el texto");
                System.out.println("El tiempo para String Matching con FB es: " + endTime1match + " milisegundos\n");
                break;
            case 2:
                System.out.println("Ingrese el texto: ");
                saltoLinea = scan.nextLine();
                texto = scan.nextLine();
                System.out.println("Ingrese una palabra para ver si se encuentra en el texto: ");
                pattern = scan.nextLine();
                Long iniTime1kmp = System.currentTimeMillis();
                res = StringMatching.matchKmp(texto, pattern);
                Long endTime1kmp = System.currentTimeMillis() - iniTime1kmp;
                if (res != -1)
                    System.out.println("La palabra " + "-" + pattern + "- " + "comienza en la posicion: " + res +" del texto");
                else
                    System.out.println("La palabra " + "-" + pattern + "- " + "no se encuentra en el texto");
                System.out.println("El tiempo para String Matching con el algoritmo de KMP es: " + endTime1kmp + " milisegundos\n");
                break;
            case 3:
                System.out.println("Ingrese el texto: ");
                saltoLinea = scan.nextLine();
                texto = scan.nextLine();
                ArrayList<String> subCadenas = new ArrayList<String>();
                Long iniTime2 = System.currentTimeMillis();
                subCadenas = LongestRepetition.subcadenas(texto);
                pattern = LongestRepetition.cadRepetidas(subCadenas);
                Long endTime2 = System.currentTimeMillis() - iniTime2;
                if (pattern != "")
                    System.out.println("La sub cadena mas larga que se repite es: " + pattern);
                else
                    System.out.println("No hay una sub cadena que se repita y esten concatenadas ");
                System.out.println("El tiempo para Longest Repeated String con FB es: " + endTime2);
                break;
            case 4:
                System.out.println("Ingrese el texto: ");
                saltoLinea = scan.nextLine();
                texto = scan.nextLine();
                Long iniTime2DQ = System.currentTimeMillis();
                System.out.println("Tamaño de la cadena que se repite: " + LongestRepetition.repetitionDc(texto));
                Long endTime2DQ = System.currentTimeMillis() - iniTime2DQ;
                System.out.println("El tiempo para Longest Repeated String con D&Q es: " + endTime2DQ);
                break;
            case 5:
                opcion = 5;
                break;
        }

    }
    }
}
