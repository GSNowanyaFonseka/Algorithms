package searching;

public class BinarySearch {

    public static void main(String[] args) {

        // define the array
        int[]array = {2,3,5,7,8,11,15,17,19};
        int target = 150;
        boolean found = false;

        BinarySearch(array,target,found);;
    }

    public static void BinarySearch(int array[],int target, boolean found){

        // initialize variables
        int first = 0;
        int last = array.length-1;

        // while loop for searching the value
        while(first<=last){

            // get the mid value
            int mid = (first+last)/2;

            // if the mid is the target value return the value
            if(array[mid]==target){
                System.out.println("Value found at index : " + mid);
                found = true;
                break;
            }
            else if(array[mid]>target){
                last = mid-1;
            }
            else{
                first = mid+1;
            }
        }

        if(!found) {
            System.out.println("value not found");
        }

    }
}
