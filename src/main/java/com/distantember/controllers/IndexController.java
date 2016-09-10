package com.distantember.controllers;

import com.distantember.model.HtmlArticle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jondann on 8/30/16.
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
//        model.addAttribute("ranges", IndexStub.getRANGES());
//        model.addAttribute("articles", IndexStub.getARTICLES());
//        model.addAttribute("icons", IndexStub.getICONS());
//        model.addAttribute("activities", IndexStub.getACTIVITIES());
        return "shiphome";
    }

    @RequestMapping(value = "/shipwrecks", method = RequestMethod.GET)
    public String shipwrecks(Model model){
        model.addAttribute("shipwrecks", ShipwreckStub.list());
        return "shipwrecks";
    }

}
