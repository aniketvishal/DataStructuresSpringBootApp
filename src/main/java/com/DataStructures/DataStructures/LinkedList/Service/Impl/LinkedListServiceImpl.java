package com.DataStructures.DataStructures.LinkedList.Service.Impl;

import com.DataStructures.DataStructures.LinkedList.Service.LinkedListService;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class LinkedListServiceImpl implements LinkedListService {

    @Override
    public void createAndFindSize()
    {

        System.out.println("Hello I just started");
        Scanner scanner=new Scanner(System.in);
        String sc=new String();
        sc=scanner.nextLine();
        System.out.println(sc);
        System.out.println("END");
    }
}
