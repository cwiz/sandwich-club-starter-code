package com.udacity.sandwichclub.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Sandwich {

    public SandwichName getName() {
        return name;
    }

    public void setName(SandwichName name) {
        this.name = name;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    SandwichName name;
    String placeOfOrigin;
    String description;
    String image;
    String[] ingredients;
}

