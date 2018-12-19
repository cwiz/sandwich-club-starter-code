package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.Vector;

/*
    JSON Example:

   {\"name\":{\"mainName\":\"Ham and cheese
            sandwich\",\"alsoKnownAs\":[]},\"placeOfOrigin\":\"\",\"description\":\"A ham and cheese
            sandwich is a common type of sandwich. It is made by putting cheese and sliced ham
            between two slices of bread. The bread is sometimes buttered and/or toasted. Vegetables
            like lettuce, tomato, onion or pickle slices can also be included. Various kinds of
            mustard and mayonnaise are also
            common.\",\"image\":\"https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Grilled_ham_and_cheese_014.JPG/800px-Grilled_ham_and_cheese_014.JPG\",\"ingredients\":[\"Sliced
            bread\",\"Cheese\",\"Ham\"]}
 */

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json) throws JSONException {
        JSONObject obj = new JSONObject(json);
        Sandwich sandwich = new Sandwich();
        // main name
        sandwich.setName(obj.getJSONObject("name").getString("mainName"));
        // also known as
        int length = obj.getJSONObject("name").getJSONArray("alsoKnownAs").length();
        List<String> listKnownAs = new Vector<>();
        for (int i = 0; i < length; i++){
            listKnownAs.add(obj.getJSONObject("name").getJSONArray("alsoKnownAs").getString(i));
        }
        sandwich.setAlsoKnownAs(listKnownAs);
        // placeOfOrigin
        sandwich.setPlaceOfOrigin(obj.getString("placeOfOrigin"));
        // description
        sandwich.setDescription(obj.getString("description"));
        // image
        sandwich.setImage(obj.getString("image"));
        // ingredients
        length = obj.getJSONArray("ingredients").length();
        List<String> listIngredients = new Vector<String>();
        for (int i = 0; i < length; i++){
            listIngredients.add(obj.getJSONArray("ingredients").getString(i));
        }
        sandwich.setIngredients(listIngredients);
        return sandwich;
    }
}