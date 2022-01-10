package ujkhatri.scheduledJobs;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class ScheduledJob {

    @Scheduled(initialDelay = 2000, fixedDelay = 1000)
    private void scheduledTask() {
        System.out.println("This job starts with a delay of 2 seconds and prints this message after every 1 second");
    }
}
