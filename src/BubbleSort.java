public class BubbleSort {
    public static void main(String[] args) {
        // Taking an integer Array
        int [] arr={20,-15,13,24,35,1};
        // Taking Outer loop decreasing as every pass fixing the largest value at end
        for(int last_unsortedElement=arr.length-1;last_unsortedElement>0;last_unsortedElement--){
            //Inner loop contains the swapping and traversing of the arr
            for(int i=0;i<last_unsortedElement;i++){
                // Condition
                if(arr[i]>arr[i+1]){
                    // Swap the elements
                    // Using temp variable

                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }

            }
        }
        // Traversing the Array
        System.out.println("Sorted Elements are:");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+"-->");
        }

    }
}
