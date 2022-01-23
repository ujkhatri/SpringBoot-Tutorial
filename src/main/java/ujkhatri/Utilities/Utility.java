package ujkhatri.Utilities;

import org.springframework.stereotype.Component;

@Component
public class Utility {

    public void initMethod(){
        System.out.println("Print this on initialization");
    }
    public void destroyMethod(){
        System.out.println("Print this on destroy");
    }
}
