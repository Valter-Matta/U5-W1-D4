package com.pizzeria.menu.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Entity
@jakarta.persistence.Table(name = "tavolo")
public class Table {
	@Id
	private Long numTable;

	private int numMaxCoperti;
	private boolean isFree;
	@Value ("${seat.price}")
	private double costoCoperto;

	public void print () {
		System.out.println("numero tavolo--> " + numTable);
		System.out.println("numero massimo coperti--> " + numMaxCoperti);
		System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
	}

}
