import java.util.HashMap;
import java.util.Map;

public class UC8_MapCollection {
    public static void main(String[] args) {
        // Create a map to store features
        Map<Integer, String> features = new HashMap<>();
        features.put(1, "Print OOPS");
        features.put(2, "Banner");
        features.put(3, "String Join");
        features.put(4, "Array Loops");

        // Loop through the map entries
        for (Map.Entry<Integer, String> entry : features.entrySet()) {
            System.out.println("Feature " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
