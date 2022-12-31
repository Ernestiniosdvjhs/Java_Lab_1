package com.company;

public class Palindrom {

    public static void main(String[] args) {    //метод, принимающий входящие аргументы
        for (int i = 0; i < args.length; i++) {
            String s = args[i];     //приводим все символы к нижнему регистру (на всякий случай)
            System.out.println(isPalindrome(s));    //выводим результат
        }
    }

    public static String reverseString(String s) {      //метод, разворчивающий строку задом наперед
        String s_rev = "";    //создаем новую переменную: пустую строку
        for (int i = 0; i < s.length(); i++ ) {
            s_rev += s.charAt(i+s.length()-1-2*i);    //к новой переменной прибавляем с конца символы введенных аргументов
        }
        return s_rev;     //возвращаем получившиеся значения
    }

    public static boolean isPalindrome(String s) {      //метод, в котором мы проверяем, является ли строка палиндромом
        return s.equals(reverseString(s));      //возвращаем получившиеся значения
    }

}
