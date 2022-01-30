package ClassesAndObjects.example;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // List: add, get, remove, size
        
        List<String> stringsList = new ArrayList<>();

        stringsList.add("A");
        stringsList.add("B");
        stringsList.add("C");
        stringsList.add("D");
        
        for(String output: stringsList){
            System.out.println(output);
        }
    }


    
}
