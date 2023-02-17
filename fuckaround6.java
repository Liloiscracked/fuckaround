import java.util.ArrayList;
import java.util.List;

public class fuckaround6 {
    public static void main(String[] args) {
        Integer [] a = {1,2,3,5,6,7};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0 ; i<7 ; i++){
            if (i != 4)
                arr.add(i);
        }


        method(arr,4);
        for(int element : arr)
            System.out.println(element);

    }
    public static <E extends Comparable<E>> void method(ArrayList<E> arr , E element){
        int Indexcounter = 0;
        while ( Indexcounter < arr.size() && element.compareTo(arr.get(Indexcounter)) >=0){
            Indexcounter++;
        }
        arr.add(Indexcounter, element);
    }
}
