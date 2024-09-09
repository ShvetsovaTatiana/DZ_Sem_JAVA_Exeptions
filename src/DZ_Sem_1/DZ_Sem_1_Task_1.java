package DZ_Sem_1;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class DZ_Sem_1_Task_1 {
    public static void main(String[] args) {
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Строка не создана, длина недоступна: " + e.getMessage());
        }

        try {
            generateArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Элемент с таким индексом не создан: " + e.getMessage());
        }

        try {
            generateNumberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Невозможно преобразовать строку в число: " + e.getMessage());
        }
    }

    public static void generateNullPointerException() {
        String str = null;
        System.out.println(str.length());
    }

    public static void generateArrayIndexOutOfBoundsException() {
        int[] array = {1, 2, 3};
        System.out.println(array[5]);
    }

    public static void generateNumberFormatException() {
        String invalidNumber = "abc";
        int num = Integer.parseInt(invalidNumber);
        System.out.println(num);
    }

}