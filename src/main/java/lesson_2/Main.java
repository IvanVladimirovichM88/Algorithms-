package lesson_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotebookArray notebookArray = new NotebookArray();
        Notebook[] arr = notebookArray.generate(10);

        System.out.println(Arrays.toString(arr));

        notebookArray.insetSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static Object[] bubleSort(Object[] array)
}
