package luv2code.firstapplication.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Making TrackCoach as primary coach
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "I am dailyWorkout form TrackCoach!";
    }
}
