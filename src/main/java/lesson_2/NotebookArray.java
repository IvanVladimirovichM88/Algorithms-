package lesson_2;

import java.util.Random;

public class NotebookArray {

    private  final Random RAND = new Random();
    private int startPrice = 500;
    private int endPrice = 2000;
    private int stepPrice = 50;
    private int startRam = 4;
    private int endRam = 24;
    private int stepRam =4;
    private  String[] arrayStrBrands = {"Lenuvo",  "Asos",  "MacNote",  "Eser",  "Xamiou"};

    public Notebook[] generate( int length){

        Notebook[] array = new Notebook[length];

        int amountDifferentPrice = (endPrice-startPrice)/stepPrice;
        int amountDifferentRam = (endRam-startRam)/stepRam;
        int amountDifferentBrand = arrayStrBrands.length;

        for (int i=0; i<length; i++){
            int price = startPrice + RAND.nextInt(amountDifferentPrice+1)*50;
            int ram = startRam + RAND.nextInt(amountDifferentRam+1)*4;
            Brands brand = Brands.valueOf(arrayStrBrands[RAND.nextInt(amountDifferentBrand)]);
            array[i] = new Notebook(price, ram, brand);
        }

        return array;
    }

    public static void swap(Notebook first, Notebook second) {
        Notebook temp = first;
        first = second;
        second = temp;
    }
    public void bubbleSort(Notebook[] array){

        boolean isChange = true;
        int step = 1;

        while (isChange){
            isChange = false;
            for(int i = 0; i<array.length-step; i++){
                if ( array[i].compareTo(array[i+1]) >0 ){
                    Notebook temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isChange = true;
                }
            }
        }
    }

    public void selectionSort(Notebook[] array){

        boolean isChange = false;

        for (int i = 0; i<array.length-1; i++){
            int min = i;
            for (int j = i+1; j<array.length; j++){
                if (array[min].compareTo(array[j]) > 0){
                    min = j;
                    isChange = true;
                }
            }
            if (isChange){
                Notebook temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    public void insetSort(Notebook[] array){
        for (int i=1; i<array.length; i++){
            Notebook value = array[i];
            int j = i-1;
            while(j>=0 &&  value.compareTo(array[j])<0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        }
    }

}
