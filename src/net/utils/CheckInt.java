package net.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckInt {

    private int intergent;

    public void setIntergent() throws IOException {
        System.out.println("Введите значение ");
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        this.intergent = Integer.parseInt(number.readLine());
        while (intergent <= 0) {
            System.out.println("Ты ввел значение меньше или равное 0 (пустое). Введи новое значение");
            BufferedReader NextNum = new BufferedReader(new InputStreamReader(System.in));
            this.intergent = Integer.parseInt(NextNum.readLine());
        }
    }

    public void setIntergent(String Text) throws IOException {
        System.out.println("Введите значение " + Text);
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        this.intergent = Integer.parseInt(number.readLine());
        while (intergent <= 0) {
            System.out.println("Ты ввел значение меньше или равное 0 (пустое). Введи новое значение");
            BufferedReader NextNum = new BufferedReader(new InputStreamReader(System.in));
            this.intergent = Integer.parseInt(NextNum.readLine());
        }
    }

    public int getIntergent() {
        return intergent;
    }
}