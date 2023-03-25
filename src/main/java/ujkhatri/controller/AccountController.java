package ujkhatri.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ujkhatri.model.User;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

    @PostMapping
    public ResponseEntity<User> createAccount(@RequestBody User account) {

        return new ResponseEntity<>(new User(), HttpStatus.OK);

    }

}
