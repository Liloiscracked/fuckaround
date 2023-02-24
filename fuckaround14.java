public class fuckaround14 {
    // recursion practice
    public static void main(String[] args){
        f("KFU", 2);
    }

    public static void f(String s, int index){
        if (index >= 0) {
            System.out.print(s.charAt(index));
            f(s, index - 1);
            System.out.print(s.charAt(index));
            f(s, index - 1);
        }
    }
}
