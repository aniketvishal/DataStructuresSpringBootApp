package com.DataStructures.DataStructures.Strings.Controller;

import com.DataStructures.DataStructures.Strings.Service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/strings")
public class StringsController {

    @Autowired
    StringService stringService;
    @RequestMapping(value = "/isPanagram",method = RequestMethod.GET)
    void isPanagram()
    {
        stringService.isPanagram();
    }

    @RequestMapping(value = "/common_characters_between_strings",method = RequestMethod.GET)
    void getCommonBetweenStrings()
    {
        stringService.getCommonBetweenStrings();
    }
}
