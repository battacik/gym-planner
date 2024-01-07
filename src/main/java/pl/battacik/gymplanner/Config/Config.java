package pl.battacik.gymplanner.Config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Swagger działa tylko dla klas oznaczonych adnotacją @RestController
@Configuration
@EnableWebMvc
public class Config{
    @Autowired
    private ObjectMapper objectMapper;

    void customizeObjectMapper(){
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }
}
