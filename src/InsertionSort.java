public class InsertionSort {

    public static void sort(int[] arr){
        for(int i=0;i< arr.length;i++){
            int j=i-1;
            int temp =arr[i];
            while(j>=0&& arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr={10,5,20,7,2};
        sort(arr);
    }
}
