package ujkhatri.controller;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ujkhatri.model.User;
import ujkhatri.repository.UserRepository;
import ujkhatri.validators.UserValidator;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/all")
    public List<User> getAllIssues() {
        return userRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<Object> addUser(@RequestBody @UserValidator User user) {
        return null;
    }

}


