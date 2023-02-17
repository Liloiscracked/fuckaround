import java.util.Arrays;

public class fuckaround5 {
    public static void main(String[] args) {
        int [] numbers = {48,2,2,3,4,5,6,22,11,1029,2843,3756,34623,88,56};
        BubbleSort(numbers);
        for(int j = 0;j<numbers.length;j++){
            System.out.println(numbers[j]);
        }
        int index = BinarySearch(numbers , 88);
        System.out.println("The index of 88 is : " + "{" + index + "}");
    }
    public static int  P(int n){
        if(n == 1)
            return 1;
        else
            return n + P(n-1);
    }


    public static void BubbleSort(int [] list){
        boolean shouldPass = true;
        for (int k = 0 ; shouldPass && k< list.length;k++){
            shouldPass = false;
            for(int i = 0 ; i<list.length-1;i++){
                if(list[i]>list[i++]){
                    int temp = list[i];
                    list[i] = list[i++];
                    list[i++] = temp;
                    shouldPass = true;
                }
            }
        }
    }
    public static void InsertionSort(int [] list){
        int IDX ;
        int currentElement;
        for(IDX = 1; IDX<list.length;IDX++){
            int temp = IDX;
            currentElement = list[IDX];
            for(int j = IDX-1; j>=0 && currentElement < list[j];j--){
                int k = j +1 ;
                list[j] = list[k];
                temp = j;
            }
            list[temp] = currentElement;
        }
    }
    public static void SelectionSort(int[] s){
        int min;
        int minIndex;
        int temp;
        for(int i = 0 ; i< s.length-1;i++){
            for(int j = i+1 ; j< s.length;j++){
                if(s[i]>s[j]){
                    minIndex = j;
                    min = s[j];
                    temp = s[j];
                    s[j] = s[i];
                    s[i] = temp;
                }
            }
        }
    }

    public static int BinarySearch(int[] list , int key , int high , int low , int mid){
        while (high>=low) {
            if (key > list[mid]) {
                low = mid + 1;
                mid = (low + high) / 2;
                 return BinarySearch(list,key,high,low,mid);
            } else if (key < list[mid]) {
                high = mid - 1;
                mid = (low + high) / 2;
                return BinarySearch(list,key,high,low,mid);
            } else
                return mid;
        }
        return -1;
    }

    public static int BinarySearch(int[] list, int key){
        int high = list.length-1;
        int low = 0;
        int mid = (high + low) / 2 ;
        return BinarySearch(list,key,high,low,mid);
    }

}