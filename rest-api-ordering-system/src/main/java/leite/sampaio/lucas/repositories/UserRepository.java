package leite.sampaio.lucas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import leite.sampaio.lucas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
