package com.udacity.sandwichclub.model;

public class SandwichName {
    String mainName;

    public String getMainName() {
        return mainName;
    }

    public void setMainName(String mainName) {
        this.mainName = mainName;
    }

    public String[] getAlsoKnownAs() {
        return alsoKnownAs;
    }

    public void setAlsoKnownAs(String[] alsoKnownAs) {
        this.alsoKnownAs = alsoKnownAs;
    }

    String[] alsoKnownAs;
}
