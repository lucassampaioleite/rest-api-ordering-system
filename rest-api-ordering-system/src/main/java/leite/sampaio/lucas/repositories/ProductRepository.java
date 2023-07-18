package leite.sampaio.lucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import leite.sampaio.lucas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
