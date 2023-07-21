package ujkhatri.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import ujkhatri.Utilities.SpringServiceConfig;

@Component
public class SampleServiceImpl {
    private ObjectMapper objectMapper = SpringServiceConfig.objectMapper();
    public HttpStatus objectMapperMethod() {
        try {
            Object testObj = objectMapper.writeValueAsBytes("Some-Text");
        } catch (JsonProcessingException e) {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }
}
