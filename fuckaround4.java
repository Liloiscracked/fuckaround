import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
public class fuckaround4 {
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        for(int i = 2; i<=s;i++){
            integers.add(i);
        }
        System.out.println(integers);
        for(int i = 2;i<=s;i++){
            if(isPrime(i)){
                int n = i;
                int j = 2;
                while (integers.contains(n*j)){
                    integers.remove(n*j);
                    j++;
                }
            }
            else
                integers.remove(i);
        }
        System.out.println(integers);
    }
    public static boolean isPrime(int n){
        if(n == 2)
            return true;
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static int factorial(int n ){
        if(n == 2)
            return 2;
        else return n * factorial(n-1);
    }
    public static int sum (int n){
        if(n == 0)
            return 0;
        else
            return n + sum(n-1);
    }
    public static int pow(int n,int pow){
        if(pow == 1)
            return n;
        else
            return n * pow(n,pow-1);
    }
    public static int sum2(int n){
        if(n/10 == 0)
            return n;
        else
            return n%10 + sum2(n/10);
    }
    public static int Fibonacci(int n){
        if(n == 1)
            return 1;
        else if(n == 0)
            return 0;
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static boolean isPalindrome(String s){
        if(s.length()<= 1)
            return true;
        else{
            char[] slist = s.toCharArray();
            if (slist[0] != slist[slist.length-1])
                return false;
            else
                return isPalindrome(s.substring(1,s.length()-1));
        }
    }
    public static void printme(String s , int times){
        if(times >= 1){
            System.out.println(s);
            printme(s,times-1);
        }
    }
    public static int GCD(int n1, int n2){
        if(n1%n2 == 0)
            return n2;
        else
            return GCD(n1,n1%n2);
    }
    public static int BinarySearch(int[] list,int low , int high,int key) {
        if (low > high) {
            return -low - 1;
        }
        int mid = (high + low) / 2;
        if (key == list[mid]) {
            return mid;
        } else if (key > list[mid]){
            return BinarySearch(list, mid + 1, high, key);
        }
        else{
            return BinarySearch(list,low,mid-1,key);
        }
    }
    public static int BinarySearch(int[] list,int key){
        int high = list.length-1;
        int low = 0;
       return BinarySearch(list,low,high,key);
    }
    public static void SelectionSort(int[] list, int begin , int end){
        if (begin == end){
            return;
        }
        else{
            for (int k = begin; k<=end;k++){
                if(list[k]<list[begin]){
                    int temp = list[k];
                    list[k] = list[begin];
                    list[begin] = temp;
                }
            }
            SelectionSort(list,begin+1,end);
        }
    }
    public static void SelectioSort(int[] list){
        SelectionSort(list,0,list.length-1);
    }
    public static long DirectorySize(File file){
        long size = 0;
        if(file.isFile()){
            size+=file.length();
        }
        else{
            File[] fileList = file.listFiles();
            for(int i = 0;file!= null &&i<fileList.length;i++){
                size += DirectorySize(fileList[i]);
            }
        }
        return size;
    }
}
