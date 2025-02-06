package com.pizzeria.menu.entities;


import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink, Long> {
	Drink findByName(String name);
	Drink findByNameAndCalories(String name, int calories);
	Drink findByNameAndCaloriesAndPrice(String name, int calories, double price);
}
