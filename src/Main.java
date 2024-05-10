public class Main {
    public static void main(String[] args) {
        double[] numbers = {8.0, 5.0, -2.0, -4.0, 2.6, 3.8, 6.0, -7.0, 1.0, 4.8, -9.0, 10.0, 12.0, -3.0, 15.0};
        double sum = 0;
        int count = 0;
        boolean Negative = false;

        for (double element : numbers) {
            if (number < 0 && !Negative) {
                Negative = true;
            } else if (element > 0 && Negative) {
                sum += element;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("В массиве нет положительных чисел после первого отрицательного числа.");
        } else {
            double average = sum / count;
            System.out.println("среднее арифметическое положительных чисел после первого отрицательного числа: " + average);
        }


    }
}