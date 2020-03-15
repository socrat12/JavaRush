package net.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheresGod {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        int num1i = Integer.parseInt(num1);
        int num2i = Integer.parseInt(num2);
        System.out.print(name + " получает " + num1i + " через " + num2i + " лет.");


    }
}
