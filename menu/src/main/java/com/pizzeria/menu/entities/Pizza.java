package com.pizzeria.menu.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class Pizza extends Item {
	private String name;
	private boolean isXl = false;
	@ManyToMany
	@JoinTable(
		name = "pizza_topping",
		joinColumns = @JoinColumn(name = "pizza_id"),
		inverseJoinColumns = @JoinColumn(name = "topping_id")
	)
	private List<Topping> toppingList;

	public Pizza (String name, List<Topping> toppingList, boolean isXl) {
		super(700, 4.3);
		this.name = name;
		this.toppingList = toppingList;
		this.isXl = isXl;
	}

	@Override
	public int getCalories () {
		return super.getCalories() + this.getToppingList().stream().mapToInt(Topping::getCalories).sum();
	}

	@Override
	public double getPrice () {
		return super.getPrice() + this.getToppingList().stream().mapToDouble(Topping::getPrice).sum();
	}

	@Override
	public String toString () {
		return "Pizza{" +
			"name='" + name + '\'' +
			", calories=" + getCalories() +
			", price=" + getPrice() +
			", toppingList=" + toppingList +
			", isXl=" + isXl +
			'}';
	}
}
