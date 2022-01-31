package ujkhatri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ujkhatri.Utilities.AsynchronousTasks;
import ujkhatri.Utilities.CachedData;
import ujkhatri.model.User;
import ujkhatri.service.UserService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    AsynchronousTasks asynchronousTasks;

    @Autowired
    CachedData cachedData;

    @Autowired
    UserService userService;

    @GetMapping(value = "/sample")
    public Map getAPI() {
        asynchronousTasks.asynchronousTask();
        System.out.println("This message right after asynchronousTask method called");
        return successResponse();
    }

    @GetMapping(value = "/cache-demo")
    public Map cacheDemo() {
        cachedData.fetchUserName();
        return successResponse();
    }

    @PostMapping(value = "/add-user", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Map> addUser(
            @RequestHeader(name = "APPLICATION-LOCATION", defaultValue = "EUROPE") String location,
            @RequestBody User user) {
        System.out.println(user.toString());
        System.out.println(location);
        return new ResponseEntity<Map>(successResponse(), HttpStatus.OK);
    }

    @GetMapping(value = "/rest-client-demo")
    public ResponseEntity<Map> restClientDemo() {
        userService.addUser();
        return new ResponseEntity<Map>(successResponse(), HttpStatus.OK);
    }

    private Map successResponse() {
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("statusMessage", "success");
        responseMap.put("statusCode", 200);
        return responseMap;
    }
}
