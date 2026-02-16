import java.util.*;

public class Main {

    static Map<Character, String[]> bannerMap = new HashMap<>();

    static {
        bannerMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        bannerMap.put('P', new String[]{
            " *** ",
            "*   *",
            " *** ",
            "*    ",
            "*    "
        });

        bannerMap.put('S', new String[]{
            " *** ",
            "*    ",
            " *** ",
            "    *",
            " *** "
        });
    }

    public static void printBanner(String text) {

        for (int i = 0; i < 5; i++) {
            for (char ch : text.toCharArray()) {
                String[] pattern = bannerMap.get(ch);
                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }
}