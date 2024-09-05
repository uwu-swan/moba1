import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите задачу (1-20) или 0 для выхода:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkEvenOdd(scanner);
                    break;
                case 2:
                    minOfThree(scanner);
                    break;
                case 3:
                    multiplicationTable();
                    break;
                case 4:
                    sumFrom1ToN(scanner);
                    break;
                case 5:
                    fibonacciNumbers(scanner);
                    break;
                case 6:
                    checkPrime(scanner);
                    break;
                case 7:
                    reverseNumbers(scanner);
                    break;
                case 8:
                    sumOfEvenNumbers(scanner);
                    break;
                case 9:
                    reverseString(scanner);
                    break;
                case 10:
                    countDigits(scanner);
                    break;
                case 11:
                    factorial(scanner);
                    break;
                case 12:
                    sumOfDigits(scanner);
                    break;
                case 13:
                    checkPalindrome(scanner);
                    break;
                case 14:
                    maxInArray(scanner);
                    break;
                case 15:
                    sumOfArrayElements(scanner);
                    break;
                case 16:
                    countPositiveNegative(scanner);
                    break;
                case 17:
                    primeNumbersInRange(scanner);
                    break;
                case 18:
                    countVowelsConsonants(scanner);
                    break;
                case 19:
                    reverseWords(scanner);
                    break;
                case 20:
                    checkArmstrong(scanner);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте еще раз.");
            }
        }
    }
    // 1. Четное или нечетное число
    private static void checkEvenOdd(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " - четное число.");
        } else {
            System.out.println(number + " - нечетное число.");
        }
    }
    // 2. Минимальное из трех чисел
    private static void minOfThree(Scanner scanner) {
        System.out.print("Введите три целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Минимальное число: " + min);
    }
    // 3. Таблица умножения
    private static void multiplicationTable() {
        System.out.println("Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
    // 4. Сумма чисел от 1 до N
    private static void sumFrom1ToN(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int sum = (N * (N + 1)) / 2;
        System.out.println("Сумма чисел от 1 до " + N + ": " + sum);
    }
    // 5. Число Фибоначчи
    private static void fibonacciNumbers(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Первые " + N + " чисел Фибоначчи: ");
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    // 6. Проверка простого числа
    private static void checkPrime(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        boolean isPrime = true;

        if (number <= 1) isPrime = false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + (isPrime ? " - простое число." : " - не простое число."));
    }
    // 7. Обратный порядок чисел
    private static void reverseNumbers(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        System.out.print("Числа от " + N + " до 1: ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // 8. Сумма четных чисел
    private static void sumOfEvenNumbers(Scanner scanner) {
        System.out.print("Введите два целых числа A и B: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;

        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел: " + sum);
    }
    // 9. Реверс строки
    private static void reverseString(Scanner scanner) {
        System.out.print("Введите строку: ");
        scanner.nextLine(); // очистка буфера
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Обратная строка: " + reversed);
    }
    // 10. Количество цифр в числе
    private static void countDigits(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int count = String.valueOf(Math.abs(number)).length();
        System.out.println("Количество цифр: " + count);
    }
    // 11. Факториал числа
    private static void factorial(Scanner scanner) {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println("Факториал " + N + " = " + factorial);
    }
    // 12. Сумма цифр числа
    private static void sumOfDigits(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр: " + sum);
    }
    // 13. Палиндром
    private static void checkPalindrome(Scanner scanner) {
        System.out.print("Введите строку: ");
        scanner.nextLine(); // очистка буфера
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        boolean isPalindrome = str.equals(reversed);
        System.out.println(str + (isPalindrome ? " - палиндром." : " - не палиндром."));
    }
    // 14. Найти максимальное число в массиве
    private static void maxInArray(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < size; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("Максимальное число: " + max);
    }
    // 15. Сумма всех элементов массива
    private static void sumOfArrayElements(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
    // 16. Количество положительных и отрицательных чисел
    private static void countPositiveNegative(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
    }
    // 17. Простые числа в диапазоне
    private static void primeNumbersInRange(Scanner scanner) {
        System.out.print("Введите два числа A и B: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.print("Простые числа в диапазоне от " + A + " до " + B + ": ");
        for (int number = A; number <= B; number++) {
            boolean isPrime = true;
            if (number <= 1) isPrime = false;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
    // 18. Подсчет гласных и согласных в строке
    private static void countVowelsConsonants(Scanner scanner) {
        System.out.print("Введите строку: ");
        scanner.nextLine(); // очистка буфера
        String str = scanner.nextLine().toLowerCase();
        int vowelsCount = 0, consonantsCount = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouёаеёиоуыэюя".indexOf(c) != -1) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowelsCount);
        System.out.println("Количество согласных: " + consonantsCount);
    }
    // 19. Перестановка слов в строке
    private static void reverseWords(Scanner scanner) {
        System.out.print("Введите строку: ");
        scanner.nextLine(); // очистка буфера
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Слова в обратном порядке: " + reversed.toString().trim());
    }
    // 20. Число Армстронга
    private static void checkArmstrong(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        System.out.println(originalNumber + (sum == originalNumber ? " - число Армстронга." : " - не число Армстронга."));
    }
}
