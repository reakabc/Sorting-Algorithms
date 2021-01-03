public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {14, 5, -20, 8, -17, 45, 84};

        sortArray(arr);

        for(int x: arr){
            System.out.println(x+" ");
        }

    }

    static void sortArray(int[] arr){

        int lastUnsortedIndex = arr.length-1;

        for (int i = 0; i < arr.length; i++){

            int maxIndex = 0;

            for(int j = 1; j <= lastUnsortedIndex; j++){

                //To change order - Change comparison operator
                if(arr[maxIndex] > arr[j]){
                    maxIndex = j;
                }
                if(j == lastUnsortedIndex){
                    swap(arr, lastUnsortedIndex, maxIndex);
                    lastUnsortedIndex--;
                }
            }

        }

    }

    static void swap(int[] arr, int x, int y){

        if(x == y){
            return;
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
