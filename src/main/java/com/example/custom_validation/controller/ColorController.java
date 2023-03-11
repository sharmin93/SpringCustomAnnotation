package com.example.custom_validation.controller;

import com.example.custom_validation.groups.ColorGroup;
import com.example.custom_validation.model.Color;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
public class ColorController {
    @PostMapping("/color")
    public Color getColorCode(@Validated(ColorGroup.class) @RequestBody Color color) {
        Color colorObj = new Color();
        colorObj.setColorName(color.getColorName());
        if (colorObj.getColorName().equals("Red")) {
            colorObj.setColorCode("R100");
        }else if (colorObj.getColorName().equals("Green")){
            colorObj.setColorCode("G100");
        }
        else {
            colorObj.setColorCode("B100");
        }
        return colorObj;
    }
}

