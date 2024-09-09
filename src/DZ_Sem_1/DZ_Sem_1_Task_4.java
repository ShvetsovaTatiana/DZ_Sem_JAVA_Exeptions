package DZ_Sem_1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных
//массива и возвращающий новый массив, каждый элемент которого равен
//частному элементов двух входящих массивов в той же ячейке. Если длины
//массивов не равны, необходимо как-то оповестить пользователя.
//Важно: При выполнении метода единственное исключение, которое
//пользователь может увидеть - RuntimeException, т.е. ваше

import java.util.Arrays;

public class DZ_Sem_1_Task_4 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {2,2,2,2};
        try {
            int[] res = quotientElementArrays(arr1, arr2);
            System.out.println(Arrays.toString(res));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] quotientElementArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы имеют разную длину!");
        }
        int[] arrRes = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if(arr2[i] == 0) {
                throw new RuntimeException("Деление на 0 невозможно!");
            } else {
                arrRes[i] = arr1[i] / arr2[i];
            }
        }
        return arrRes;
    }
}
