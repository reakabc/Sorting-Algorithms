public class ShellSort {

    public static void main(String[] args) {

        int[] arr = {34, 5, -20, 48, 12, 17, -22};

        sortArray(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    static void sortArray(int[] arr) {

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int j = arr.length - 1; j >= gap; j--) {

                int x = j;
                int temp = arr[j];
                while (x - gap >= 0 && temp < arr[x - gap]) {

                    arr[x] = arr[x - gap];
                    x -= gap;

                }
                arr[x] = temp;

            }

        }

    }

}
