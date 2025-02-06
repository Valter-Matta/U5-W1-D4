package com.pizzeria.menu.entities;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping, Long> {
	Topping findByName(String name);
	Topping findByCalories(int calories);
	Topping findByPrice(double price);
}
