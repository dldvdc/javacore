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

            Thread.sleep(1000);

            seconds++;
            elapsed++;

            if ( seconds >= 60 ) {
                minutes++;
                seconds = 0;
            }

            if ( minutes >= 60 ) {
                hours++;
                minutes = 0;
            }

        }

    }

    public static void displayWatchTime(int hours, int minutes, int seconds) {

        String displayHours = hours < 10  ? "0" + hours  : "" + hours;
        System.out.print(displayHours + ":");

        String displayMinutes = minutes < 10  ? "0" + minutes  : "" + minutes;
        System.out.print(displayMinutes + ":");

        String displaySeconds = seconds < 10  ? "0" + seconds  : "" + seconds;
        System.out.println(displaySeconds);

    }

}