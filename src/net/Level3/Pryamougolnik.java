package net.Level3;

import java.io.*;

public class Pryamougolnik {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String a = reader.readLine();
                String b = reader.readLine();
                int m = Integer.parseInt(a);
                int n = Integer.parseInt(a);
                for (int i = 0; i < m; i ++){
                    for (int y = 0; y <= n; y ++){
                        System.out.print("8");
                    }
                    System.out.println();
                }

    }
}
