public class StringMatching{

/*
Calcula  String  Matching  usando  Fuerza  Bruta .
∗@param text  texto  a  analizar
∗@param pattern  patron  a  buscar  en  e l  texto
∗@returns  indice  de  la  primera  ocurrencia  de  pattern  en  text ,  en  caso  que  exista ,∗o−1 en  caso  que no  se  encuentre .
*/
    public static int match (String text ,String pattern ){
        for(int i=0;i<text.length();i++){
            int j=i;
            while ((j<pattern.length()) && (pattern.charAt(j)==text.charAt(j))){
                j++;
            }
            if (j == pattern.length()){
                return i;
            }
            pattern="0"+pattern;
        }
        return -1;
    }


/*
∗Calcula  String  Matching  usando Knuth−Morris−Pratt .
∗@param text  texto  a  analizar
∗@param pattern  patron  a  buscar  en  e l  texto
∗@returns  indice  de  la  primera  ocurrencia  de  pattern  en  text ,  en  caso  que  exista.
*/
public static int matchKmp(String text, String pattern){
    return -1;
}












}