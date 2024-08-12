package com.example.cardapio.food;

public record FoodResposeDTO(Long id, String title, Integer price, String image) {
    public FoodResposeDTO(Food food){
        this(food.getId(), food.getTitle(), food.getPrice(), food.getImage());
    }
}
