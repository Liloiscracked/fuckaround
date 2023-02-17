public class fuckaround12 {
    public static void main(String[] args) {
        int x = 1;
        int n = 8;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j+=2){
                System.out.println(16*8);
                x++; //Statement 1
            }
        }
    }
}

