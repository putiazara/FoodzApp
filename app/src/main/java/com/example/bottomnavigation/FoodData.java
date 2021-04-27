package com.example.bottomnavigation;

import java.util.ArrayList;

public class FoodData {
    private static String [] foodName = {
            "Burger",
            "Chicken Ball",
            "Chicken and Waffle",
            "Pizza",
            "Udon Noodle",
            "Taco",
            "Spaghetti Bolognese"
    };

    private static String [] foodDetail = {
            "A sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun.",
            "A dish consists of small chunks of fried chicken breast meat covered in a crispy batter coating.",
            "An American dish combining chicken with waffles.",
            "A savory dish of Italian origin consisting of a usually round, flattened base of leavened wheat-based dough.",
            "A thick noodle made from wheat flour, used in Japanese cuisine.",
            "A traditional Mexican dish consisting of a small hand-sized corn or wheat tortilla topped with a filling.",
            "A dish consists of spaghetti served with a sauce made from tomatoes, minced beef, garlic, wine and herbs."
    };

    private static int [] foodImage = {
            R.drawable.burger1,
            R.drawable.ball1,
            R.drawable.cw1,
            R.drawable.pizza1,
            R.drawable.udon1,
            R.drawable.tacos1,
            R.drawable.spaghetti1,
    };

    static ArrayList<Food> getListData(){
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position <foodName.length; position++) {
            Food food = new Food();
            food.setName(foodName[position]);
            food.setDetail(foodDetail[position]);
            food.setPhoto(foodImage[position]);
            list.add(food);
        }
        return list;
    }
}