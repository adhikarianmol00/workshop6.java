package workshop6;

import java.util.HashMap;
import java.util.Map;

public class qs11 {
    public static void main(String[] args) {
       
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("Nepal", "Kathmandu");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Australia", "Canberra");
        countryCapitals.put("Brazil", "Brasilia");

        
        System.out.println("--- Full Country-Capital Map ---");
        printMap(countryCapitals);

       
        String country = "Japan";
        System.out.println("\nSearching for country: " + country);
        System.out.println("Capital: " + getCapital(countryCapitals, country));

        
        String capitalToFind = "Paris";
        System.out.println("\nChecking if '" + capitalToFind + "' exists as a capital...");
        if (containsCapital(countryCapitals, capitalToFind)) {
            System.out.println("Result: Yes, " + capitalToFind + " is in the map.");
        } else {
            System.out.println("Result: No, " + capitalToFind + " was not found.");
        }

        
        System.out.println("\n--- Final List ---");
        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + " | Capital: " + entry.getValue());
        }
    }

    
    public static void printMap(HashMap<String, String> map) {
        for (String country : map.keySet()) {
            System.out.println(country + " -> " + map.get(country));
        }
    }

    
    public static String getCapital(HashMap<String, String> map, String country) {
        return map.getOrDefault(country, "Country not found");
    }

    
    public static boolean containsCapital(HashMap<String, String> map, String capital) {
        return map.containsValue(capital);
    }
}