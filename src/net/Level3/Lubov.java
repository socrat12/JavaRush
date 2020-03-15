package net.Level3;

import java.io.*;

public class Lubov {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.print(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}

