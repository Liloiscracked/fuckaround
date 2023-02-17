public class fuckaround7 {
    public static void main(String[] args) {
        String s = "aaaaaa";

        System.out.println(removeSameAdjacent(s));
    }
    public static int h = 1;
    public static String reduce(String a) {
        if (a.length() > 1) {
            String s0 = String.valueOf(a.charAt(0));
            String s1 = String.valueOf(a.charAt(1));
            if (s0.equals(s1))
                return s0 + reduce(a.substring(2));
            else {
                return s0 + reduce(a.substring(1));
            }
        }
        else
            return a;
    }
    private static String removeSameAdjacent(String str) { return removeSameAdjacent(str, 0);
    }
    private static String removeSameAdjacent(String str, int idx) { if (idx == str.length() - 1)
        return str.charAt(idx) + ""; else {
        char ch1 = str.charAt(idx); char ch2 = str.charAt(idx + 1); if (ch1 == ch2)
            return removeSameAdjacent(str, idx + 1); else return ch1 + removeSameAdjacent(str, idx + 1);
    } }
}
