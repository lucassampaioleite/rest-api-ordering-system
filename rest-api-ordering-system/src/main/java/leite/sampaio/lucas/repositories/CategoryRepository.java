package leite.sampaio.lucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import leite.sampaio.lucas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
