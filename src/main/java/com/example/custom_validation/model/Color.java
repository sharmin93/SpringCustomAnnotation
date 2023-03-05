package com.example.custom_validation.model;
import com.example.custom_validation.annotations.ColorValidation;



public class Color {
   @ColorValidation(message = "Invalid color.must be red green")
   private  String colorName;
    private String colorCode;

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
    public String getColorName() {
        return colorName;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }






}
