public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {4, 45, -12, 17, -35, 84};

        sortArray(arr);

        for(int x: arr){
            System.out.print(x+" ");
        }

    }

    static void sortArray(int[] arr){

        int lastSortedIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int tempIndex = i;
            for(int j = lastSortedIndex; j >= 0; j--){

                if(temp < arr[j]){
                    arr[tempIndex] = arr[j];
                    tempIndex--;
                }
                arr[tempIndex] = temp;

            }
            lastSortedIndex++;
        }

    }

}
