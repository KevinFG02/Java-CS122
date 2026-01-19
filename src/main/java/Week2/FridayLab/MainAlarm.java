package Week2.FridayLab;
import java.time.LocalTime;

/*
    Making an alarm clock.

    Author: Kevin G Flores
    Date: 1/16/26
*/

public class MainAlarm {
    public static void main(String[] args) {
        AlarmClock alarm1 = new AlarmClock(LocalTime.now(), true, LocalTime.of(7, 30));
        System.out.println(alarm1);
        AlarmClock alarm2 = new AlarmClock(LocalTime.now(), LocalTime.of(9, 30));
        System.out.println(alarm2);
        AlarmClock alarm3 = new AlarmClock(LocalTime.now());
        System.out.println(alarm3);
        AlarmClock alarm4 = new AlarmClock();
        System.out.println(alarm4);
    }
}
