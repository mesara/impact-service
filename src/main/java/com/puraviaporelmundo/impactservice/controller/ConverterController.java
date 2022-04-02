package com.puraviaporelmundo.impactservice.controller;

import com.puraviaporelmundo.impactservice.model.Converter;
import com.puraviaporelmundo.impactservice.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.UnsupportedEncodingException;

@Controller
public class ConverterController {

    @Autowired
    private ConverterService converterService;

    @GetMapping("/converter")
    public String getInitialPage(Model model) {
        model.addAttribute("converter", new Converter());
        return "converter";
    }

    @PostMapping("/converter")
    public String convertUrl(@ModelAttribute Converter converter, Model model) throws UnsupportedEncodingException {
        model.addAttribute("converter", converterService.getConvertedUrl(converter));
        return "result";
    }
}
