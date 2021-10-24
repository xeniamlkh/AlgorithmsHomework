public class AlHomeWorkTwo {
    public static void main(String[] args) {

        // creating the first array
        int[] firstRandomArray = new int[100000];
        for (int i = 0; i < firstRandomArray.length; i++) {
            firstRandomArray[i] = (int) (Math.random() * 1001);
        }

        // calling the bubbleSortMethod + timing
        long startTimeOne = System.nanoTime();
        bubbleSortMethod(firstRandomArray);
        long endTimeOne = System.nanoTime();
        long durationOne = endTimeOne - startTimeOne;
        double secondsOne = (double) durationOne / 1_000_000_000.0;
        System.out.printf("The bubble sorting algorithm takes %f seconds %n", secondsOne);

        // creating the second array
        int[] secondRandomArray = new int[100000];
        for (int i = 0; i < secondRandomArray.length; i++) {
            secondRandomArray[i] = (int) (Math.random() * 1001);
        }

        // calling the selectionSortMethod + timing
        long startTimeTwo = System.nanoTime();
        selectionSortMethod(secondRandomArray);
        long endTimeTwo = System.nanoTime();
        long durationTwo = endTimeTwo - startTimeTwo;
        double secondsTwo = (double) durationTwo / 1_000_000_000.0;
        System.out.printf("The selection sorting algorithm takes %f seconds %n", secondsTwo);

        // creating the second array
        int[] thirdRandomArray = new int[100000];
        for (int i = 0; i < thirdRandomArray.length; i++) {
            thirdRandomArray[i] = (int) (Math.random() * 1001);
        }

        // calling the insertionSortMethod
        long startTimeThree = System.nanoTime();
        insertionSortMethod(thirdRandomArray);
        long endTimeThree = System.nanoTime();
        long durationThree = endTimeThree - startTimeThree;
        double secondsThree = (double) durationThree / 1_000_000_000.0;
        System.out.printf("The insertion sorting algorithm takes %f seconds %n", secondsThree);
    }

    // Bubble Sort
    public static int[] bubbleSortMethod(int[] firstRandomArray) {
        int temp = 0;
        boolean fixed = false;

        while (fixed == false) {
            fixed = true;

            for (int i = 0; i < firstRandomArray.length - 1; i++) {
                if (firstRandomArray[i] > firstRandomArray[i + 1]) {
                    temp = firstRandomArray[i];
                    firstRandomArray[i] = firstRandomArray[i + 1];
                    firstRandomArray[i + 1] = temp;
                    fixed = false;
                }
            }
        }
        return firstRandomArray;
    }

    // Selection Sort
    public static int[] selectionSortMethod(int[] secondRandomArray) {
        int i, j, minValue, minIndex, temp = 0;

        for (i = 0; i < secondRandomArray.length; i++) {
            minValue = secondRandomArray[i];
            minIndex = i;
            for (j = i; j < secondRandomArray.length; j++) {
                if (secondRandomArray[j] < minValue) {
                    minValue = secondRandomArray[j];
                    minIndex = j;
                }
            }
            if (minValue < secondRandomArray[i]) {
                temp = secondRandomArray[i];
                secondRandomArray[i] = secondRandomArray[minIndex];
                secondRandomArray[minIndex] = temp;
            }
        }
        return secondRandomArray;
    }

    // Insertion Sort
    public static int[] insertionSortMethod(int[] thirdRandomArray) {
        int i, j, key, temp;
        for (i = 0; i < thirdRandomArray.length; i++) {
            key = thirdRandomArray[i];
            j = i - 1;
            while (j >= 0 && key < thirdRandomArray[j]) {
                temp = thirdRandomArray[j];
                thirdRandomArray[j] = thirdRandomArray[j + 1];
                thirdRandomArray[j + 1] = temp;
                j--;
            }
        }
        return thirdRandomArray;
    }

}
