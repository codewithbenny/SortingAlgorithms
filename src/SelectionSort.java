import java.util.Arrays;

public class SelectionSort {

void selectionSort(int array[]) {
    int size = array.length;

    for (int j = 0; j < size - 1; j++) {
        int min_idx = j;

        for (int i = j + 1; i < size; i++) {

            // To sort in descending order, change > to < in this line.
            // Select the minimum element in each loop.
            if (array[i] < array[min_idx]) {
                min_idx = i;
            }
        }

        // put min at the correct position
        int temp = array[j];
        array[j] = array[min_idx];
        array[min_idx] = temp;
    }
}

    // driver code
    public static void main(String args[]) {
        int[] data = { 20, 12, 10, 15, 2 };
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
