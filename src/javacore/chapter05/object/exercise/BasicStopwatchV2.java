package javacore.chapter05.object.exercise;

public class BasicStopwatchV2 {

    int seconds = 0;
    int minutes = 0;
    int hours = 0;

    public void startWatch(int finalTime) throws InterruptedException {

        for (; seconds < finalTime; seconds++) {

            Thread.sleep(1000);

            if (seconds >= 60) {
                minutes++;
                seconds = 0;

                if (minutes >= 60) {
                    hours++;
                    minutes = 0;
                }

            }

            displayWatchTime(hours, minutes, seconds);

        }

    }

    public void displayWatchTime(int hours, int minutes, int seconds) {

        System.out.printf("%s:%s:%s\n", displayTime(hours), displayTime(minutes), displayTime(seconds));
    }


    public String displayTime(int timeUnit) {

        return timeUnit < 10  ? "0" + timeUnit  : "" + timeUnit;

    }

}
