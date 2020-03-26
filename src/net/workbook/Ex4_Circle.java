//программа принимает значение сторон отверствия в форме прямоугольника и радиуса окружности
//после чего определяет пройдет окружность через заданное отверстие
package net.workbook;

import net.utils.CheckInt;
import java.io.IOException;

public class Ex4_Circle {
    public static void main(String[] args) throws IOException {
        CheckInt priamougolnik = new CheckInt();
        priamougolnik.setIntergent("стороны а");
        int a = priamougolnik.getIntergent();
        priamougolnik.setIntergent("стороны b");
        int b = priamougolnik.getIntergent();
        priamougolnik.setIntergent("радиуса r");
        int r = priamougolnik.getIntergent();
        if (r*2<=a&&r*2<=b)
            System.out.println("Круг пролезет в прямоугольник");
        else
            System.out.println("Круг не пролезет в прямоугольник");
    }
}
