package ujkhatri.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ujkhatri.Utilities.Utility;

@Component
public class Config {

    @Bean(name = "util", initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Utility utility(){
        return new Utility();
    }
}
