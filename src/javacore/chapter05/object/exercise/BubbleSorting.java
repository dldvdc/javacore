package javacore.chapter05.object.exercise;

public class BubbleSorting {

    public static void main(String[] args) {

        int[] numbers = {30, 25, 85, 6, 43, 58, 97, 78, 94, 27, 9, 38, 41, 35, 52, 10, 16, 22, 96, 74, 44, 55, 82, 28, 83, 69, 90, 89, 26, 7, 47, 98, 50, 42, 68, 91, 70, 65, 79, 4, 75, 49, 61, 39, 48, 72, 36, 18, 1, 15, 77, 99, 33, 24, 13, 19, 73, 17, 14, 86, 54, 45, 76, 21, 100, 63, 60, 56, 93, 87, 81, 8, 29, 34, 53, 37, 71, 67, 57, 66, 11, 46, 95, 20, 88, 64, 59, 84, 12, 92, 80, 40, 23, 3, 2, 32, 31, 5, 62, 51};

        // 1 - Tri par sélection ?
        int[] selectionInput = numbers.clone();

        long startSelection = System.nanoTime();
        int[] sortedBySelection = sort(selectionInput);
        long endSelection = System.nanoTime();

        System.out.println("\nTri par sélection :");
        displayArray(sortedBySelection);
        System.out.println("\nDurée : " + (endSelection - startSelection) / 1_000_000.0 + " ms\n");

        // Tri à bulles
        int[] bubbleInput = numbers.clone();

        long startBubble = System.nanoTime();
        int[] sortedByBubble = bubbleSort(bubbleInput);
        long endBubble = System.nanoTime();

        System.out.println("Tri à bulles (Bubble Sort) :");
        displayArray(sortedByBubble);
        System.out.println("\nDurée : " + (endBubble - startBubble) / 1_000_000.0 + " ms\n");

        // Tri par insertion
        int[] insertionInput = numbers.clone();
        long startInsertion = System.nanoTime();
        insertionSort(insertionInput);
        long endInsertion = System.nanoTime();
        System.out.println("Tri par insertion (Insertion Sort) :");
        displayArray(insertionInput);
        System.out.println("\nDurée : " + (endInsertion - startInsertion) / 1_000_000.0 + " ms\n");

        // Tri rapide (quick sort)
        int[] quickInput = numbers.clone();
        long startQuick = System.nanoTime();
        quickSort(quickInput, 0, quickInput.length - 1);
        long endQuick = System.nanoTime();
        System.out.println("Tri rapide (Quick Sort) :");
        displayArray(quickInput);
        System.out.println("\nDurée : " + (endQuick - startQuick) / 1_000_000.0 + " ms\n");

        // Tri fusion
        int[] mergeInput = numbers.clone();
        long startMerge = System.nanoTime();
        int[] sortedByMerge = mergeSort(mergeInput);
        long endMerge = System.nanoTime();
        System.out.println("Tri fusion (Merge Sort) :");
        displayArray(sortedByMerge);
        System.out.println("\nDurée : " + (endMerge - startMerge) / 1_000_000.0 + " ms");

    }

    // ###################################################################################################### //

    // 1 - Exercice (Tri par sélection ?)
    public static int[] sort(int[] numbers) {

        for (int currentNumberIndex = 0; currentNumberIndex < numbers.length ; currentNumberIndex++) {

            int minNumberIndex = currentNumberIndex;

            for (int nextNumberIndex = currentNumberIndex + 1; nextNumberIndex < numbers.length ; nextNumberIndex++) {

                if (numbers[nextNumberIndex] < numbers[minNumberIndex]) {
                    minNumberIndex = nextNumberIndex;
                }
            }

            int currentNumber = numbers[currentNumberIndex];
            numbers[currentNumberIndex] = numbers[minNumberIndex];
            numbers[minNumberIndex] = currentNumber;

        }

        return numbers;

    }

    // ###################################################################################################### //

    // 2 - Bubble Sort
    public static int[] bubbleSort(int[] unsortedArray) {

        int numberOfElements = unsortedArray.length;
        boolean hasSwapped;

        // Parcours de tous les éléments (sauf le dernier déjà trié à chaque tour)
        for (int pass = 0; pass < numberOfElements - 1; pass++) {

            hasSwapped = false; // Permet de sortir plus tôt si tout est déjà trié

            // Comparer chaque paire d'éléments adjacents
            for (int index = 0; index < numberOfElements - 1 - pass; index++) {

                if (unsortedArray[index] > unsortedArray[index + 1]) {
                    // Échange si les éléments sont dans le mauvais ordre
                    int temporary = unsortedArray[index];
                    unsortedArray[index] = unsortedArray[index + 1];
                    unsortedArray[index + 1] = temporary;

                    hasSwapped = true;
                }
            }

            // Optimisation : arrêt si aucun échange n’a été fait
            if (!hasSwapped) {
                break;
            }
        }

        return unsortedArray;
    }

