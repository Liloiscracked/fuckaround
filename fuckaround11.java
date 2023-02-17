import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Double;

public class fuckaround11{
    public static int recursiveA(int n, int m) {
        if (n == 0)
            return m;
        else
            return recursiveA(n - 1, m + 1);
    }

    public static int recursiveB(int n) {
        if (n == 1)
            return 1;
        else
            return recursiveB(n -1) +2*n -1;
    }

    public static int recursiveC(int n, int m) {
        if (n == 0)
            return 0;
        else
            return recursiveC(n / m, m) + 1;
    }

    public static void method(int n) throws Exception {
        try {
            if (n < 0)
                throw new Exception();
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static boolean check(int n ){
        if(n ==2)
            return true;
        else if (n%2 != 0) {
            return false;
        } else
            return check(n/2);
    }
    public static double AVG(ArrayList<Integer> list) throws IllegalArgumentException {
        if(list == null || list.size() == 0){
            throw new IllegalArgumentException("Error");
        }
        else {
            int size = list.size();
            int sum = 0;
            for (Integer element : list)
                sum += element;
            return (double) sum / size;
        }
    }
    public static boolean checkFile(File file1, File file2){
        try {
            boolean IDENTICAL = true;
            Scanner s1 = new Scanner(new File(String.valueOf(file1)));
            Scanner s2 = new Scanner(file2);
            while (IDENTICAL){
                String s11 = s1.nextLine();
                String s22 = s2.nextLine();
                if(!s22.equals(s11))
                    return false;
            }
            return true;
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(check(88));
    }
}