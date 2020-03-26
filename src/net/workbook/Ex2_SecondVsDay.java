//программа получает исходные значения в секундах и переводит их в минуты, часы, дни и т.д.
package net.workbook;

import net.utils.CheckInt;

import java.io.IOException;

public class Ex2_SecondVsDay {
    public static void main(String[] args) throws IOException {
        ConvertInt time = new ConvertInt(); // создаем объект time класса ConvertInt
        time.setIntergent(); //получаем входные данные, которые сразу проверяем на корректность
        time.convert(time.getIntergent());//возвращаем полученные данные в метод convert
    }                                       //который затем конвертирует и приводит их к нужному виду
}

class ConvertInt extends CheckInt {// создаем класс, конвертирующий секунды в минуты, часы и т.д.

    // наследуем его от класса CheckInt, методы которого принимают
    public void convert(int time) { //входные значения, проверяют их корректность и выдают в метод main

        int min = 0;
        int hour = 0;
        int day = 0;
        int mounth = 0;
        int year = 0;
        if (time >= 60) {// вычисляем и печатуем количество секунд по модулю 60
            System.out.print(time % 60 + " секунд");
            min = (time - time % 60) / 60;//вычисляем и печатуем количество минут и далее по тексту...
            System.out.print(" " + min % 60 + " минут");
        }
        if (min >= 60) {
            hour = (min - min % 60) / 60;
            System.out.print(" " + hour % 24 + " часов");
        }
        if (hour >= 24) {
            day = (hour - hour % 24) / 24;
            System.out.print(" " + day % 31 + " дней");
        }
        if (day >= 31) {
            mounth = (day - day % 31) / 31;
            System.out.print(" " + mounth % 12 + " месяцев");
        }
        if (mounth >= 12) {
            year = (mounth - mounth % 12) / 12;
            System.out.print(" " + year + " лет");
        }
    }
}