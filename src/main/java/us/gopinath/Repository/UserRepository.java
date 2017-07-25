package us.gopinath.Repository;

import org.springframework.data.repository.CrudRepository;
import us.gopinath.Entity.User;


public interface UserRepository extends CrudRepository<User, Integer> {
}
