public class fuckaround15 {
    public static void main(String[] args) {
        TowerofHanoi(3, "A" , "B" , "C");
    }
    public static void TowerofHanoi(int n , String source , String Aux , String destination){
        if(n == 1)
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
        else {
            TowerofHanoi(n-1 , source , destination , Aux);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            TowerofHanoi(n-1 , Aux , source , destination);
        }
    }
}
