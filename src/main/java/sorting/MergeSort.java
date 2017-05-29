package sorting;// Unpublished Work (c) 2017 Deere & Company

// Java program for implementation of QuickSort
class MergeSort
{
    public static void main(String str[]) {
        int[] arr = new int[]{10, 7, 8, 9, 1, 5};
        MergeSort obj = new MergeSort();
        int left = 0;
        int right = arr.length - 1;
        int[] sortedArray = obj.mergeSort(arr, left, right);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    private int[] mergeSort(int[] arr, int left, int right) {
        if(left < right){
            int mid= (left+right)/2;
            mergeSort(arr, left,mid);
            mergeSort(arr,mid+1, right);
            merge(arr,left,mid, right);
        }

        return arr;
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1= mid-left+1;
        int n2 = right -mid;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for(int i=0;i <n1;i++){
            L[i] = arr[left+i];
        }
        for (int j=0;j<n2;j++){
            R[j] = arr[mid+1+j];
        }

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] =L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}

