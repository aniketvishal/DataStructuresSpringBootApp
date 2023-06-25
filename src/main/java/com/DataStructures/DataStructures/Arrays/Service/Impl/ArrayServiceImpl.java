package com.DataStructures.DataStructures.Arrays.Service.Impl;

import com.DataStructures.DataStructures.Arrays.Service.ArrayService;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ArrayServiceImpl implements ArrayService {
    Scanner scanner=new Scanner(System.in);
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
}
