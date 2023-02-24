package ujkhatri.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ujkhatri.model.User;


public interface UserRepository extends MongoRepository<User, String> {}
