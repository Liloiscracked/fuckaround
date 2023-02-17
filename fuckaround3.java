import java.util.*;

public class fuckaround3 {
    public static void main(String[] args) {
        String sample = "Hello";
//        System.out.println(method(sample));
    }

    public static int Fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
//    public static ArrayList<String> method(String s){
//        ArrayList<String> ss = new ArrayList<>();
//        char[] sss = s.toCharArray();
//        for(int i = 0 ; i< sss.length; i++){
//            String sss1 =(String) sss[i];
//            String sample =  sss1;
//            ss.add(sample);
//        }
//        return method(ss);
//    }
//    public static ArrayList<String> method(ArrayList<String> s){
//        if(s.size()>1){
//            String s0 = String.valueOf(cha[0]);
//            String s1 = String.valueOf(cha[1]);
//        if(s0.equals(s1)){
//            s.replace(s0,"");
//        }
//            return method(s);
//        }
//        else
//            return s;
//    }
//}


    class m {
        int id = 110;

        public String toString() {
            return id + " ";
        }

        @Override
        public boolean equals(Object obj) {
            return this.id == ((m) obj).id;
        }

        @Override
        public int hashCode() {
            return id;
        }
    }
}
