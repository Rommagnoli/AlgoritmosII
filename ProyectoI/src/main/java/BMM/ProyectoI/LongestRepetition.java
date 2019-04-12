package BMM.ProyectoI;
import java.util.*;

public class LongestRepetition{

    /*
    Calcula  Longest repetition  usando  Fuerza  Bruta .
    ∗@param text texto a analizar
    ∗@returns  subString  de mayor  longitud  que  se  r e p i t e .
    */
    public static String repetition(String text){
        return "";
    }

    public static String cadRepetidas(ArrayList<String> l){
        String current = "";
        //int currentSize = 0;
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
    /*
    Calcula Longest repetition usando D&C.
    ∗@param text texto a analizar
    ∗@returns subString de mayor longitud que se repite.
    */
    public static String repetitionDc(String text){
        return "";
    }

}
