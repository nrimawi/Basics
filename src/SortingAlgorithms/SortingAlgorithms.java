package SortingAlgorithms;

public class SortingAlgorithms {

    static void BubbleSort(int[] arr) {
        boolean swap;
        do {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    swap = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        while (swap == true);
    }

    static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minNumIndex = i;

            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minNumIndex])
                    minNumIndex = j;

            int temp = arr[minNumIndex];
            arr[minNumIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void InsertionSort(int[] arr) {
        // First Implementation

        // int prefixArray = 0;
        //for (int i = 1; i < arr.Length; i++)
        //{
        //    bool checkPosition = true;
        //    int comparingIndex=prefixArray;
        //    while (checkPosition == true &&comparingIndex>=0)
        //    {

        //        if (arr[comparingIndex] >  arr[comparingIndex+1])
        //        {
        //            //swip
        //            int temp = arr[comparingIndex];
        //            arr[comparingIndex] = arr[comparingIndex+1];
        //            arr[comparingIndex+1] = temp;
        //            comparingIndex--;
        //        }
        //        else
        //            checkPosition = false;

        //    }
        //    prefixArray++;

        //}

        for (int i = 1; i < arr.length; i++)
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                //swip
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }

    }

    static void MergeSort(int[] arr) {
        int[] aux = new int[arr.length];
        sort(arr, aux, 0, arr.length - 1);


    }

    static void sort(int[] array, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = (lo + hi) / 2;
        sort(array, aux, lo, mid);
        sort(array, aux, mid + 1, hi);
        merge(array, aux, lo, mid, hi);

    }

    static void merge(int[] array, int[] aux, int lo, int mid, int hi) {
        for (int w = lo; w <= hi; w++)
            aux[w] = array[w];

        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = aux[j];
                j++;
            } else if (j > hi) {
                array[k] = aux[i];
                i++;
            } else if (aux[i] > aux[j]) {
                array[k] = aux[j];
                j++;

            } else {
                array[k] = aux[i];
                i++;


            }
        }
    }

}




