package com.DataStructures.DataStructures.Strings.Service.impl;

import com.DataStructures.DataStructures.Strings.Service.StringService;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class StringServiceImpl implements StringService {

    Scanner sc=new Scanner(System.in);
    @Override
    public void isPanagram() {
        String str= "";
        System.out.println("Enter the string you want to check is Panagram or not (please enter smaller case characters between 'a' to 'z')  :");
        str= sc.next();
        char[] charArray = str.toCharArray();
        int hashArray[]=new int[26];
        int count=0;
        for (char c:charArray)
        {
            int asci=(int)c-97;
            if(hashArray[asci]==0)
            {
                count++;
                hashArray[asci]++;
            }
        }
        if(count==26)
        {
            System.out.println("String is a Panagram");
        }else {
            System.out.println("Is not a Panagram");
        }
    }
    @Override
    public void getCommonBetweenStrings() {
        System.out.println("Enter number of strings you want to compare for common characters :");
        int stringCount;
        stringCount=sc.nextInt();
        String strings[]=new String[stringCount];
        for(int i=0;i<stringCount;i++) {
            System.out.println("Enter "+ i+"th string :");
            strings[i]=sc.next();
        }
        int count=0;
        int hashArray[] = new int[92];
        for (String str:strings) {
            ++count;
            char[] charArray = str.toCharArray();
            for (char c : charArray) {
                int asci = (int) c - 32;
                if (hashArray[asci] == (count-1)) {
                    hashArray[asci]++;
                }
            }
        }
        System.out.println("Common characters in strings are :");
        for (int i=0;i<hashArray.length;i++)
        {
            if(hashArray[i]==stringCount)
            {
                System.out.println((char) (i+32));
            }
        }
    }
}
