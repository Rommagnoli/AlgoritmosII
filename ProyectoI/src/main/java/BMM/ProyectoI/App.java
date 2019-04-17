package BMM.ProyectoI;
import java.util.*;

public class App {
	
    public static void main( String[] args) {
        
    	ArrayList<String> todasCad = new ArrayList<String>();
        todasCad = LongestRepetition.subcadenas("yvaeltercero,yvaelterceroygolderiver,gooooooool");
        System.out.println(LongestRepetition.cadRepetidas(todasCad));
    
    }
}
