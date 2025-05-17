package javacore.chapter05.object.exercise;

public class BasicStopwatchV2 {

    String name;

    int targetSeconds;
    int targetMinutes;
    int targetHours;

    int targetDurationInSeconds;


    public BasicStopwatchV2(String name, int targetSeconds, int targetMinutes, int targetHours) {

        this.name = name;
        this.targetSeconds = targetSeconds;
        this.targetMinutes = targetMinutes;
        this.targetHours = targetHours;
        this.targetDurationInSeconds = targetSeconds + targetMinutes * 60 + targetHours * 3600;

    }

    public void startWatch() throws InterruptedException {

        int currentSeconds = 0;
        int currentMinutes = 0;
        int currentHours   = 0;

        int elapsedSeconds = 0;
        displayWatchTime(currentHours, currentMinutes, currentSeconds);

        do {

            Thread.sleep(1000);

            elapsedSeconds++;
            currentSeconds++;

            if ( currentSeconds >= 60 ) {
                currentMinutes++;
                currentSeconds = 0;

                if ( currentMinutes >= 60 ) {
                    currentHours++;
                    currentMinutes = 0;
                }

            }

            displayWatchTime(currentHours, currentMinutes, currentSeconds);

        } while (elapsedSeconds < targetDurationInSeconds);

    }

    public void displayWatchTime(int hours, int minutes, int seconds) {
        System.out.printf(this.name + " : %s:%s:%s\n", displayTime(hours), displayTime(minutes), displayTime(seconds));
    }


    public String displayTime(int timeUnit) {
        return timeUnit < 10 ? "0" + timeUnit  : "" + timeUnit;
    }


    //  Test
    public static void main(String[] args) throws InterruptedException {

        BasicStopwatchV2 eggTimer = new BasicStopwatchV2(
                "Oeufs Durs",
                35,
                5,
                0);

        eggTimer.startWatch();

    }

}
