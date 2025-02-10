package luv2code.firstapplication.rest;

import luv2code.firstapplication.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for dependency
//    private Coach myCoach;


    // define constructor for dependency injection
    // Autowired tells spring to inject dependency
    // Note: if u only have 1 constructor then @Autowired is optional
//    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }

    // setter injection
//    @Autowired
//    public void setCoach(Coach theCoach) {
//        myCoach = theCoach;
//    }

//    // Field Injection
//    @Autowired
//    private Coach myCoach;

    private Coach myCoach;

    // Qualifier example
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        System.out.println("In Constructor: "+getClass().getSimpleName());
        myCoach = theCoach;
    }



    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
