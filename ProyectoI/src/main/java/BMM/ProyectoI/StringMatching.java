package BMM.ProyectoI;

/**
 *	Clase StringMatching.
 *  @see Calcula String Matching usando dos metodos distintos para ello.
 ∗	@autor Boaglio, Menedez, Magnoli.
 */

public class StringMatching{

	/**
	 *	Metodo que calcula  String  Matching  usando  Fuerza  Bruta.
	 ∗	@param texto  texto  a  analizar.
	 ∗	@param patron  patron  a  buscar  en  e l  texto.
	 ∗	@returns  Indice  de  la  primera  ocurrencia  de  pattern  en  text,
	 *	en  caso  que  exista, ∗o−1 en  caso  que no  se  encuentre.
	 */
    public static int match (String texto, String patron){
    	for (int i = 0; i < texto.length(); i++){
        	int j = i;
            while ((j < patron.length()) && (patron.charAt(j) == texto.charAt(j))){
            	j++;
            }
            if (j == patron.length()){
                return i;
            }
            patron = "0" + patron;
        }
        return -1;
    }

    /**
	 *	Metodo que calcula  String  Matching  usando la mejora de Knuth-Morris-Pratt.
	 ∗	@param texto  texto  a  analizar
	 ∗	@param patron  patron  a  buscar  en  e l  texto
	 ∗	@returns  indice  de  la  primera  ocurrencia  de  pattern  en  text ,  en  caso  que  exista ,∗o−1 en  caso  que no  se  encuentre .
	 */
    public static int matchKmp (String texto , String patron) {
	    int i = 0;
	    int j = 0;
	    int posicion = -1;
	    Boolean encontrado = false;
	    int tamañoT = texto.length();
	    int tamañoP = patron.length();

	    while ((!(encontrado)) && (i < tamañoT)) {
	        while ((i < tamañoT) && (texto.charAt(i) != patron.charAt(j))) {
	        	if (j == 0)
	        		i++;
	            j = 0;
	        }
            if (i != tamañoT){
	            i++;
	            j++;
            }
	        if (j == tamañoP){
	            encontrado = true;
	            posicion = (i - tamañoP);
	        }
	    }
	    return posicion;
	}
}
