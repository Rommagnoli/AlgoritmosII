package BMM.ProyectoI;
import java.util.*;

/**
 *	Clase LongestRepetition.
 *  @see Calcula Longest Repetition usando dos metodos distintos para ello.
 ∗	@autor Boaglio, Menedez, Magnoli.
 */
public class LongestRepetition{

    /**
    *	Metodo que calcula  Longest repetition  usando  Fuerza  Bruta.
    ∗	@param texto texto a analizar.
    ∗	@returns subString  de mayor longitud que se repite.
    */
	public static String cadRepetidas(ArrayList<String> l){
        String cadRep = "";
		String cadAux = "";
		int mid;
		String izq;
		String der;
		int tamaño;

		for(int i = 0;i < l.size();i++){
			cadAux = l.get(i);
			tamaño = cadAux.length();
			if ((tamaño > 2) && (tamaño % 2 == 0)){
				mid = (tamaño/2)-1;
				izq = cadAux.substring(0,mid + 1);
				der = cadAux.substring(mid + 1,tamaño);
				if (izq.equals(der) && (cadRep.length() < izq.length()))
					cadRep = izq;
			}
			else{
				if (tamaño == 2){
					if ((cadAux.charAt(0) == cadAux.charAt(1)) && (cadRep.length() < 1))
						cadRep = cadAux.charAt(0) + "";
				}
			}
		}
		return cadRep;
    }

	/**
	 *	Metodo que va creando las subcadenas dado una string,
	 *	cada posicion del arreglo contiene un caracter mas que el anterior.
	 ∗	@param texto texto a analizar.
	 ∗	@returns subString de mayor longitud que se repite.
	 */
    public static ArrayList<String> subcadenas(String texto) {
        int tamaño = texto.length();
        ArrayList<String> arrSub = new ArrayList<String>();
        arrSub.add("");
        String subC = "";

        for (int i = 0; i < tamaño; i++){
            for (int j = i; j < tamaño; j++){
                subC = subC + texto.charAt(j);
                arrSub.add(subC);
            }
            subC="";
        }
        return arrSub;
    }

    /**
    *	Metodo que calcula Longest repetition usando D&C.
    ∗	@param texto texto a analizar.
    ∗	@returns subString de mayor longitud que se repite.
    */
    public static String repetitionDc(String texto){
        int tamaño = texto.length();
		String repeticion = "";
        if (tamaño <= 1)
        	return repeticion;

        int tamañoU = tamaño/2;
        int tamañoV = tamaño - tamañoU;
        String u = texto.substring(0, tamañoU);
        String v = texto.substring(tamañoU);
        String ru = reversa(u);
        String rv = reversa(v);

		int result = Math.max(repetitionDc(u).length(), repetitionDc(v).length());

        ArrayList<Integer> z1 = zFuncion(ru);
        ArrayList<Integer> z2 = zFuncion(v + '#' + u);
        ArrayList<Integer> z3 = zFuncion(ru + '#' + rv);
        ArrayList<Integer> z4 = zFuncion(v);

        for (int cntr = 0; cntr < tamaño; cntr++) {
        	int l, k1, k2;
        	if (cntr < tamañoU) {
        		l = tamañoU - cntr;
        		k1 = getZ(z1, tamañoU - cntr);
    			k2 = getZ(z2, tamañoV + 1 + cntr);
        	} else {
        		l = cntr - tamañoU + 1;
        		k1 = getZ(z3, tamañoU + 1 + tamañoV - 1 - (cntr - tamañoU));
                k2 = getZ(z4, (cntr - tamañoU) + 1);
        	}
        	if ((k1 + k2) >= l) {
        		if (result<l) {
        			result = l;

        			int posC;
        			if (cntr < tamañoU) {
        				posC = cntr;
	        			int posV = tamañoU;
	        		 	while ((posC >= 0) && (texto.charAt(posC) == texto.charAt(posV))) {
	        		 		posC--;
	        		 		posV--;
	        		 	}
	        		 	repeticion = texto.substring(posC+1, posV + 1);
	        		} else {
	        			posC = cntr;
	        			int posV = tamañoU - 1;
	        		 	while ((posC < texto.length()) && (texto.charAt(posC) == texto.charAt(posV))) {
	        		 		posC++;
	        		 		posV++;
	        		 	}
	        		 	repeticion = texto.substring(posV , posC);
	        		}
        		}
        	}
        }
    	return repeticion;
    }

	/**
	*	Metodo para obtener la informacion guardada en una posicion del
	*	ArrayList
	*	@param array arreglo que genera el metodo zFunction
	*	@param i posicion de la informacion en el arreglo
	*	@return informacion alojada en z[i]
	*/
    private static int getZ(ArrayList<Integer> array, int i) {
		if (0 <= i && i < array.size())
			return array.get(i);
	    else
    	    return 0;
    }

	/**
	*	Metodo para la optimizacion en repetitionDc
	*	@param texto texto para procesar
	*	@return un vector con la longitud del prefijo comun mas largo entre el
	*	texto y el sufijo del texto que comienza en i.
	*/
    public static ArrayList<Integer> zFuncion(String texto){
    	int n = texto.length();
    	ArrayList<Integer> z = new ArrayList<Integer>();
    	for (int i = 0; i < n; i++) {
    		z.add(i, 0);
    	}
    	for (int i = 1; i < n; i++) {
			while ((i + z.get(i) < n) && (texto.charAt(z.get(i)) == texto.charAt(i + z.get(i)))) {
				Integer sumValor = (z.get(i) + 1);
				z.set(i, sumValor);
			}
		}
		return z;
    }

	/**
	*	Metodo que invierte una cadena.
	*	@param texto texto a procesar
		@return el mismo texto invertido.
	*/
    private static String reversa(String texto) {
    	String reversa = "";
    	for (int i = texto.length() - 1; i >= 0; i--) {
    		reversa = reversa + texto.charAt(i);
    	}
    	return reversa;
    }

}
