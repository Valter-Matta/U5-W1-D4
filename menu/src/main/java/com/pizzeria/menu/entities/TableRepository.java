package com.pizzeria.menu.entities;


import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Table, Long> {
	Table findByNumTable(Long numTable);
	Table deleteByNumTable(Long numTable);
}
