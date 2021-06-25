# Bubble Sort
Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them if they are not in the intended order.

## Working of Bubble Sort
Suppose we are trying to sort the elements in ascending order.

##1. First Iteration (Compare and Swap)

Starting from the first index, compare the first and the second elements.
If the first element is greater than the second element, they are swapped.
Now, compare the second and the third elements. Swap them if they are not in order.
The above process goes on until the last element.
Compare two adjacent elements and swap them if the first element is greater than the next element
Compare the Adjacent Elements
##2. Remaining Iteration

The same process goes on for the remaining iterations.

After each iteration, the largest element among the unsorted elements is placed at the end.

Continue the swapping and put the largest element among the unsorted list at the end
Put the largest element at the end
In each iteration, the comparison takes place up to the last unsorted element.

Swapping occurs only if the first element is greater than the next element
Compare the adjacent elements
The array is sorted when all the unsorted elements are placed at their correct positions.

The array is sorted if all the elements are kept in the right order.
The array is sorted if all elements are kept in the right order
Bubble Sort Algorithm
```bash
bubbleSort(array)
  for i <- 1 to indexOfLastUnsortedElement-1
    if leftElement > rightElement
      swap leftElement and rightElement
end bubbleSort
```


# Selection Sort
Selection sort is a sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list.

#Working of Selection Sort

Selection Sort Steps:

1.Select first element as minimum

2.Compare minimum with the second element. If the second element is smaller than minimum, assign the second element as minimum.

3.Compare minimum with the third element. Again, if the third element is smaller, then assign minimum to the third element otherwise do nothing. The process goes on until the last element.
Compare minimum with the remaining elements

4.After each iteration, minimum is placed in the front of the unsorted list.

5.Swap the first with minimum

For each iteration, indexing starts from the first unsorted element. Step 1 to 3 are repeated until all the elements are placed at their correct positions.

#Selection Sort Algorithm
```bash
selectionSort(array, size)
  repeat (size - 1) times
  set the first unsorted element as the minimum
  for each of the unsorted elements
    if element < currentMinimum
      set element as new minimum
  swap minimum with first unsorted position
end selectionSort
```
