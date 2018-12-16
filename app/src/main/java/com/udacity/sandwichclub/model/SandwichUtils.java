package com.udacity.sandwichclub.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class SandwichUtils {
    public static Sandwich deserializeJSON(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, Sandwich.class);
        } catch (IOException e) {
            return null;
        }
    }
}
