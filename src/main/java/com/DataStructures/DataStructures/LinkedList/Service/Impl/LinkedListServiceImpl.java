package com.DataStructures.DataStructures.LinkedList.Service.Impl;

import com.DataStructures.DataStructures.LinkedList.Service.LinkedListService;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class LinkedListServiceImpl implements LinkedListService {
    Scanner scanner=new Scanner(System.in);


    public class Node{
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }



    @Override
    public void createAndFindSize()
    {
        System.out.println("Hello I just started");
        Node head=null;
        Node tail=null;
        boolean input=true;
        while(input)
        {
            insertIntoLinkedLIst(head,tail);
            System.out.println("Want to Insert Elements into Linked List : enter 1 else 0 :");
            input=scanner.nextBoolean();
        }
        int[] n=new int[]{1,2,3,};
    }

    private void insertIntoLinkedLIst(Node head,Node tail)
    {
        System.out.println("Enter The Number you want to Insert : ");
        int num;
        num=scanner.nextInt();
        Node node=new Node();
        node.setData(num);
        node.setNext(null);
        tail.setNext(node);
        tail=node;
        if(head==null)
        {
            head=node;
        }
    }
}
