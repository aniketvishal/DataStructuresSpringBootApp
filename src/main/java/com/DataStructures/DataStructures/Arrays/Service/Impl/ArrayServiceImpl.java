package com.DataStructures.DataStructures.Arrays.Service.Impl;

import com.DataStructures.DataStructures.Arrays.Service.ArrayService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ArrayServiceImpl implements ArrayService {
    Scanner scanner=new Scanner(System.in);


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
        System.out.println("Now Sorting Starts :");
        int temp;
//        selectionSort(arrayToSort);
        if(arrayToSort.length<=1)
        {
            System.out.println("Array contain 1 or NO elements so it's already sorted ");
        }else {
            for(int interatorI=0;interatorI<arrayToSort.length;interatorI++)
            {
                for (int iteratorJ=0;iteratorJ<arrayToSort.length-1;iteratorJ++){
                    if(arrayToSort[iteratorJ]<arrayToSort[iteratorJ+1])
                    {
                        temp=arrayToSort[iteratorJ];
                        arrayToSort[iteratorJ]=arrayToSort[iteratorJ+1];
                        arrayToSort[iteratorJ+1]=temp;
                    }
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
        System.out.println("Now Sorting Starts :");
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
        System.out.println("Now Sorting Starts :");
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

}
