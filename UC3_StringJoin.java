import java.util.StringJoiner;

public class UC3_StringJoin {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Feature1").add("Feature2").add("Feature3");
        System.out.println("Features: " + joiner.toString());
    }
}
