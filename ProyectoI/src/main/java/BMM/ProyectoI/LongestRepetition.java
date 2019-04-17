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
        String current = "";
        boolean repeat = false;
        int sizeList = l.size();
        for (int i=0;i<sizeList-1;i++){
            int j=i+1;
            while(j<sizeList && (!repeat)){
                if (l.get(i).equals(l.get(j))){
                    repeat = true;
                    if (current.length()<l.get(j).length()){
                        current = l.get(j);
                    }
                }
                j++;
            }
            repeat=false;
        }
        return current;
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
