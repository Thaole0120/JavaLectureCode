package org.example.week5;

import java.util.HashMap;
import java.util.Map;

public class States {
    public static void main(String[] args) {

        Map<String, String> statesAbbreviations = new HashMap<>();
        statesAbbreviations.put("Minnesota", "MN");
        statesAbbreviations.put("Wisconsin", "WI");
        statesAbbreviations.put("Michigan", "MI");
        statesAbbreviations.put("Iowa", "IA");

        System.out.println(statesAbbreviations);

        System.out.println(statesAbbreviations.get("Minnesota"));
        System.out.println(statesAbbreviations.get("Iowa"));

        String wisconsinAbbreviation = statesAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);

        // How about looking up abbreviation for states?
        for ( String stateName: statesAbbreviations.keySet()){
            System.out.println(stateName);
            System.out.println(statesAbbreviations.get(stateName));

        }

        for ( String abbreviation: statesAbbreviations.values()){
            System.out.println(abbreviation);
        }

        // one way - loop over key-value pairs until value is found
        String searchAbbreviation = "WI";

        for ( String stateName: statesAbbreviations.keySet()){
            System.out.println(stateName);
            String abbreviation = statesAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)){
                System.out.println(" Found it! The states for " + searchAbbreviation + " is " +  stateName);
            }
        }

        Map< String, String> abbreviationStateNames = new HashMap<>();

        for ( Map. Entry<String, String> entry: statesAbbreviations.entrySet()){
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationStateNames.put(abbreviation, state);

        }

        System.out.println(statesAbbreviations);
        System.out.println(abbreviationStateNames);
        // another way  - create a new Hashmap - each key become a value, each value becomes a key

    }
}
