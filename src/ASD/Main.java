package ASD;

import java.util.Arrays;

public class Main {
    /*Урок 3. Поиск в массиве. Простые сортировки
    2. *Реализовать шейкерную сортировку.*/

    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1,0};
        Shaker(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Shaker (int[] a){
        int count = 0;
        int temp;
        int temp2;
        for (int i = 0; i < a.length/2; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    count++;
                }
            }
            for (int k = a.length-2; k > 0 ; k--) {
                if (a[k] < a[k-1]){
                    temp2 = a[k-1];
                    a[k-1] = a[k];
                    a[k] = temp2;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
