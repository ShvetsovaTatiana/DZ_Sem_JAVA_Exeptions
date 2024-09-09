package DZ_Sem_1;

//Посмотрите на код и подумайте сколько разных типов исключений вы тут
//сможете получить?


public class DZ_Sem_1_Task_2 {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4", "5"},
                {"6", "7", "8", "9", "10"},
                {"11", "12", "13", "14", "15"}
        };

        try {
            int result = sum2d(arr);
            System.out.println("Сумма элементов массива: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Некорректное преобразование строки в число: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Строка равна 0: " + e.getMessage());
        }
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
