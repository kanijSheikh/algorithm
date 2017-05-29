// Unpublished Work (c) 2017 Deere & Company
package sorting;

public class BubbleSort {

    public static void main(String str[]){
        int[] arr = new int[]{5,1,6,2,4,3};
        BubbleSort obj = new BubbleSort();
        int[] sortedArray = obj.bubbleSort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    private int[] bubbleSort(int[] unsortedArray) {
        int length = unsortedArray.length;
        for (int i = 0; i < length-1; i++) {
            for(int j = 0; j < length-i-1; j++) {
                if(unsortedArray[j] > unsortedArray[j+1]) {
                    swap(unsortedArray, j , j+1);
                }
            }
        }
        return unsortedArray;
    }

    // An optimized version of Bubble Sort
    private int[] bubbleSortOptimized(int unsortedArray[]) {
        int i, j;
        int length = unsortedArray.length;
        boolean swapped;
        for (i = 0; i < length-1; i++) {
            swapped = false;
            for (j = 0; j < length-i-1; j++) {
                if (unsortedArray[j] > unsortedArray[j+1]) {
                    swap(unsortedArray, j , j+1);
                    swapped = true;
                }
            }
            // IF no two elements were swapped by inner loop, then break            if (swapped == false)
            break;
        }
        return unsortedArray;
    }

    private void swap(int[] array, int i1, int i2) {
        int temp;
        temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
    }


}
