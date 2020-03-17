package net.Level3;

import java.io.*;

public class VisokosnyGod {
static void VGod (int god){
    if (god%400==0)
        System.out.print("количество дней в году: 366");
    else  if (god%100==0)
        System.out.print("количество дней в году: 365");
    else  if (god%4==0)
        System.out.print("количество дней в году: 366");
    else
        System.out.print("количество дней в году: 365");

}

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        int God = Integer.parseInt(x);
        VGod(God);
    }


}
