//package ujkhatri.springboot_tutorial.mongo;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.ExampleMatcher;
//import ujkhatri.model.User;
//import ujkhatri.repository.UserRepository;
//
//import java.util.List;
//
//
//
//@DataMongoTest
//class mongotest {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void testFindByFirstName() {
//        // Create test data
//
//        User user1 = new User(1,"user1", 21);
//        User user2 = new User(2,"user2", 22);
//
//        userRepository.save(user1);
//        userRepository.save(user2);
//
//
//        // Perform the query
//        ExampleMatcher matcher = ExampleMatcher.matching().withIgnorePaths("id");
//        Example<User> example = Example.of(new User(1, "user1", 21), matcher);
//        List<User> result = userRepository.findAll(example);
//
//        // Verify the results
//        Assertions.assertEquals(1, result.size());
//        Assertions.assertEquals("user1", result.get(0).getName());
//    }
//
//}
