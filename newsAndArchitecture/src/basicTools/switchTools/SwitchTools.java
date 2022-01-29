package basicTools.switchTools;

import java.time.DayOfWeek;

public class SwitchTools {

    private String switchVersion14(DayOfWeek dayOfWeek){

        return switch(dayOfWeek){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Util Day";
            case SATURDAY, SUNDAY -> "Weekend";
        };
    }

}
