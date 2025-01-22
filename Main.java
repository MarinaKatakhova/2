import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    public static void minOfThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье целое число: ");
        int c = scanner.nextInt();
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Минимальное число: " + min);
    }

    public static void multiplicationTable() {
        System.out.println("Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }

    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " равна: " + sum);
    }

    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Первые " + n + " чисел Фибоначчи: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }

    public static void primeCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " является простым числом.");
        } else {
            System.out.println(number + " не является простым числом.");
        }
    }

    public static void reverseOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int n = scanner.nextInt();
        System.out.print("Числа от " + n + " до 1 в обратном порядке: ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sumOfEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a = scanner.nextInt();
        System.out.print("Введите число B: ");
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел от " + a + " до " + b + " равна: " + sum);
    }

    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Перевернутая строка: " + reversed);
    }

    public static void digitCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int digitCount = String.valueOf(Math.abs(number)).length();
        System.out.println("Количество цифр в числе: " + digitCount);
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + n + " равен: " + factorial);
    }

    public static void sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum);
    }

    public static void palindromeCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
    }

    public static void maxInArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
    }

    public static void sumOfArrayElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }

    public static void positiveNegativeCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int positiveCount = 0;
        int negativeCount = 0;
        for (int num : array) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
    }

    public static void primeNumbersInRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a = scanner.nextInt();
        System.out.print("Введите число B: ");
        int b = scanner.nextInt();
        System.out.println("Простые числа в диапазоне от " + a + " до " + b + ":");
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void vowelConsonantCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine().toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowelCount);
        System.out.println("Количество согласных: " + consonantCount);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void reverseWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Перестановка слов: " + reversed.toString().trim());
    }

    public static void armstrongNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " является числом Армстронга.");
        } else {
            System.out.println(originalNumber + " не является числом Армстронга.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1: Четное или нечетное число");
        evenOrOdd();

        System.out.println("Задача 2: Минимальное из трех чисел");
        minOfThree();

        System.out.println("Задача 3: Таблица умножения");
        multiplicationTable();

        System.out.println("Задача 4: Сумма чисел от 1 до N");
        sumOfNumbers();

        System.out.println("Задача 5: Число Фибоначчи");
        fibonacci();

        System.out.println("Задача 6: Проверка простого числа");
        primeCheck();

        System.out.println("Задача 7: Обратный порядок чисел");
        reverseOrder();

        System.out.println("Задача 8: Сумма четных чисел");
        sumOfEvenNumbers();

        System.out.println("Задача 9: Реверс строки");
        reverseString();

        System.out.println("Задача 10: Количество цифр в числе");
        digitCount();

        System.out.println("Задача 11: Факториал числа");
        factorial();

        System.out.println("Задача 12: Сумма цифр числа");
        sumOfDigits();

        System.out.println("Задача 13: Палиндром");
        palindromeCheck();

        System.out.println("Задача 14: Найти максимальное число в массиве");
        maxInArray();

        System.out.println("Задача 15: Сумма всех элементов массива");
        sumOfArrayElements();

        System.out.println("Задача 16: Количество положительных и отрицательных чисел");
        positiveNegativeCount();

        System.out.println("Задача 17: Простые числа в диапазоне");
        primeNumbersInRange();

        System.out.println("Задача 18: Подсчет гласных и согласных в строке");
        vowelConsonantCount();

        System.out.println("Задача 19: Перестановка слов в строке");
        reverseWords();

        System.out.println("Задача 20: Число Армстронга");
        armstrongNumber();

        scanner.close();
    }
}
