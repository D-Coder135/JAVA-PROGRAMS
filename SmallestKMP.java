import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class SmallestKMP {
    public static void check(String string, String pattern) throws IOException {
        TreeMap<Character, Integer> map = new TreeMap<>();
        char[] stringlist = string.toCharArray();
        ArrayList<Character> patternlist = new ArrayList<>();
        for (char ch : pattern.toCharArray()) {
            patternlist.add(ch);
        }
        char first = pattern.charAt(0);
        for (char ch : stringlist) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char ch : patternlist) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
            }
        }
        ArrayList<Character> al = new ArrayList<>();
        Boolean b2 = false;
        int index = 0;
        while (pattern.charAt(index) == pattern.charAt(index + 1) && index != pattern.length() - 1) {
            index++;
        }
        if (pattern.charAt(index) > pattern.charAt(index + 1)) {
            b2 = true;
        }
        boolean flag = true;
        for (char ch : map.keySet()) {
            if (ch >= first && flag) {
                if (ch > first) {
                    al.addAll(patternlist);
                    for (int i = 0; i < map.get(ch); i++)

                        al.add(ch);
                    flag = false;
                } else if (ch == first) {
                    if (b2) {
                        al.addAll(patternlist);
                        for (int i = 0; i < map.get(ch); i++)
                            al.add(ch);
                        flag = false;
                    } else {
                        for (int i = 0; i < map.get(ch); i++) {
                            al.add(ch);
                        }
                    }
                }
            } else {
                for (int i = 0; i < map.get(ch); i++) {
                    al.add(ch);
                }
            }
        }
        if (flag) {
            al.addAll(patternlist);
        }
        for (char ch : al) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String p = sc.nextLine();
            check(s, p);
        }
    }
}