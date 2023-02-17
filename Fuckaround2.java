public class Fuckaround2 {
    public static void main(String[] args) {
        String clock = "0800-1040";
        System.out.println(method(clock));
    }
     public static int method(String clk){
        try {
            String[] s = clk.split("-");
            int start = getValue(s[0]);
            int finish = getValue(s[1]);
            return finish - start;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
     }
    public static int getValue(String s){
        int k = new Integer(s);
        if(k%100 >30){
            return k/100 +1;
        }else
            return k/100;
    }
}
