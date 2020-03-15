
package net.Level3;
import java.io.*;

public class VasyaConcured {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Введите имя: ");
        String name = bufferedReader.readLine();
        System.out.println("Введите количество лет");
        String sAge = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");
    }
}
