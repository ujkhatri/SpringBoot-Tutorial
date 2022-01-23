package ujkhatri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ujkhatri.Utilities.AsynchronousTasks;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @Autowired
    AsynchronousTasks asynchronousTasks;

    @GetMapping(value = "/api/v1/sample")
    public Map getAPI() {
        Map<String, Object> responseMap = new HashMap<>();
        asynchronousTasks.asynchronousTask();
        System.out.println("This message right after asynchronousTask method called");
        responseMap.put("statusMessage", "success");
        responseMap.put("statusCode", 200);
        return responseMap;
    }
}
