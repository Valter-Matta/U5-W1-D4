package com.pizzeria.menu.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Inheritance (strategy = InheritanceType.JOINED)
public abstract class Item {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	protected int calories;
	protected double price;

	public Item (int calories, double price) {
		this.calories = calories;
		this.price = price;
	}

}
