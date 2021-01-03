public class CountingSort {

    public static void main(String[] args) {

        int[] arr = {4,5,1,5,4,8,6,9,7,3,10};

        sortArray(arr);

        for(int x: arr){
            System.out.print(x+" ");
        }


    }

    private static void sortArray(int[] arr) {

        int max = 0;
        int min = 1000000;

        for(int x : arr){
            max = Math.max(max, x);
        }

        for(int x : arr){
            min = Math.min(min, x);
        }

        int[] countingArray = new int[(max-min)+1];

        for(int i = 0; i < arr.length; i++){

            //minus min value from original value to start with min value at zero index in counting array
            countingArray[arr[i]-min]++;

        }

        int indexProgress = 0;
        //here we are traversing all different value in range of min to max
        for(int i = min; i <= max; i++){

            //here we are finding the count of current particular value and inserting them back to array in ascending order..
            while(countingArray[i-min] > 0){
                arr[indexProgress++] = i;
                countingArray[i-min]--;
            }

        }

    }
}
