package com.springapp.secure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Natallia_Kamisarava on 27-May-14.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String start(Model model) {
        return "index";
    }
}
