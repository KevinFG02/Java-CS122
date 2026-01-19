package Week2.FridayLab;

import java.time.LocalTime;

public class AlarmClock {
    private LocalTime currentTime;
    private boolean alarmSet;
    private LocalTime alarm;

    public AlarmClock(LocalTime currentTime, boolean alarmSet, LocalTime alarm){
        this.currentTime = currentTime;
        this.alarmSet = alarmSet;
        this.alarm = alarm;
    }

    public AlarmClock(LocalTime currentTime, LocalTime alarm){
        //this.currentTime = currentTime;
        //this.alarmSet = false;
        //this.alarm = alarm;

        this(currentTime, false, alarm);
    }

    public AlarmClock(LocalTime currentTime){
        //this.currentTime = currentTime;
        //this.alarmSet = false;
        //this.alarm = null;

        this(currentTime, false, null);
    }

    public AlarmClock(){
        //this.currentTime = null;
        //this.alarmSet = false;
        //this.alarm = null;

        this(null, false, null);
    }

    public LocalTime getCurrentTime(){
        return currentTime;
    }

    public void setCurrentTime(LocalTime currentTime){
        this.currentTime = currentTime;
    }

    public boolean isAlarmSet(){
        return alarmSet;
    }

    public void setAlarmSet(boolean alarmSet){
        this.alarmSet = alarmSet;
    }

    public LocalTime getAlarm(){
        return alarm;
    }

    public void setAlarm(LocalTime alarm){
        this.alarm = alarm;
    }

    @Override
    public String toString(){
        return "AlarmClock{ Current TIme='" + currentTime + "', Alarm Set='" + alarmSet + "', Alarm='" + alarm + "'}";
    }
}
