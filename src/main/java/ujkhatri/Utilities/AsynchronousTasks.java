package ujkhatri.Utilities;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsynchronousTasks {

    @Async
    public void asynchronousTask() {
        System.out.println("This message is printed before sleep call in async method.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This message is printed after sleep call in async method.");
    }
}
