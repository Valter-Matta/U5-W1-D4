package com.pizzeria.menu.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@Component
@Entity
@NoArgsConstructor
public class Menu {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany
	private List<Pizza> pizzaList=new ArrayList<>();
	@OneToMany
	private List<Drink> drinkList=new ArrayList<>();
	@OneToMany
	private List<Topping> toppingList=new ArrayList<>();

	public void printMenu () {
		System.out.println("******* Menu *******");
		System.out.println("PIZZAS");
		this.pizzaList.forEach(System.out::println);
		System.out.println();

		System.out.println("TOPPINGS");
		this.toppingList.forEach(System.out::println);
		System.out.println();

		System.out.println("DRINKS");
		this.drinkList.forEach(System.out::println);
		System.out.println();

	}
}
