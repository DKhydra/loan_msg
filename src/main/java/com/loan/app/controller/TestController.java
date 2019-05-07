package com.loan.app.controller;

import com.loan.util.ApiVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "app/{version}")
public class TestController {

    @ApiVersion(1)
    @RequestMapping(value="/test" ,method = RequestMethod.GET)
    @ResponseBody
    public String Test(){
        String result = "hello world";
        return result;
    }
}
