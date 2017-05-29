package sorting;// Unpublished Work (c) 2017 Deere & Company

public class QuickSort {
    public static void main(String str[]) {
        int[] arr = new int[]{10, 7, 8, 9, 1, 5};
        QuickSort obj = new QuickSort();
        int start = 0;
        int end = arr.length - 1;
        int[] sortedArray = obj.quickSort(arr, start, end);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    private int[] quickSort(int[] unsortedArray, int start, int end) {
        if(start < end){
            int pIndex = partition(unsortedArray,start,end);
            quickSort(unsortedArray,start,pIndex-1);
            quickSort(unsortedArray,pIndex+1, end);
        }
        return unsortedArray;
    }

    private int partition(int[] unsortedArray, int start, int end) {
        int pivot = unsortedArray[end];
        int pIndex = start;
      for(int i=start;i < end; i++){
          if(unsortedArray[i] <= pivot){
              int temp = unsortedArray[pIndex];
              unsortedArray[pIndex] = unsortedArray[i];
              unsortedArray[i]= temp;
              pIndex++;
          }
      }
        int temp = unsortedArray[pIndex];
        unsortedArray[pIndex] = unsortedArray[end];
        unsortedArray[end]= temp;
        return pIndex;
    }


}
