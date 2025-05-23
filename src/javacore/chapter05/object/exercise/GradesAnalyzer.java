package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class GradesAnalyzer {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        // 1

        int numberOfGradesToRecord = 0;
        boolean isInputValid = false;

        while (!isInputValid) {

            System.out.print("\nCombien de notes souhaitez-vous enregister : ");
            numberOfGradesToRecord = scanner.nextInt();
            scanner.nextLine();

            if (numberOfGradesToRecord < 2) {
                System.out.println("Vous devez enregistrer un minimum de 2 notes.");

            } else if (numberOfGradesToRecord > 30) {
                System.out.println("Vous ne pouvez pas enregistrer plus de 30 notes.");

            } else {
                isInputValid = true;
            }

        }

        double[] gradesArray = new double[numberOfGradesToRecord];


        // 2

        for (int i = 0 ; i < gradesArray.length ; i++) {

            double currentGrade = 0;
            isInputValid = false;

            while (!isInputValid) {

                System.out.print("Veuillez saisir votre note à l'épreuve n°" + (i+1) + " : ");
                currentGrade = scanner.nextDouble();
                scanner.nextLine();

                if (currentGrade < 0 || currentGrade > 20) {
                    System.out.println("Une note doit-être comprise entre 0 et 20.");
                }
                else {
                    isInputValid = true;
                }

            }

            gradesArray[i] = currentGrade;

        }


        // 7

        getGradeCountBetweenStandardsRanges(gradesArray);


        // 8

        masterGradesAnalyzer();

    }


    // 3

    public static double getAverage(double[] gradesArray) {

        double gradesSum = 0;

        for (double grade : gradesArray) {

            gradesSum += grade;

        }

        double average = gradesSum / gradesArray.length;

        System.out.println("\nMoyenne Générale : " + average + "/20");

        return average;

    }


    // 4

    public static double getMinGrade(double[] gradesArray) {

        double minGrade = 20;

        for (double grade : gradesArray) {

            if (grade < minGrade) {
                minGrade = grade;
            }

        }

        System.out.println("\nNote Minimale : " + minGrade + "/20");

        return minGrade;

    }


    // 5

    public static double getMaxGrade(double[] gradesArray) {

        double maxGrade = 0;

        for (double grade : gradesArray) {

            if (grade > maxGrade) {
                maxGrade = grade;
            }

        }

        System.out.println("\nNote Maximale : " + maxGrade + "/20");

        return maxGrade;

    }

    // factorisation de maxGrade et minGrade

    public static double[] getMinAndMaxGrade(double[] gradesArray) {

        double minGrade = gradesArray[0];
        double maxGrade = gradesArray[0];

        for (int i = 1; i < gradesArray.length; i++) {
            double currentGrade = gradesArray[i];

            if (currentGrade < minGrade) {
                minGrade = currentGrade;
            }

            if (currentGrade > maxGrade) {
                maxGrade = currentGrade;
            }
        }

        System.out.println("\nNote Minimale : " + minGrade + "/20");
        System.out.println("Note Maximale : " + maxGrade + "/20");

        return new double[]{minGrade, maxGrade};

    }





    // 6

    public static int getGradeCountAboveThreshold(double[] gradesArray, double threshold) {

        int gradesCountAboveThreshold = 0;

        for (double grade : gradesArray) {

            if (grade > threshold) {
                gradesCountAboveThreshold++;
            }

        }

        double gradeAbovePercentage = ((double) gradesCountAboveThreshold / gradesArray.length) * 100;

        System.out.println("Nombre de notes >" + threshold + " = " + gradesCountAboveThreshold
                            + " (soit " + gradeAbovePercentage + "%)");

        return gradesCountAboveThreshold;

    }


    // 7

    public static int getGradeCountBetweenRange(double[] gradesArray, int from, int to) {

        int gradesCountBetweenRange = 0;

        for (double grade : gradesArray) {

            if (grade >= from && grade <= to) {
                gradesCountBetweenRange++;
            }

        }

        double gradeBetweenRangePercentage = ((double) gradesCountBetweenRange / gradesArray.length) * 100;

        System.out.println("Nombre de notes [" + from + " -  " + to + "] = " + gradesCountBetweenRange
                            + " (soit " + gradeBetweenRangePercentage + "%)");

        return gradesCountBetweenRange;

    }


    public static void getGradeCountBetweenStandardsRanges(double[] gradesArray) {

        int from = 1;

        while (from < 20) {

            int to = from + 4;
            getGradeCountBetweenRange(gradesArray, from, to);
            from += 5;

        }

    }



    // 8 : en cours....

    public static void masterGradesAnalyzer() {

        Scanner scanner = new Scanner(System.in);

        double[] currentGradeArray = new double[0];
        double[] lastGradeArray;

        for (int newGradeIndex = 0 ; newGradeIndex <= 200 ; newGradeIndex++) {

            System.out.print("Entrez votre note n°" + (newGradeIndex+1) + " ou taper 'done' pour terminer : ");
            String userInput = scanner.nextLine().trim();

            if (userInput.equalsIgnoreCase("done")) {
                break;
            }
            else if (userInput.isEmpty()) {
                continue;
            }

            try {
                double currentGrade = Double.parseDouble(userInput);

                if (currentGrade < 0 || currentGrade > 20) {
                    System.out.println("Une note doit-être comprise entre 0 et 20.");
                }
                else {

                    lastGradeArray = currentGradeArray;
                    currentGradeArray = new double[newGradeIndex + 1];

                    for (int previousGradeIndex = 0 ; previousGradeIndex < lastGradeArray.length ; previousGradeIndex++) {
                        currentGradeArray[previousGradeIndex] = lastGradeArray[previousGradeIndex];
                    }

                    currentGradeArray[newGradeIndex] = currentGrade;

                }

            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.\n");
            }

        }

        scanner.close();
        System.out.println(currentGradeArray[0]);
        displayStatistics(currentGradeArray);

    }


    public static void displayStatistics(double[] gradesArray) {

        getAverage(gradesArray);
        getMinAndMaxGrade(gradesArray);
        getGradeCountAboveThreshold(gradesArray, 10);
        getGradeCountBetweenStandardsRanges(gradesArray);

    }

}
