package com.company;

public class Primes {

    public static void main(String[] args) {        //метод, перебирающий числа от 2 до 100
        for (int i = 2; i <= 100; i++ ) {
            if (IsPrime(i))     //проверка числа
                System.out.println(i);      //выводим результат
        }
    }

    public static boolean IsPrime(int n) {      //переменная, равная числу делителей
            //перебор от 2 до самого числа невключительно
        if ((n % 5) == 0)
            return false;       //возвращаем false если есть хотя бы 1 делитель

        return true;        //возвращаем true если делителей нет
    }

}