//программа получает любое целое число и определяет значение его крайней цифры
package net.workbook;
import net.utils.*;
import java.io.IOException;


public class Ex3_numberSeven {
    public static void main(String[] args) throws IOException {
        CheckInt number = new CheckInt();
        number.setIntergent("исходной цифры");
        System.out.println("Последняя цифра " + number.getIntergent() % 10);
    }
}
