public class fuckaround13 {
    public static void main(String[] args) {
        String test = "Hool";
        System.out.println(meth(test));
    }
    public static String meth(String s , String a) {
        if (s.length() > 1) {
        String Alast = String.valueOf(a.charAt(a.length() - 1));
        String c0 = String.valueOf(s.charAt(0));
        String c1 = String.valueOf(s.charAt(1));
        if (c0.equals(Alast)) {
            if (c0.equals(c1))
                return c0 + meth(s.substring(2), a + c0);
            else
                return c0 + meth(s.substring(2), a + c0 + c1);
        } else {
            if (c0.equals(c1))
                return a + c0 + meth(s.substring(2), a + c0);
            else
                return a + c0 + meth(s.substring(2), a + c0 + c1);
        }
        }
        else {
            String Alast = String.valueOf(a.charAt(a.length() - 1));
            String c0 = String.valueOf(s.charAt(0));
            if (c0.equals(Alast)) {
                    return "";
            }
            else {
                return c0;
            }

        }
    }
    public static String meth(String s){
        String c0 = String.valueOf(s.charAt(0));
        String c1 = String.valueOf(s.charAt(1));
        if(c0.equals(c1)){
            return c1 + meth(s.substring(2),c1);
        }
        else
            return c0 + c1 + meth(s.substring(2),c0+c1);
    }
}
