package com.example.custom_validation.controller;

import com.example.custom_validation.groups.ValueGroup;
import com.example.custom_validation.model.Color;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
    @PostMapping("/value")
    public Color getColorValue(@Validated(ValueGroup.class) @RequestBody Color color) {

        Color colorObjValue = new Color();
        colorObjValue.setColorValue(color.getColorValue());
        if (colorObjValue.getColorValue() == 1) {
            colorObjValue.setColorCode("R100");
        } else if (colorObjValue.getColorValue() == 2) {
            colorObjValue.setColorCode("G100");
        } else {
            colorObjValue.setColorCode("B300");
        }

        return colorObjValue;
    }
}
