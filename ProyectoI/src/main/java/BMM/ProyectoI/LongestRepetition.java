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
    ∗	@param text texto a analizar.
    ∗	@returns subString  de mayor longitud que se repite.
    */
	public static String cadRepetidas(ArrayList<String> l){
        String res = "";
		String aux = "";
		int mid;
		String izq;
		String der;
		int tam;

		for(int i = 0;i < l.size();i++){
			aux = l.get(i);
			tam = aux.length();
			if ((tam > 2) && (tam % 2 == 0)){
				mid = (tam/2)-1;
				izq = aux.substring(0,mid + 1);
				der = aux.substring(mid + 1,tam);
				if (izq.equals(der) && (res.length() < izq.length()))
					res = izq;
			}
			else{
				if (tam == 2){
					if ((aux.charAt(0) == aux.charAt(1)) && (res.length() < 1))
						res = aux.charAt(0) + "";
				}
			}
		}
		return res;
    }

	/**
	 *	Metodo que va creando las subcadenas dado una string,
	 *	cada posicion del arreglo contiene un caracter mas que el anterior.
	 ∗	@param text texto a analizar.
	 ∗	@returns subString de mayor longitud que se repite.
	 */
    public static ArrayList<String> subcadenas(String text) {
        int size = text.length();
        ArrayList<String> res = new ArrayList<String>();
        res.add("");
        String aux = "";

        for (int i = 0; i < size; i++){
            for (int j = i; j < size; j++){
                aux = aux + text.charAt(j);
                res.add(aux);
            }
            aux="";
        }
        return res;
    }

    /**
    *	Metodo que calcula Longest repetition usando D&C.
    ∗	@param text texto a analizar.
    ∗	@returns subString de mayor longitud que se repite.
    */
    public static String repetitionDc(String text){
        return "";
    }

}
