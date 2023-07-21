package ujkhatri.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ujkhatri.Utilities.SpringServiceConfig;
import ujkhatri.model.User;
import ujkhatri.service.UserService;

import javax.swing.*;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    RestTemplate restTemplate;

    //SERVICE_URL defined in application.properties file
    @Value( "${SERVICE_URL}" )
    private String serviceURL;

    @Override
    public void addUser() {
        System.out.println("Printed from User Service");
        User user = new User(1, "Suresh", 30);
        ResponseEntity<Map> response = restTemplate.postForEntity(serviceURL, user, Map.class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
    }

    @Override
    public void testMethod(){
        throw new RuntimeException();
    }
}
