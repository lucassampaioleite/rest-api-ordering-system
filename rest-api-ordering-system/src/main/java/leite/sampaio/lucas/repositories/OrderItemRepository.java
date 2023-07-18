package leite.sampaio.lucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import leite.sampaio.lucas.entities.OrderItem;
import leite.sampaio.lucas.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
