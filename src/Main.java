import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Проверка високосного года
        checkLeapYear(2023);
        checkLeapYear(2024);

        // Задача 2: Рекомендация версии приложения
        suggestAppVersion(0, 2014); // iOS, старый телефон
        suggestAppVersion(1, 2023); // Android, новый телефон

        // Задача 3: Расчет дней доставки
        System.out.println("3. Потребуется дней: " + calculateDeliveryDays(95));
        System.out.println("3. Потребуется дней: " + calculateDeliveryDays(25));
    }

    // Метод для задачи 1
    public static void checkLeapYear(int year) {
        boolean isLeap = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        System.out.println("1. " + year + (isLeap ? " год — високосный год" : " год — невисокосный год"));
    }

    // Метод для задачи 2
    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String osName = osType == 0 ? "iOS" : "Android";
        String version = deviceYear < currentYear ? "облегченную" : "обычную";

        System.out.println("2. Установите " + version + " версию приложения для " + osName + " по ссылке");
    }

    // Метод для задачи 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1; // -1 означает, что доставка невозможна
        }
    }
}