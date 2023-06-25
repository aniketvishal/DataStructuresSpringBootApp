package com.DataStructures.DataStructures.LinkedList.Controller;

import com.DataStructures.DataStructures.LinkedList.Service.LinkedListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping(value="/linked_list")
public class LinkedList {
    @Autowired
    LinkedListService linkedListService;
    @RequestMapping(value ="/create_and_find_size", method = RequestMethod.GET)
    void createAndFindSize()
    {
        linkedListService.createAndFindSize();
    }
}
