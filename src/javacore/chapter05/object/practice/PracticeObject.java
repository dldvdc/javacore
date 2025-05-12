package javacore.chapter05.object.practice;

public class PracticeObject {

    public static void main(String[] args) {

        PracticeObjectCar car001 = new PracticeObjectCar(
                "54GV645X",
                "Ford",
                "870",
                "blue",
                76000);

        car001.run(1500);
        car001.run(1500);

        car001.displayInformation();


        PracticeObjectCar car002 = new PracticeObjectCar(
                "25GS6478L",
                "Ferrari",
                "F458",
                "red",
                126000);

        car002.run(1000);
        car002.run(2500);

        car002.displayInformation();

    }

}
