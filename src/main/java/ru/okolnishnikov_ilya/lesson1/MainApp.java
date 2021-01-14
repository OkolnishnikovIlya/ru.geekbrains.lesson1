package ru.okolnishnikov_ilya.lesson1;

public class MainApp {
    public static void main(String[] args) {
        //Все типы данных, которые изучили на 1 уроке
        byte a = 1;     //может содержать 1 байт данных, целые числа (от -128 до 127)
        short b = 1;    //может содержать 2 байта данных, целые числа (от -32768 до 32767)
        int c = 1;      //может содержать 4 байта данных, целые числа (от -2147483648 до 2147483647)
        long d = 1;     //может содержать 8 байт данных, целые числа (от -9223372036854775808L до 9223372036854775807L)
        float e = 1.0f; //может содержать 4 байта данных, числа с плавающей точкой
        double f = 1.0; //может содержать 8 байт данных, числа с плавающей точкой
        char g = '1';   //может содержать 2 байта данных, 1 символ в кодировке UTF-16
        boolean h = true; //логический тип данных, может содержать true или false (истина или ложь)
        String i = "Ссылочный тип данных, который ссылается на область в памяти, где хранится строковое значение";

        //проверка метода calculation()
        System.out.println("2.0f * (10.0f + (20.0f / 10.0f)) = " + calculation(2.0f,10.0f,20.0f,10.0f));

        //проверка метода compare()
        System.out.println("5 + 4 = " + compare(5,4) + "\n" + "5 + 5 = " + compare(5,5) + "\n" + "10 + 10 = " + compare(10,10) + "\n" + "11 + 10 = " + compare(11,10));

        //проверка метода positiveOrNegative()
        System.out.print("0 это "); positiveOrNegative(0); System.out.print(" так же как и 1 "); positiveOrNegative(1);
        System.out.print("\n" + "а вот -1 "); positiveOrNegative(-1); System.out.print(" так же как и -500 "); positiveOrNegative(-500);
        System.out.println();

        //проверка метода trueFalse()
        System.out.println("Число -1 " + trueFalse(-1) + " a вот число 0 " + trueFalse(0) + " так же как и число 10 " + trueFalse(10));

        //проверка метода helloName()
        helloName("Александр");

    }

    //Метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float calculation (float a, float b, float c, float d){
        return a * (b + (c/d));
    }

    //Метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно),
    //если да – вернуть true, в противном случае – false.
    public static boolean compare(int a, int b){
        return (a + b) >= 10 && (a + b) <= 20;
    }

    //Метод, которому в качестве параметра передается целое число
    //и печатается в консоль, положительное ли число передали или отрицательное.
    //0 считаем положительным числом.
    public static void positiveOrNegative(int a){
        if (a >= 0) System.out.print("число положительное");
        else System.out.print("число отрицательное");
    }

    //Метод, которому в качестве параметра передается целое число.
    //Метод возвращает true, если число отрицательное, и вернуть false если положительное.
    public static boolean trueFalse(int a){
        return a < 0;
    }

    //Метод, которому в качестве параметра передается строка,
    //обозначающая имя. Метод выводит в консоль сообщение «Привет, указанное_имя!».
    public static void helloName(String name){
        System.out.println("Привет, " + name + "!");
    }

    //Метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    //Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void leapYear(int year){
        if (year%4 == 0 ||)
    }

}
