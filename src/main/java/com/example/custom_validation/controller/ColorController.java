package com.example.custom_validation.controller;
import com.example.custom_validation.model.Color;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {
    @GetMapping("/color")
    public Color getColorCode(@Valid @RequestBody Color color) {
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

