package javacore.chapter04.function.project.refactor;

public class FunctionRefactorBasicStopwatch {

    public static void main(String[] args) throws InterruptedException {

        runStopwatchUntil(62);

    }

    public static void runStopwatchUntil(int finalTime) throws InterruptedException  {

        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        int elapsed = 0;

        while ( elapsed < finalTime ) {

            displayWatchTime(hours, minutes, seconds);

            seconds++;
            elapsed++;

            Thread.sleep(1000);

            if ( seconds >= 60 ) {
                minutes++;
                seconds = 0;

                if ( minutes >= 60 ) {
                    hours++;
                    minutes = 0;
                }

            }

        }

    }

    public static void displayWatchTime(int hours, int minutes, int seconds) {

        System.out.print(displayTime(hours) + ":");
        System.out.print(displayTime(minutes) + ":");
        System.out.print(displayTime(seconds) + "\n");

    }

    public static String displayTime(int timeUnit) {

        return timeUnit < 10  ? "0" + timeUnit  : "" + timeUnit;

    }

}