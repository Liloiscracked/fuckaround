import java.util.Arrays;
public class fuckaround9 {
    public static void main(String[] args) {
        int numArray[] = new int[70];
        int number = 51;
        for(int i = 0; i< numArray.length;i++) {
            numArray[i] = number++;
        }
        System.out.println("The input array: " + Arrays.toString(numArray));
        //key to be searched
        int key = 150;
        System.out.println("\nKey to be searched=" + key);
        //set first to first index
        int first = 0;
        //set last to last elements in array
        int last=numArray.length-1;
        //calculate mid of the array
        int mid = (first + last)/2;
        //while first and last do not overlap
        int counter = 0;
        while( first <= last ){
            //if the mid < key, then key to be searched is in the first half of array
            counter++;
            if ( numArray[mid] == key ){
                //if key = element at mid, then print the location
                System.out.println("Element is found at index: " + mid);
                break;
            }
            else if ( numArray[mid] < key){
                counter++;
                first = mid + 1;
            }
            else{
                counter++;
                //the key is to be searched in the second half of the array
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        //if first and last overlap, then key is not present in the array
        if ( first > last ){
            System.out.println("Element is not found!");
        }
        System.out.println("The number of campares is  " + counter);
    }
    String s;
}

