import java.util.Map;
import java.util.TreeMap;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> capitals = new TreeMap<>();

        // 1. Add several country → capital pairs
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        capitals.put("Japan", "Tokyo");
        capitals.put("Canada", "Ottawa");
        capitals.put("India", "New Delhi");
        capitals.put("Brazil", "Brasilia");
        capitals.put("Australia", "Canberra");
        capitals.put("South Korea", "Seoul");

        // 2. Lookup and print the capital
        lookupCapital(capitals, "Japan");
        lookupCapital(capitals, "Mexico");

        // 3. Print all countries in alphabetical order, along with capitals (TreeMap handles sorting)
        System.out.println("\nCountries and Capitals (Alphabetical Order):");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void lookupCapital(Map<String, String> capitals, String country) {
        String capital = capitals.get(country);
        if (capital != null) {
            System.out.println("The capital of " + country + " is " + capital + ".");
        } else {
            System.out.println("Unknown country: " + country + ".");
        }
    }
}
