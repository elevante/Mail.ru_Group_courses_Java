package ru.mail;

public class JavaApp {
        // №1
    public static void main(String[] args) {
        // №2
        byte valByte = -100;
        short valShort = 12442;
        int valInt = 1000;
        long valLong = 200000L;
        float valFloat = 12.23f;
        double valDouble = -123.123;
        char valChar = 'c';
        boolean valBoolean = true;

        System.out.print("№3. ");
        System.out.println(calculate(1, 2.13f, 3, 1.12f));
        System.out.print("№4. ");
        System.out.println(task10and20(7, 4));
        System.out.print("№5. ");
        isPositiveOrNegative(0);
        System.out.print("№6. ");
        System.out.println(isNegative(0));
        System.out.print("№7. ");
        greetings("Adam");
        System.out.print("№8*. ");
        leapYear(2021);
    }

    public static float calculate(float a, float b, float c, float d)
    {
        return (a * (b + (c / d)));
    }

    public static boolean task10and20(int x1, int x2)
    {
        int sum = x1 + x2;

        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }

    public static void isPositiveOrNegative(int x)
    {
        if(x < 0)
            System.out.println("Отрицательное число " + x);
        else
            System.out.println("Положительное число " + x);
    }

    public static boolean isNegative(int x){
        if (x < 0)
            return true;
        else
            return false;
    }

    public static void greetings(String name)
    {
        System.out.println(name);
    }

    public static void leapYear(int year)
    {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.println("Год високосный (366 дней)");
        else
            System.out.println("Год не високосный (365 дней)");
    }
}