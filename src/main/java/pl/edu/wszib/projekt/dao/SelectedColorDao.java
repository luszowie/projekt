package pl.edu.wszib.projekt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projekt.domains.SelectedColor;

import java.util.List;
@Repository
public interface SelectedColorDao extends CrudRepository<SelectedColor, Integer> { //interface repozytorium służąca do zarządzania

    List <SelectedColor> findByColor (String color); //po tej deklaracji spring samo ogarnie metodę jak do findBy doda się pole modelu domenowego i w nawiasie poda się też to pole to działą
    //imlemntacja jest dostarczona przez frame work springboot
}
