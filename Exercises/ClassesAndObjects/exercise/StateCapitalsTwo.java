package ClassesAndObjects.exercise;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class StateCapitalsTwo {
    public static void main(String[] args) throws Exception{
        Map<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Alabama","Montgomery");
        stateCapitals.put("Alaska","Juneau");
        stateCapitals.put("Arizona","Pheonix");
        stateCapitals.put("Arkansas","Little Rock");

        PrintWriter saving = new PrintWriter(new FileWriter("StateCapitals.txt"));

    }
}