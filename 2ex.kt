import java.text.SimpleDateFormat
import java.time.format.DateTimeParseException
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

// 1. Функция для нахождения максимума
fun findMax(a: Int, b: Int): Int {
    if (a == b) throw IllegalArgumentException("Числа равны")
    return if (a > b) a else b
}

// 2. Калькулятор деления
fun divide(a: Int, b: Int): Double {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо")
    return a.toDouble() / b
}

// 3. Конвертер строк в числа
fun stringToInt(str: String): Int {
    return str.toIntOrNull() ?: throw NumberFormatException("Невозможно преобразовать строку в целое число")
}

// 4. Проверка возраста
fun checkAge(age: Int) {
    if (age < 0 || age > 150) throw IllegalArgumentException("Возраст должен быть между 0 и 150")
}

// 5. Нахождение корня
fun findSquareRoot(number: Double): Double {
    if (number < 0) throw IllegalArgumentException("Невозможно найти корень из отрицательного числа")
    return sqrt(number)
}

// 6. Факториал
fun factorial(n: Int): Long {
    if (n < 0) throw IllegalArgumentException("Факториал не определен для отрицательных чисел")
    return if (n == 0 || n == 1) 1 else n * factorial(n - 1)
}

// 7. Проверка массива на нули
fun checkArrayForZeros(arr: IntArray) {
    if (arr.contains(0)) throw IllegalArgumentException("Массив содержит нули")
}

// 8. Калькулятор возведения в степень
fun power(base: Double, exponent: Int): Double {
    if (exponent < 0) throw IllegalArgumentException("Показатель не может быть отрицательным")
    return base.pow(exponent)
}

// 9. Обрезка строки
fun truncateString(str: String, length: Int): String {
    if (length > str.length) throw IllegalArgumentException("Длина превышает длину строки")
    return str.take(length)
}

// 10. Поиск элемента в массиве
fun findElement(arr: IntArray, element: Int): Int {
    val index = arr.indexOf(element)
    if (index == -1) throw NoSuchElementException("Элемент не найден в массиве")
    return index
}

// 11. Конвертация в двоичную систему
fun toBinaryString(number: Int): String {
    if (number < 0) throw IllegalArgumentException("Число не может быть отрицательным")
    return Integer.toBinaryString(number)
}

// 12. Проверка делимости
fun isDivisible(a: Int, b: Int): Boolean {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо")
    return a % b == 0
}

// 13. Чтение элемента списка
fun getListElement(list: List<Int>, index: Int): Int {
    if (index < 0 || index >= list.size) throw IndexOutOfBoundsException("Индекс выходит за пределы списка")
    return list[index]
}

// 14. Парольная проверка
class WeakPasswordException(message: String) : Exception(message)

fun checkPassword(password: String) {
    if (password.length < 8) throw WeakPasswordException("Пароль слишком слабый")
}

// 15. Проверка даты
fun validateDate(dateStr: String) {
    val sdf = SimpleDateFormat("dd.MM.yyyy")
    sdf.isLenient = false
    try {
        sdf.parse(dateStr)
    } catch (e: java.text.ParseException) {
        throw DateTimeParseException("Неверный формат даты", dateStr, 0)
    }
}

// 16. Конкатенация строк
fun concatenateStrings(str1: String?, str2: String?): String {
    if (str1 == null || str2 == null) throw NullPointerException("Строки не могут быть null")
    return str1 + str2
}

// 17. Остаток от деления
fun remainder(a: Int, b: Int): Int {
    if (b == 0) throw ArithmeticException("Деление на ноль недопустимо")
    return a % b
}

// 18. Квадратный корень
fun squareRoot(number: Double): Double {
    if (number < 0) throw IllegalArgumentException("Невозможно найти корень из отрицательного числа")
    return sqrt(number)
}

// 19. Конвертер температуры
fun celsiusToFahrenheit(celsius: Double): Double {
    if (celsius < -273.15) throw IllegalArgumentException("Температура ниже абсолютного нуля")
    return celsius * 9 / 5 + 32
}

// 20. Проверка строки на пустоту
fun checkStringForEmpty(str: String?) {
    if (str.isNullOrEmpty()) throw IllegalArgumentException("Строка пустая или равна null")
}

