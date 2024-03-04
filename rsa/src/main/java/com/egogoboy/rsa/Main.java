package com.egogoboy.rsa;
import static com.egogoboy.rsa.MyUtil.*;
public class Main {
    public static void main(String[] args) {
        int p, q;
        p = 1009;
        q = 1013;
        int n = p * q;
        int d = (p - 1) * (q - 1) - 1;
        while (GCF(d, n) != 1)
            d--;
        int e = 1;
        while ((e * d) % ((p - 1)*(q - 1)) != 1)
            e++;
        System.out.print("Open key: " + e + " " + n + '\n');
        System.out.print("Close key: " + d + " " + n);
    }
}
