package javacore.chapter05.object.exercise;

public class ReferenceManipulation {

    // 1
    String name;
    int counter;

    // 2
    public ReferenceManipulation(String name) {

        this.name = name;
        this.counter = 0;

    }

    // 3
    public static void main(String[] args) {

        ReferenceManipulation reference1 = new ReferenceManipulation("reference1");

        // 5
        reference1.displayReferenceName();

        // 6
        ReferenceManipulation copy1 = reference1;

        // 7
        copy1.displayReferenceName();

        // 9
        updateCounter(reference1);

        // 10
        reference1.displayReferenceName();

        // 11
        copy1.displayReferenceName();

        // 12
        updateCounter(copy1);

        // 13
        reference1.displayReferenceName();
        copy1.displayReferenceName();

        // 14
        copy1 = new ReferenceManipulation("reference2");

        // 15
        copy1.displayReferenceName();

        // 16
        reference1 = new ReferenceManipulation("reference1");

        // 17
        reference1.displayReferenceName();

    }

    // 4
    public void displayReferenceName() {
        System.out.println("Reference name : " + name + " (counter : " + counter + ")");
    }

    // 8
    public static void updateCounter(ReferenceManipulation object) {
        object.counter++;
    }

}
