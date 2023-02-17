public class fuckaround10 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int n = 16;
        int x = 10;
        for(int i = 1; i < n; i = i + 2)
            sum1++;// statement1

        if(x < 5){
            for(int i = 1; i <= n; i = i * 2)
                for( int k = 1; k <= i; k = k + 1)
                    sum2++;//statement2
        }
        else{
            for(int i = 1; i <= n * n; i = i * 4)
                sum3++;// statement3
        }
        for(int i = 1; i < n; i++)
            for( int k = 1; k <= n; k = k * 2)
                sum4++;// statement4


    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
    System.out.println(sum4);

    }
}
