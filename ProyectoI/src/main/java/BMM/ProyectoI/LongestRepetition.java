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
    public static int repetitionDc(String text){
        int tamaño = text.length();
        if (tamaño <= 1)
        	return 0;
        
        int tamañoU = tamaño/2;
        int tamañoV = tamaño - tamañoU;
        String u = text.substring(0, tamañoU);
        String v = text.substring(tamañoU);
        String ru = reverse(u);
        String rv = reverse(v);
        
        int result = Math.max(repetitionDc(u), repetitionDc(v));   
        
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
        		result = Math.max(result,l);
        	}
        }
    	return result;
    }
    
    private static int getZ(ArrayList<Integer> z, int i) {
		if (0 <= i && i < z.size())
			return z.get(i);
	    else
    	    return 0;
    }
    
    public static ArrayList<Integer> zFuncion(String text){ 			
    	int n = text.length();
    	ArrayList<Integer> z = new ArrayList<Integer>();
    	for (int i = 0; i < n; i++) {
    		z.add(i, 0);
    	}
    	for (int i = 1; i < n; i++) {
			while ((i + z.get(i) < n) && (text.charAt(z.get(i)) == text.charAt(i + z.get(i)))) {
				Integer sumValor = (z.get(i) + 1);
				z.set(i, sumValor);
			}
		}
		return z;
    }
 
    private static String reverse(String text) {
    	String reverse = "";
    	for (int i = text.length() - 1; i >= 0; i--) {
    		reverse = reverse + text.charAt(i);
    	}
    	return reverse;
    }
    
    /*
    public static ArrayList<Integer> zFuncion(String text){ 			
		int n = text.length();
		ArrayList<Integer> z = new ArrayList<Integer>();		
		for (int i = 1, l = 0, r = 0; i < n; ++i) {						
			if (i <= r) {												
				Integer minimo = Math.min(r - i + 1, z.get(i - l));		
				z.add(i, minimo);
			}
			while ((i + z.get(i) < n) && (text.charAt(z.get(i)) == text.charAt(i + z.get(i)))) {
				Integer sumValor = (z.get(i) + 1);
				z.add(i, sumValor);
			}
			if (i + z.get(i) - 1 > r) {
				l = i;
				r = i + z.get(i) - 1;
			}
		}				
    	return z;
    }
	*/
}