    // ###################################################################################################### //

    // 3 - Tri par insertion
    public static int[] insertionSort(int[] unsortedArray) {

        // On commence à partir du deuxième élément
        for (int currentIndex = 1; currentIndex < unsortedArray.length; currentIndex++) {

            int valueToInsert = unsortedArray[currentIndex]; // Valeur à insérer
            int previousIndex = currentIndex - 1;

            // Décaler vers la droite tous les éléments plus grands que la valeur à insérer
            while (previousIndex >= 0 && unsortedArray[previousIndex] > valueToInsert) {
                unsortedArray[previousIndex + 1] = unsortedArray[previousIndex];
                previousIndex--;
            }

            // Insérer la valeur à sa place triée
            unsortedArray[previousIndex + 1] = valueToInsert;
        }

        return unsortedArray;
    }

    // ###################################################################################################### //

    // Tri rapide (Quick Sort)
    public static int[] quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pivotIndex = partition(array, lowIndex, highIndex);
            quickSort(array, lowIndex, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, highIndex);
        }
        return array;
    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        int pivotValue = array[highIndex]; // Choix du pivot (ici, dernier élément)
        int smallerElementIndex = lowIndex - 1;

        for (int currentIndex = lowIndex; currentIndex < highIndex; currentIndex++) {
            // Si l'élément courant est plus petit ou égal au pivot, on l'échange
            if (array[currentIndex] <= pivotValue) {
                smallerElementIndex++;
                // Échange array[smallerElementIndex] et array[currentIndex]
                int temp = array[smallerElementIndex];
                array[smallerElementIndex] = array[currentIndex];
                array[currentIndex] = temp;
            }
        }

        // Placer le pivot à la bonne position (juste après les plus petits)
        int temp = array[smallerElementIndex + 1];
        array[smallerElementIndex + 1] = array[highIndex];
        array[highIndex] = temp;

        return smallerElementIndex + 1; // Retourne la position finale du pivot
    }

    // ###################################################################################################### //

    // Tri fusion (merge sort)
    public static int[] mergeSort(int[] arrayToSort) {
        // Cas de base : un tableau de taille 0 ou 1 est déjà trié
        if (arrayToSort.length <= 1) {
            return arrayToSort;
        }

        int middleIndex = arrayToSort.length / 2;

        // Diviser le tableau en deux sous-tableaux
        int[] leftSubArray = new int[middleIndex];
        int[] rightSubArray = new int[arrayToSort.length - middleIndex];

        System.arraycopy(arrayToSort, 0, leftSubArray, 0, middleIndex);
        System.arraycopy(arrayToSort, middleIndex, rightSubArray, 0, arrayToSort.length - middleIndex);

        // Tri récursif des deux sous-tableaux
        leftSubArray = mergeSort(leftSubArray);
        rightSubArray = mergeSort(rightSubArray);

        // Fusionner les deux sous-tableaux triés
        return merge(leftSubArray, rightSubArray);
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {
        int[] mergedArray = new int[leftArray.length + rightArray.length];
        int leftIndex = 0, rightIndex = 0, mergeIndex = 0;

        // Fusionner les éléments dans l'ordre croissant
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                mergedArray[mergeIndex++] = leftArray[leftIndex++];
            } else {
                mergedArray[mergeIndex++] = rightArray[rightIndex++];
            }
        }

        // Copier les éléments restants de leftArray s'il y en a
        while (leftIndex < leftArray.length) {
            mergedArray[mergeIndex++] = leftArray[leftIndex++];
        }

        // Copier les éléments restants de rightArray s'il y en a
        while (rightIndex < rightArray.length) {
            mergedArray[mergeIndex++] = rightArray[rightIndex++];
        }

        return mergedArray;
    }

    // ###################################################################################################### //


    public static void testSortMethod(String name, int[] array) {

        int[] arrayInput = array.clone();
        long startTime = System.nanoTime();
        int[] sortedArray = mergeSort(arrayInput); // Comment passer une méthode en paramètre ?
        long endTime = System.nanoTime();
        System.out.println(name + " :");
        displayArray(sortedArray);
        System.out.println("\nDurée : " + (endTime - startTime) / 1_000_000.0 + " ms");

    }


    public static void displayArray (int[] array) {

        for (int j : array) {
            System.out.print(j + ", ");
        }

    }

}
