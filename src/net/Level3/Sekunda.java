package net.Level3;

public class Sekunda {
    public static void main(String[] args) {
        int secondAfter15 = 0;
        int firstTime = 15*3600;
        int secondTime = 15*3600+30*60;
        secondAfter15 = secondTime - firstTime;
        System.out.print(secondAfter15);
    }
}
