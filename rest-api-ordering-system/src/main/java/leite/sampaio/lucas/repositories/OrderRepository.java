package leite.sampaio.lucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import leite.sampaio.lucas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}