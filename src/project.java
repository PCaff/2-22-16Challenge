//
//  Author: Patrick Caffrey
//
//          Coded for fun. February 27, 2016
//
//
//


import java.util.Scanner;

public class project {

    static boolean[] array;

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        makeSwitches(scan.nextInt());

        while (scan.hasNext()) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x == 00 || y == 00) // Sentinel value to represent end of input
                break;
            switches(x, y);
        }
        for(int i=0; i<array.length; i++)
            System.out.println(array[i]);
    }

    public static void makeSwitches(int x) {
        array = new boolean[x];
    }

    public static void switches(int x, int y) {
        int lowBound, highBound;
        //Decide which integer is the lower bound.
        if (x < y) {
            lowBound = x;
            highBound = y;
        } else {
            lowBound = y;
            highBound = x;
        }
        //Cycle through array flipping switches.
        for (int i = lowBound; i <= highBound; i++) {
            if(array[i])
                array[i] = false;
            else
                array[i] = true;
        }
    }
}