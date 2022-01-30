package ClassesAndObjects.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        // Get, Put, Keyset, Size, Values
        Map<String, Integer> populations = new HashMap<>();

        populations.put("USA", 310);
        populations.put("China", 500);
        populations.put("Japan", 450);

        populations.put("USA", 400);

        Integer USApopulations = populations.get("USA");
        System.out.println("USA Population: " + USApopulations);

        Set<String> hashMapKeys = populations.keySet();
        for (String output : hashMapKeys) {
            System.out.println(output);
        }

        System.out.println("----------------------------------------------------");
        for (String output : hashMapKeys) {
            System.out.println("The populaton of " + output + " is " + populations.get(output));
        }

        System.out.println("----------------------------------------------------");
        Collection<Integer> popValues = populations.values();
        for(Integer output: popValues){
            System.out.println(output);
        }

    }
}