fun main() {
    val scanner = Scanner(System.`in`)

    // Задание 1: Функция для нахождения максимума
    try {
        println("Введите два числа для нахождения максимума:")
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        println("Максимум: ${findMax(a, b)}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 2: Калькулятор деления
    try {
        println("Введите два числа для деления:")
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        println("Результат деления: ${divide(a, b)}")
    } catch (e: ArithmeticException) {
        println(e.message)
    }

    // Задание 3: Конвертер строк в числа
    try {
        println("Введите строку для преобразования в целое число:")
        val str = scanner.next()
        println("Результат преобразования: ${stringToInt(str)}")
    } catch (e: NumberFormatException) {
        println(e.message)
    }

    // Задание 4: Проверка возраста
    try {
        println("Введите возраст для проверки:")
        val age = scanner.nextInt()
        checkAge(age)
        println("Возраст корректен")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 5: Нахождение корня
    try {
        println("Введите число для нахождения квадратного корня:")
        val number = scanner.nextDouble()
        println("Квадратный корень: ${findSquareRoot(number)}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 6: Факториал
    try {
        println("Введите число для нахождения факториала:")
        val n = scanner.nextInt()
        println("Факториал: ${factorial(n)}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 7: Проверка массива на нули
    try {
        println("Введите массив целых чисел для проверки на наличие нулей (через запятую):")
        val arrStr = scanner.next()
        val arr = arrStr.split(",").map { it.toInt() }.toIntArray()
        checkArrayForZeros(arr)
        println("Массив не содержит нулей")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 8: Калькулятор возведения в степень
    try {
        println("Введите основание и показатель для вычисления степени:")
        val base = scanner.nextDouble()
        val exponent = scanner.nextInt()
        println("Результат возведения в степень: ${power(base, exponent)}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 9: Обрезка строки
    try {
        println("Введите строку и длину для обрезки:")
        val str = scanner.next()
        val length = scanner.nextInt()
        println("Обрезанная строка: ${truncateString(str, length)}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 10: Поиск элемента в массиве
    try {
        println("Введите массив целых чисел и элемент для поиска (через запятую):")
        val arrStr = scanner.next()
        val element = scanner.nextInt()
        val arr = arrStr.split(",").map { it.toInt() }.toIntArray()
        println("Индекс элемента: ${findElement(arr, element)}")
    } catch (e: NoSuchElementException) {
        println(e.message)
    }

    // Задание 11: Конвертация в двоичную систему
    try {
        println("Введите число для преобразования в двоичную систему:")
        val number = scanner.nextInt()
        println("Двоичное представление: ${toBinaryString(number)}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 12: Проверка делимости
    try {
        println("Введите два числа для проверки делимости:")
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        println("Делится ли первое число на второе: ${isDivisible(a, b)}")
    } catch (e: ArithmeticException) {
        println(e.message)
    }

    // Задание 13: Чтение элемента списка
    try {
        println("Введите список целых чисел и индекс для получения элемента (через запятую):")
        val listStr = scanner.next()
        val index = scanner.nextInt()
        val list = listStr.split(",").map { it.toInt() }
        println("Элемент списка: ${getListElement(list, index)}")
    } catch (e: IndexOutOfBoundsException) {
        println(e.message)
    }

    // Задание 14: Парольная проверка
    try {
        println("Введите пароль для проверки:")
        val password = scanner.next()
        checkPassword(password)
        println("Пароль надежный")
    } catch (e: WeakPasswordException) {
        println(e.message)
    }

    // Задание 15: Проверка даты
    try {
        println("Введите дату в формате дд.ММ.гггг:")
        val dateStr = scanner.next()
        validateDate(dateStr)
        println("Дата корректна")
    } catch (e: DateTimeParseException) {
        println(e.message)
    }

    // Задание 16: Конкатенация строк
    try {
        println("Введите две строки для объединения:")
        val str1 = scanner.next()
        val str2 = scanner.next()
        println("Объединенная строка: ${concatenateStrings(str1, str2)}")
    } catch (e: NullPointerException) {
        println(e.message)
    }

    // Задание 17: Остаток от деления
    try {
        println("Введите два числа для нахождения остатка от деления:")
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        println("Остаток от деления: ${remainder(a, b)}")
    } catch (e: ArithmeticException) {
        println(e.message)
    }

    // Задание 18: Квадратный корень
    try {
        println("Введите число для нахождения квадратного корня:")
        val number = scanner.nextDouble()
        println("Квадратный корень: ${squareRoot(number)}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 19: Конвертер температуры
    try {
        println("Введите температуру в Цельсиях для перевода в Фаренгейты:")
        val celsius = scanner.nextDouble()
        println("Температура в Фаренгейтах: ${celsiusToFahrenheit(celsius)}")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    // Задание 20: Проверка строки на пустоту
    try {
        println("Введите строку для проверки на пустоту:")
        val str = scanner.next()
        checkStringForEmpty(str)
        println("Строка не пустая")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
