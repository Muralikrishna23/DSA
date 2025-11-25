import java.util.Arrays;

class SecondLargestElement{

    // sort the array and return the second largest element
    public static int secondLargestNaive(int arr[]){
        int num =0;
        //sort the array using sort method
        Arrays.sort(arr);
        return arr[arr.length-2];

    }


    public static int  secondLargestEfficient(int arr[]){
        // Initialize first and second largest element
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        // Traverse the array
        for(int i=0;i<arr.length;i++){
            // If arr[i] > largest, update second largest with
            // largest and largest with arr[i]
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            // If arr[i] < largest and arr[i] > second largest,
            // update second largest with arr[i]
            else if(arr[i]>secondLargest && arr[i]!=firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String argd[]){
        int arr[]={12,34,56,78,90,11,23,45};
        System.out.println("Second largest element using naive approach: "+secondLargestNaive(arr));
        System.out.println("Second largest element using efficient approach: "+secondLargestEfficient(arr));
    }
}