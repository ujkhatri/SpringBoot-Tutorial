package ujkhatri.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import ujkhatri.model.User;


public interface UserRepository extends MongoRepository<User, Integer> {
    @Query("{id:'?0'}")
    User findItemByName(Integer id);

}
