package sorting;// Unpublished Work (c) 2017 Deere & Company

public class SelectionSort {
    public static void main(String str[]){
        int[] arr = new int[]{5,1,6,2,4,3,15,10};
        SelectionSort obj = new SelectionSort();
        int[] sortedArray = obj.selectionSort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    private int[] selectionSort(int[] unsortedArray){
       int i,j, min,temp=0;
        for(i=0; i< unsortedArray.length;i++){
            min=i;
            for (j=i+1;j<unsortedArray.length; j++){
                if(unsortedArray[j] < unsortedArray[min]){
                    min=j;
                }
            }
            if(min!=i){
                temp = unsortedArray[min];
                unsortedArray[min] = unsortedArray[i];
                unsortedArray[i] = temp;
            }

        }
        return unsortedArray;
    }
}
