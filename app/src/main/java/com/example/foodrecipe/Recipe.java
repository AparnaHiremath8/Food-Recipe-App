package com.example.foodrecipe;

import java.io.Serializable;

public class Recipe implements Serializable {
    private String title;
    private String ingredients;
    private int imageResourceId;
    private String instructions;

    public Recipe(String title, String ingredients, int imageResourceId, String instructions) {
        this.title = title;
        this.ingredients = ingredients;
        this.imageResourceId = imageResourceId;
        this.instructions = instructions;
    }

    // other methods and getters/setters


    public String getTitle() {
        return title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getInstructions() {
        return instructions;
    }

}
