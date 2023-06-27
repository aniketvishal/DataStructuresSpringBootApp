package com.DataStructures.DataStructures.Arrays.Service.Impl;

import com.DataStructures.DataStructures.Arrays.Constant.ArraysConstats;
import com.DataStructures.DataStructures.Arrays.Service.ArrayService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ArrayServiceImpl implements ArrayService {
    Scanner scanner=new Scanner(System.in);

    /**
     * Also Go through this
     * @links
     * <a href="https://www.baeldung.com/java-sorting">Predefined sorting functions in Java</a>
     */



    /**
     * Linear Search In Array
     * Time Complexity of O(n)
     */
    @Override
    public void linearSearch()
    {
        System.out.println("Enter the size of array you want to search in:");
        int size=scanner.nextInt();
        int[] arrayToSearch=new int[size];
        System.out.println("Enter the values in array :");
        for(int iteratorI=0;iteratorI<size;iteratorI++)
        {
            arrayToSearch[iteratorI]=scanner.nextInt();
        }
        System.out.println("Enter the value you want to search for :");
        int key=scanner.nextInt();
        int index=linearSearch(arrayToSearch,key);
        if(index!=-1){
            System.out.println(key+" is at index : "+index);
        }else {
            System.out.println("Searched value is not present in array . ");
        }
    }

    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }




    /**
     * Bubble Sort
     *
     * Keep swapping elements that are not in their right location till the array is sorted.
     *
     * O (n^2)
     */
    @Override
    public void bubbleSort()
    {
        System.out.println("Enter the size of array :");
        int size=scanner.nextInt();
        int[] arrayToSort=new int[size];
        System.out.println("Enter the values in array :");
        for(int iteratorI=0;iteratorI<size;iteratorI++)
        {
            arrayToSort[iteratorI]=scanner.nextInt();
        }
        display(arrayToSort);
        System.out.println("Now BUBBLE Sorting Starts :");
        bubbleSortRecursion(arrayToSort,arrayToSort.length);
        display(arrayToSort);
    }

    void bubbleSortRecursion(int[] arr,int length)
    {   int temp;
        if(length<=1)
        {
            return;
        }else {
            for (int iteratorI=0;iteratorI<length-1;iteratorI++)
            {
                if(arr[iteratorI]<arr[iteratorI+1]) {
                    temp = arr[iteratorI];
                    arr[iteratorI]=arr[iteratorI+1];
                    arr[iteratorI+1]=temp;
                }
            }
            bubbleSortRecursion(arr,length-1);
        }

    }

