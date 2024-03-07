package com.egogoboy.rsa;

public class MyUtil {

    public static int GCF(int a, int b) {
        while (a != 0 && b != 0)
            if (a > b)
                a %= b;
            else
                b %= a;

        return a + b;
    }

}
