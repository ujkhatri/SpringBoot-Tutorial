package ujkhatri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping(value = "/api/v1/sample")
    public Map getAPI() {
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("statusMessage", "success");
        responseMap.put("statusCode", 200);
        return responseMap;
    }
}
