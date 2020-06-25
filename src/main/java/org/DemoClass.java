package org;

import static java.lang.System.out;
/**
 * @author  dsa
 */
public class DemoClass {


    /**
     * Entry point into the program.
     * @param args agmuments
     */
    public static void main(String[] args) {
        out.println(goodMethod(4));
    }

    /**
     * Simple method.
     * @param x an any number
     * @return x * 0.1
     */
    public static double goodMethod(int x) {
        return  x * 0.1;
    }
}
