package luv2code.firstapplication.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // Making TrackCoach as primary coach
@Lazy
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "I am dailyWorkout form TrackCoach!";
    }
}
