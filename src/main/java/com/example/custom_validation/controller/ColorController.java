package com.example.custom_validation.controller;

import com.example.custom_validation.groups.ColorGroup;
import com.example.custom_validation.model.Color;

import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@Log4j
public class ColorController {
    static Logger logger = Logger.getLogger(ColorController.class);

    @PostMapping("/color")
    public Color getColorCode(@Validated(ColorGroup.class) @RequestBody Color color) {
        Color colorObj = new Color();
        colorObj.setColorName(color.getColorName());
        if (colorObj.getColorName().equals("Red")) {
            colorObj.setColorCode("R100");
        } else if (colorObj.getColorName().equals("Green")) {
            colorObj.setColorCode("G100");
        } else {
            colorObj.setColorCode("B100");
        }
        return colorObj;
    }

    @GetMapping("/hello")
    public String hello() {
        String strValue = "hello filter";
        System.out.println(" " + strValue);
        logger.info("hello " + strValue);
        return strValue;
    }

    @GetMapping("/colorCheck")
    public String colorCheck() {
        String str = "Color check filter";
        logger.info("color check" + str);
        System.out.println(" " + str);
        return str;
    }
}

