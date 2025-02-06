package com.pizzeria.menu.entities;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {

	Pizza findByName (String name);
	Pizza findByNameAndIsXl (String name, boolean isXl);
}
