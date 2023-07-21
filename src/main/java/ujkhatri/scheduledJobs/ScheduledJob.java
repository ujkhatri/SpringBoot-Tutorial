package ujkhatri.scheduledJobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Component
@EnableScheduling
public class ScheduledJob {

    private final TaskScheduler taskScheduler;

    @Autowired
    public ScheduledJob(TaskScheduler taskScheduler) {
        this.taskScheduler = taskScheduler;
    }

    //@Scheduled(initialDelay = 2000, fixedDelay = 1000)
    private void scheduledTask() {
        System.out.println("This job starts with a delay of 2 seconds and prints this message after every 1 second");
    }

    public boolean isSchedulerRunning() {
        if (taskScheduler instanceof ThreadPoolTaskScheduler) {
            ThreadPoolTaskScheduler threadPoolTaskScheduler = (ThreadPoolTaskScheduler) taskScheduler;
            return !threadPoolTaskScheduler.getScheduledThreadPoolExecutor().isShutdown();
        }
        return true; // Handle the case if the scheduler is not a ThreadPoolTaskScheduler
    }
}
