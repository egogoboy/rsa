package com.egogoboy.rsa;
import java.util.Scanner;

import static com.egogoboy.rsa.KeyGeneration.*;
import static com.egogoboy.rsa.Encryption.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter message: ");
            String message = in.next();

            KeyPair<Key, Key> keys = keyGen();
            System.out.print("Open key: " + keys.open.x + " " + keys.open.n + '\n');
            System.out.print("Close key: " + keys.close.x + " " + keys.close.n + '\n');

            long[] encryptedMessage = EncryptionMessage(message, keys);

            System.out.print("Encrypted message: ");
            for (long l : encryptedMessage) System.out.print(l);

        }
    }
}
