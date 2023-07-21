package ujkhatri.springboot_tutorial;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ujkhatri.service.impl.SampleServiceImpl;

import java.lang.reflect.Field;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SampleServiceImplTest {

    @Autowired
    private SampleServiceImpl sampleService;

    @Mock
    private ObjectMapper objectMapperMock;

    @Test
    public void objectMapperMethodTest() throws JsonProcessingException, NoSuchFieldException, IllegalAccessException {

        Field field = sampleService.getClass().getDeclaredField("objectMapper");
        field.setAccessible(true);
        field.set(sampleService, objectMapperMock);

        when(objectMapperMock.writeValueAsBytes(any())).thenThrow(JsonProcessingException.class);
        HttpStatus httpStatus = sampleService.objectMapperMethod();
        assertThat(httpStatus).isEqualTo(HttpStatus.BAD_REQUEST);
    }

}
