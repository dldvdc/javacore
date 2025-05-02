package javacore.chapter03.loop.exercise;

public class BasicStopwatch {

    public static void main(String[] args) throws InterruptedException {


        int hours = 0;
        int minutes = 0;

        int finalTime = 600;

        for ( int seconds = 0 ; seconds < finalTime ; seconds++ ) {

            Thread.sleep(1000);

            if ( seconds >= 60 ) {
                minutes++;
                seconds = 0;

                if ( minutes >= 60 ) {
                    hours++;
                    minutes = 0;
                }

            }

            String displayHours = hours < 10  ? "0" + hours  : "" + hours;
            System.out.print(displayHours + ":");

            String displayMinutes = minutes < 10  ? "0" + minutes  : "" + minutes;
            System.out.print(displayMinutes + ":");

            String displaySeconds = seconds < 10  ? "0" + seconds  : "" + seconds;
            System.out.println(displaySeconds);

        }

    }

}