//    static void bubbleSort(int arr[], int n)
//    {
//        if (n == 1)                     //passes are done
//        {
//            return;
//        }
//
//        for (int i=0; i<n-1; i++)       //iteration through unsorted elements
//        {
//            if (arr[i] > arr[i+1])      //check if the elements are in order
//            {                           //if not, swap them
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }
//
//        bubbleSort(arr, n-1);           //one pass done, proceed to the next
//    }




    /**
     * Selection Sort
     *
     * Find the minimum element in each run of the array and swap it with the element at the current index is compared.
     *
     * Worst Time Complexity
     * O(n^2)
     */
    @Override
     public void selectionSort()
    {
        System.out.println("Enter the size of array :");
        int size=scanner.nextInt();
        int[] arrayToSort=new int[size];
        System.out.println("Enter the values in array :");
        for(int iteratorI=0;iteratorI<size;iteratorI++)
        {
            arrayToSort[iteratorI]=scanner.nextInt();
        }
        display(arrayToSort);
        System.out.println("Now SELECTION Sorting Starts :");
        int temp;
//        selectionSort(arrayToSort);
        if(arrayToSort.length<=1)
        {
            System.out.println("Array contain 1 or NO elements so it's already sorted ");
        }else {
            for(int interatorI=0;interatorI<arrayToSort.length;interatorI++)
            {
                int minIndex=interatorI;
                for (int iteratorJ=interatorI+1;iteratorJ<arrayToSort.length;iteratorJ++){
                    if(arrayToSort[iteratorJ]<arrayToSort[minIndex])
                    {
                        minIndex=iteratorJ;
                    }
                }
                if(minIndex!=interatorI){
                    arrayToSort[minIndex]=arrayToSort[minIndex]+arrayToSort[interatorI];
                    arrayToSort[interatorI]=arrayToSort[minIndex]-arrayToSort[interatorI];
                    arrayToSort[minIndex]=arrayToSort[minIndex]-arrayToSort[interatorI];
                }
            }
        }
        display(arrayToSort);
    }

    void selectionSort(int arr[])
    {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            pos = i;
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[pos])                  //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = arr[pos];            //swap the current element with the minimum element
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    void display(int arr[])                 //display the array
    {
        System.out.println("Displaying Array :");
        for (int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * Insertion Sort
     *
     * In every run, compare it with the predecessor. If the current element is not in the correct location,
     * keep shifting the predecessor subarray till the correct index for the element is found.
     *
     * O(n^2)
     */
    @Override
    public void insertionSort(){
        System.out.println("Enter the size of array :");
        int size=scanner.nextInt();
        int[] arrayToSort=new int[size];
        System.out.println("Enter the values in array :");
        for(int iteratorI=0;iteratorI<size;iteratorI++)
        {
            arrayToSort[iteratorI]=scanner.nextInt();
        }
        display(arrayToSort);
        System.out.println("Now INSERTION Sorting Starts :");
        insertionSortRcursion(arrayToSort,arrayToSort.length);
        display(arrayToSort);
    }

    void insertionSortRcursion(int arr[], int n)
    {
        if (n <= 1)                             //passes are done
        {
            return;
        }
        insertionSortRcursion( arr, n-1 );        //one element sorted, sort the remaining array
        int last = arr[n-1];                        //last element of the array
        int j = n-2;                                //correct index of last element of the array
        while (j >= 0 && arr[j] > last)                 //find the correct index of the last element
        {
            arr[j+1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
            j--;
        }
        arr[j+1] = last;                            //set the last element at its correct index
    }


    /**
     * HEAP SORT
     *     let a array[]={23,34,45,67,78,89}
     *
     *                         |-                     [0]{23}           <-- root node in an array is always on index 0
     *                         |                     /      \
     * height of tree=  log(N) |              [1]{34}        [2]{45}   <-- index of parent of a chile node at index M = (M-1)/2 ,index of last rightmost parent node =((N-1)-1)/2
     *                         |              /    \         /
     *                         |-         [3]{67}  [4]{78}  [5]{89}     <--  number of leaf nodes = N/2 (6/2 = 3)
     *                                                                           ,index of last leaf node = N-1 (6-1=5)
     *
     * first convert the array into heap data structure using heapify,
     *  then one by one delete the root node of the Max-heap and replace it with the last node in the heap and then heapify the root of the heap.
     *  Repeat this process until size of heap is greater than 1.
     *
     *
     * @links
     * <a href="https://www.youtube.com/watch?v=uuot9ItgTEI"> Introduction to Heap Tree with examples | Max Min Heap</a>
     * <a href="https://www.youtube.com/watch?v=KzXpfxRzVQM">Insertion in Heap Tree | Max-Heap & Min-Heap Creation | Time Complexities</a>
     * <a href="https://www.youtube.com/watch?v=8noP3YjjJCM">Build Heap in O(n) time complexity | Heapify Method | Full Derivation with example</a>
     * <a href="https://www.youtube.com/watch?v=4GsxDWMI7tQ">Deletion in Heap tree | Time complexity</a>
     * <a href="https://www.youtube.com/watch?v=nJ6FdAIr_6g">Heap sort with Example | Heapify Method</a>
     * **   <a href="https://www.youtube.com/watch?v=awhtt1DMIR4">Build Heap in O(n) Time Complexity 🔥 | Heapify in heap data structure & Algorithms Hindi Hello world</a>
     */
    @Override
    public void heapSort(){
        System.out.println(ArraysConstats.ArrayConstantEnum.ENTER_ARRAY_SIZE);
        int size=scanner.nextInt();
        int[] arrayToSort=new int[size];
        System.out.println(ArraysConstats.ArrayConstantEnum.ENTER_ELEMENTS_IN_ARRAY);
        for(int iteratorI=0;iteratorI<size;iteratorI++)
        {
            arrayToSort[iteratorI]=scanner.nextInt();
        }
        display(arrayToSort);
        System.out.println("Now HEAP Sorting Starts :");
        iterativeHeapSort(arrayToSort,arrayToSort.length);
//        recursiveHeapSort(arrayToSort);
        display(arrayToSort);
    }
    void iterativeHeapSort(int arr[],int n){
        buildMaxHeap(arr, n);

        for (int i = n - 1; i > 0; i--)
        {
            // swap value of first indexed
            // with last indexed
            swap(arr, 0, i);

            // maintaining heap property
            // after each swapping
            int j = 0, index;

            do
            {
                index = (2 * j + 1);

                // if left child is smaller than
                // right child point index variable
                // to right child
                if (index < (i - 1) && arr[index] < arr[index + 1])
                    index++;

                // if parent is smaller than child
                // then swapping parent with child
                // having higher value
                if (index < i && arr[j] < arr[index])
                    swap(arr, j, index);

                j = index;

            } while (index < i);
        }
    }

    // function build Max Heap where value
    // of each child is always smaller
    // than value of their parent
    static void buildMaxHeap(int arr[], int n)
    {
        for (int i = 1; i < n; i++)
        {
            // if child is bigger than parent
            if (arr[i] > arr[(i - 1) / 2])
            {
                int j = i;

                // swap child and parent until
                // parent is smaller
                while (arr[j] > arr[(j - 1) / 2])
                {
                    swap(arr, j, (j - 1) / 2);
                    j = (j - 1) / 2;
                }
            }
        }
    }


    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j] = temp;
    }


    public void recursiveHeapSort(int arr[])
    {
        int N = arr.length;

        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }


    /**
     * MERGE SORT
     *
     * @links
     * <a href="https://www.geeksforgeeks.org/merge-sort/">MERGE SORT</a>
     */
    public void mergeSort()
    {
        System.out.println("Enter the size of array :");
        int size=scanner.nextInt();
        int[] arrayToSort=new int[size];
        System.out.println("Enter the values in array :");
        for(int iteratorI=0;iteratorI<size;iteratorI++)
        {
            arrayToSort[iteratorI]=scanner.nextInt();
        }
        display(arrayToSort);
        System.out.println("Now MERGE Sorting Starts :");
        sort(arrayToSort,0,arrayToSort.length-1);
        display(arrayToSort);
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
