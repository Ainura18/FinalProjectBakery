package com.pastrygame;

import java.util.List;

public class Pastry {
    private String name;
    private String imagePath;
    private List<String> correctIngredients;

    public Pastry(String name, String imagePath, List<String> correctIngredients) {
        this.name = name;
        this.imagePath = imagePath;
        this.correctIngredients = correctIngredients;
    }

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public List<String> getCorrectIngredients() {
        return correctIngredients;
    }
}
