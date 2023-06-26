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


    
}
