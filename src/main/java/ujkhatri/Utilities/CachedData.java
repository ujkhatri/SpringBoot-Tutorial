package ujkhatri.Utilities;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CachedData {

    @Cacheable("userName")
    public String fetchUserName() {
        // Code in this method will be executed for the first time
        // Later the cached value will be returned
        System.out.print("Inside fetchUserName method");
        return "Suresh";
    }
}
