package com.distantember.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jondann on 9/2/16.
 */

@RestController
public class BootController {

    static int count = 0;

    @RequestMapping("/boot")
    public String boot(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Welcome to Spring in WA: " + count++;
    }

    @RequestMapping("/boot-reset")
    public void bootReset(){
        count = 0;
    }
}
