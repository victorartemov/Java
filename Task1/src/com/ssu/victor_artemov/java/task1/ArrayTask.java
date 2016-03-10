package com.ssu.victor_artemov.java.task1;
//Артемов Виктор, задание 1 - сортировка массива
public class ArrayTask {

    public static void main(String[] args)
    {
        ArrayTask task = new ArrayTask();
        task.startApplication();
    }

    public void startApplication()
    {
        int[] myArray = {8, 14, 6, 17, 69, 86 ,-15, 1, 0, -5, 0};

        //printing unsorted array
        System.out.println("Before sorting: ");
        printArray(myArray);

        //sorting array
        sort(myArray);

        //after sorting
        System.out.println("After sorting: ");
        printArray(myArray);
    }

    public void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //heapsort, always gives O(n log n) runtime
    public void sort(int[] array)
    {
        int n = array.length;
        for (int k = n / 2; k > 0; k--) downHeap(array, k, n);
        do {
            int T = array[0];
            array[0] = array[n - 1];
            array[n - 1] = T;
            n = n - 1;
            downHeap(array, 1, n);
        } while (n > 1);
    }

    void downHeap(int a[], int k, int n)
    {
        int T = a[k - 1];
        while (k <= n / 2) {
            int j = k + k;
            if ((j < n) && (a[j - 1] < a[j])) j++;
            if (T >= a[j - 1]) {
                break;
            } else {
                a[k - 1] = a[j - 1];
                k = j;
            }
        }
        a[k - 1] = T;
    }
}
