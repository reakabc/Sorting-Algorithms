public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {4, 45, -12, 17, -35, 84};

        sortArray(arr, 0, arr.length);

        for(int x: arr){
            System.out.print(x+" ");
        }

    }

    private static void sortArray(int[] arr, int start, int end) {

        if (end - start < 2){
            return;
        }

        int pivotIndex = partition(arr, start, end);

        sortArray(arr, start, pivotIndex);
        sortArray(arr, pivotIndex+1, end);

    }

    private static int partition(int[] arr, int start, int end) {

        int i = start;
        int j = end;
        int pivot = arr[start];

        while(i<j){

            while(i<j && arr[--j] > pivot);
            if(i < j){
                arr[i] = arr[j];
            }

            while (i<j && arr[++i] < pivot);
            if(i < j){
                arr[j] = arr[i];
            }

        }

        arr[j] = pivot;
        return j;
    }


}
