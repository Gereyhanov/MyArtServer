package com.server.MyArtServer.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class MyArtServerController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getMyArt(ModelMap model){
        return "MyArtServer";
    }

    @RequestMapping(value = "/getVer", method = RequestMethod.GET)
    @ResponseBody
    public String getVer(ModelMap model){

        return "0.0.1";
    }
}
