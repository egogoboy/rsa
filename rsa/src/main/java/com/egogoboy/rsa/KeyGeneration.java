package com.egogoboy.rsa;

public class KeyGeneration {
    final static String START_KEY_GEN = "generation of encryption keys has begun\n";
    final static String SUCCESS_KEY_GEN = "generation of encryption keys was successful\n";
    public static class KeyPair <O, C>{
        O open;
        C close;
    }
    public static class Key {
        int x;
        int n;
    }

    public static KeyPair<Key, Key> keyGen() {
        System.out.print(START_KEY_GEN);
        int p, q;
        p = 3;
        q = 11;
        int n = p * q;

        int d = /*(p - 1) * (q - 1) - 1*/3;
        //while (MyUtil.GCF(d, n) != 1)
        //    d--;

        int e = 7;
        //while ((e * d) % ((p - 1)*(q - 1)) != 1)
        //    e++;

        Key openKey = new Key();
        openKey.x = e;
        openKey.n = n;

        Key closeKey = new Key();
        closeKey.x = d;
        closeKey.n = n;

        KeyPair<Key, Key> result = new KeyPair<>();
        result.open = openKey;
        result.close = closeKey;

        System.out.print(SUCCESS_KEY_GEN);
        return result;
    }
}
