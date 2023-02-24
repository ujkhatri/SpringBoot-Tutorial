package ujkhatri.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ujkhatri.Utilities.AsynchronousTasks;
import ujkhatri.Utilities.CachedData;
import ujkhatri.model.User;
import ujkhatri.model.logs.KibanaLog;
import ujkhatri.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * The type Controller.
 */
@Slf4j
@RestController
@RequestMapping("/api/v1")
public class Controller {

    /**
     * The Asynchronous tasks.
     */
    @Autowired
    AsynchronousTasks asynchronousTasks;

    /**
     * The Cached data.
     */
    @Autowired
    CachedData cachedData;

    /**
     * The User service.
     */
    @Autowired
    UserService userService;

    /**
     * Gets api.
     *
     * @return the api
     */
    @GetMapping(value = "/sample")
    public Map<String, Object> getAPI() {
        asynchronousTasks.asynchronousTask();
        KibanaLog kibanaLog = new KibanaLog(UUID.randomUUID(), this.getClass().toString(), HttpStatus.OK.value(), "Status is Ok");
        log.info("The sample API is called: " + kibanaLog.toString());
        return successResponse();
    }

    /**
     * Cache demo map.
     *
     * @return the map
     */
    @GetMapping(value = "/cache-demo")
    public Map<String, Object> cacheDemo() {
        cachedData.fetchUserName();
        return successResponse();
    }

    /**
     * Handles HTTP POST requests to the endpoint "/add-user" with a JSON request body and a JSON response.
     *
     * @param location The "APPLICATION-LOCATION" header from the request. If the header is not present, the default value "EUROPE" is used.
     * @param user     The request body, deserialized into a User object.
     * @return A response with a success status and a JSON response body.
     */
    @PostMapping(value = "/add-user", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Map<String, Object>> addUser(
            @RequestHeader(name = "APPLICATION-LOCATION", defaultValue = "EUROPE") String location,
            @RequestBody User user) {
        return new ResponseEntity<>(successResponse(), HttpStatus.OK);
    }

    /**
     * Rest client demo response entity.
     *
     * @return the response entity
     */
    @GetMapping(value = "/rest-client-demo")
    public ResponseEntity<Map<String, Object>> restClientDemo() {
        userService.addUser();
        return new ResponseEntity<>(successResponse(), HttpStatus.OK);
    }

    private Map<String, Object> successResponse() {
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("statusMessage", "success");
        responseMap.put("statusCode", 200);
        return responseMap;
    }
}
