package com.example.junnel_lalaine.starbuzz;

/**
 * Created by Junnel_Lalaine on 8/27/2017.
 */

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    //drinks is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "A couple of espresso shots with steamed milk", R.drawable.cappuccino),
            new Drink("Filter", "A couple of espresso shots with steamed milk", R.drawable.filter)
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    private Drink(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    } //end of constructor

    @Override
    public String toString() {
        return this.name;
    }
}

