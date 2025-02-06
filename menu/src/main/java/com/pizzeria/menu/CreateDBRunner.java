package com.pizzeria.menu;


import com.pizzeria.menu.entities.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Order (2)
public class CreateDBRunner implements CommandLineRunner {

	private final ToppingRepository toppingRepository;
	private final PizzaRepository pizzaRepository;
	private final DrinkRepository drinkRepository;
	private final TableRepository tavoloRepository;
	//pizze
	private final Pizza pizza_margherita;
	private final Pizza hawaiian_pizza;
	//topping
	private final Topping toppings_tomato;
	private final Topping toppings_cheese;
	private final Topping toppings_ham;
	private final Topping toppings_pineapple;
	private final Topping toppings_salami;
	//drink
	private final Drink water;
	private final Drink lemonade;
	private final Drink wine;
	//tavoli
	private final Table Tavolo1;
	private final Table Tavolo2;

	@Override
	public void run (String... args) throws Exception {

		//salvo dei topping
		toppingRepository.save(toppings_tomato);
		toppingRepository.save(toppings_cheese);
		toppingRepository.save(toppings_ham);
		toppingRepository.save(toppings_pineapple);
		toppingRepository.save(toppings_salami);

		//salvo i drink
		drinkRepository.save(water);
		drinkRepository.save(lemonade);
		drinkRepository.save(wine);
		//salvo le due pizze
		pizzaRepository.save(pizza_margherita);
		pizzaRepository.save(hawaiian_pizza);

		//salvo i tavoli
		tavoloRepository.save(Tavolo1);
		tavoloRepository.save(Tavolo2);

	}


}
