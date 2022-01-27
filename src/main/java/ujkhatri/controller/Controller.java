package ujkhatri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    private Map successResponse () {
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("statusMessage", "success");
        responseMap.put("statusCode", 200);
        return responseMap;
    }

}
