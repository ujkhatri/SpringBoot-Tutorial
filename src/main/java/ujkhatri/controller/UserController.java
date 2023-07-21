package ujkhatri.controller;
//import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;
import ujkhatri.model.User;
import ujkhatri.repository.UserRepository;
import ujkhatri.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
//@Tag(name = "User API", description = "User API endpoints for your application")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable int userId) throws Exception {
        userService.testMethod();
        Optional<User> user = userRepository.findById(userId);
        return user;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        return new ResponseEntity<>(userRepository.insert(user), HttpStatus.OK);
    }

}











