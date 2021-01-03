public class BubbleShort {

    public static void main(String[] args) {

        int[] arr = {4,8,12,45,-22,56};

        sortArray(arr);

        for(int x: arr){
            System.out.println(x+" ");
        }

    }

    static void sortArray(int[] arr){

        int lastUnsortedIndex = arr.length-1;
        for(int i = 0; i < arr.length; i++){

            for (int j = 0; j < lastUnsortedIndex; j++){

                //To reverse the order - Change comparison operator
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }

            }

        }

    }

    static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
