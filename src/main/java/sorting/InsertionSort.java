package sorting;// Unpublished Work (c) 2017 Deere & Company

public class InsertionSort {

    public static void main(String str[]){
        int[] arr = new int[]{5,1,6,2,4,3,15,10};
        InsertionSort obj = new InsertionSort();
        int[] sortedArray = obj.insertionSort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

   private int[] insertionSort(int[] unsortedArray){
       int i,j,key =0;
       for(i=1;i <unsortedArray.length; i++){
           key= unsortedArray[i];
           j= i-1;
           while(j>=0 && unsortedArray[j] > key){
               unsortedArray[j+1] = unsortedArray[j];
               j--;
           }
           unsortedArray[j+1] = key;

       }
      return unsortedArray;
   }
}
