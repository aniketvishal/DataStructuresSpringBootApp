package com.DataStructures.DataStructures.Arrays.Controller;

import com.DataStructures.DataStructures.Arrays.Service.ArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/array")
public class ArrayController {
    @Autowired
    ArrayService arrayService;

//         GO TO ANY LINK IN COMMENT AND Ctrl+B to open link

    /**
     *
     * Also Go through this
     *
     * @links
     * <a href="https://www.baeldung.com/java-sorting">Predefined sorting functions in Java</a>
     * <a href="https://www.geeksforgeeks.org/sorting-algorithms/">ARRAY SORTING ALORITHMS</a>
     *
     */


    /**
     * Linear Search In Array
     * Time Complexity of O(n)
     */
    @RequestMapping(value = "/searching_linear_search")
    void LinearSearch()
    {
        arrayService.linearSearch();
    }



    /**
     * Bubble Sort
     *
     * Keep swapping elements that are not in their right location till the array is sorted.
     *
     * Worst Time Complexity
     * O (n^2)
     */
    @RequestMapping(value = "/sort_bubble_sort")
    void bubbleSort()
    {
        arrayService.bubbleSort();
    }




    /**
     * Selection Sort
     *
     * Find the minimum element in each run of the array and swap it with the element at the current index is compared.
     *
     * Worst Time Complexity
     * O(n^2)
     */
    @RequestMapping(value = "/sort_selection_sort")
    public void selectionSort()
    {
        arrayService.selectionSort();
    }


    /**
     * Insertion Sort
     *
     * In every run, compare it with the predecessor. If the current element is not in the correct location,
     * keep shifting the predecessor subarray till the correct index for the element is found.
     *
     * O(n^2)
     */
    @RequestMapping(value = "/sort_insertion_sort")
    public void insertionSort()
    {
        arrayService.insertionSort();
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
     *  O(N.log(N))
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
    @RequestMapping(value = "/sort_heap_sort")
    public void heapSort(){arrayService.heapSort();}


    /**
     * MERGE SORT
     *
     * @links
     * <a href="https://www.geeksforgeeks.org/merge-sort/">MERGE SORT</a>
     *
     * θ(N.log(N))
     */
    @RequestMapping(value = "/sort_merge_sort")
    public void mergeSort(){
        arrayService.mergeSort();
    }

}