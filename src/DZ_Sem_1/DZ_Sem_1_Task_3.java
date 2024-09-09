package DZ_Sem_1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных
//массива и возвращающий новый массив, каждый элемент которого равен
//разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить
//пользователя.


import java.util.Arrays;

public class DZ_Sem_1_Task_3 {
    public static void main(String[] args) {
        int[] arr1 = {8,9,10,11,12,13,14};
        int[] arr2 = {7,6,5,4,3,2,1};
        try {
            int[] res = differenceElementsArrays(arr1, arr2);
            System.out.println(Arrays.toString(res));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] differenceElementsArrays(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            throw new IllegalArgumentException("Массивы имеют разную длину!");
        }
        int[] arrRes = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrRes[i] = arr1[i] - arr2[i];
        }
        return arrRes;
    }
}
