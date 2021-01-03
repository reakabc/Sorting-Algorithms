public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {12, -22, 45, 15, -20, 50, 25};

        arr = sortArray(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    private static int[] sortArray(int[] arr) {

        int start = 0;
        int end = arr.length;
        int middle = (start + end) / 2;

        if (arr.length == 1) {
            return arr;
        }

        int[] left = new int[middle];

        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }

        int[] right = new int[end - middle];

        for (int j = middle; j < end; j++) {
            right[j - middle] = arr[j];
        }

        left = sortArray(left);
        right = sortArray(right);

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {

        int[] arr = new int[left.length + right.length];

            int x = 0;
            int y = 0;
            int i = 0;

            while(x < left.length || y < right.length){

                if (x < left.length && y < right.length){

                    if (left[x] <= right[y]) {

                        arr[i++] = left[x++];

                    } else {

                        arr[i++] = right[y++];

                    }

                }else if(x < left.length){
                    arr[i++] = left[x++];
                }else if(y<right.length){
                    arr[i++] = right[y++];
                }

            }

        return arr;

    }

}
