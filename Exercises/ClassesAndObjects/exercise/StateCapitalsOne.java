package ClassesAndObjects.exercise;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateCapitalsOne {
    public static void main(String[] args) {
        Map<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Alabama","Montgomery");
        stateCapitals.put("Alaska","Juneau");
        stateCapitals.put("Arizona","Pheonix");
        stateCapitals.put("Arkansas","Little Rock");

        System.out.println("STATES");
        System.out.println("=====================");
        Set<String> hashMapKeys = stateCapitals.keySet();
        for(String output: hashMapKeys){
            System.out.println(output);
        }
        System.out.println();

        System.out.println("CAPITALS");
        System.out.println("=====================");
        Collection<String> values = stateCapitals.values();
        for(String output: values){
            System.out.println(output);
        }
        System.out.println();

        System.out.println("STATE/CAPITAL PAIRS");
        System.out.println("=====================");
        for(String output: hashMapKeys){
            System.out.println(output + " - " + stateCapitals.get(output));
        }



    }
    
}
