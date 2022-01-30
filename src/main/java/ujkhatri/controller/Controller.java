package ujkhatri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ujkhatri.Utilities.AsynchronousTasks;
import ujkhatri.Utilities.CachedData;
import ujkhatri.model.User;

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
    RestTemplate restTemplate;

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

    //SERVICE_URL defined in application.properties file
    @Value( "${SERVICE_URL}" )
    private String serviceURL;

    @GetMapping(value = "/rest-client-demo")
    public ResponseEntity<Map> restClientDemo() {
        User user = new User(1, "Suresh");
        ResponseEntity<Map> response = restTemplate.postForEntity(serviceURL, user, Map.class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
        return new ResponseEntity<Map>(successResponse(), HttpStatus.OK);
    }

    private Map successResponse() {
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("statusMessage", "success");
        responseMap.put("statusCode", 200);
        return responseMap;
    }

}
