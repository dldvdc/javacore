package javacore.chapter05.object.exercise;

public class BubbleSorting {

    public static void main(String[] args) {

        int[] numbers = {30, 25, 85, 6, 43, 58, 97, 78, 94, 27, 9, 38, 41, 35, 52, 10, 16, 22, 96, 74, 44, 55, 82, 28, 83, 69, 90, 89, 26, 7, 47, 98, 50, 42, 68, 91, 70, 65, 79, 4, 75, 49, 61, 39, 48, 72, 36, 18, 1, 15, 77, 99, 33, 24, 13, 19, 73, 17, 14, 86, 54, 45, 76, 21, 100, 63, 60, 56, 93, 87, 81, 8, 29, 34, 53, 37, 71, 67, 57, 66, 11, 46, 95, 20, 88, 64, 59, 84, 12, 92, 80, 40, 23, 3, 2, 32, 31, 5, 62, 51};

        // Tri par sélection
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

    // 1
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


    // 2
    public static int[] bubbleSort(int[] numbers) {

        int arrayLength = numbers.length;
        boolean swapped;

        for (int i = 0; i < arrayLength - 1; i++) {

            swapped = false;

            for (int j = 0; j < arrayLength - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return numbers;

    }


    // 3
    // Tri par insertion
    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {

                array[j + 1] = array[j];
                j--;

            }

            array[j + 1] = key;

        }
    }


    // Tri rapide (Quick Sort)
    public static void quickSort(int[] array, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);

        }
    }

    private static int partition(int[] array, int low, int high) {

        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {

            if (array[j] < pivot) {
                i++;
                int temp = array[i]; array[i] = array[j]; array[j] = temp;
            }

        }

        int temp = array[i + 1]; array[i + 1] = array[high]; array[high] = temp;
        return i + 1;

    }


    // Tri fusion (merge sort)
    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int l = 0, r = 0, i = 0;

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                result[i++] = left[l++];
            } else {
                result[i++] = right[r++];
            }
        }

        while (l < left.length) {
            result[i++] = left[l++];
        }

        while (r < right.length) {
            result[i++] = right[r++];
        }

        return result;
    }


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
