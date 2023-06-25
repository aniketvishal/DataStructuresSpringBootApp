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

}
