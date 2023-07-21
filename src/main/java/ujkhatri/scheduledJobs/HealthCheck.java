package ujkhatri.scheduledJobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator {

    @Autowired
    ScheduledJob scheduledJob;

    @Override
    public Health getHealth(boolean includeDetails) {
        return Health.up().build();
    }

    @Override
    public Health health() {
//        if(scheduledJob.isSchedulerRunning())
//            return Health.up().build();
//        return Health.down().build();
        return Health.up().build();
    }
}
