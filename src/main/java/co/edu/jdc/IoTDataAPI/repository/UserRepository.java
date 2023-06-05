package co.edu.jdc.IoTDataAPI.repository;

import co.edu.jdc.IoTDataAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

    Optional<User> findOneByEmail(String email);

}
