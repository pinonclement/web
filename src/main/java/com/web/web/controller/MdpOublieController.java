package com.web.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mdpoublie")
public class MdpOublieController {
    @RequestMapping(method = RequestMethod.GET)
    public String afficherConnexion(final ModelMap pModel) {
        //pModel.addAttribute("personne", "Regis");
        return "mdpoublie";
    }
}
