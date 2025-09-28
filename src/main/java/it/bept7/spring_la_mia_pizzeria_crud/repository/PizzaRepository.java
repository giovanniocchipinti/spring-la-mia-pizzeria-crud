package it.bept7.spring_la_mia_pizzeria_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.bept7.spring_la_mia_pizzeria_crud.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>{

}
