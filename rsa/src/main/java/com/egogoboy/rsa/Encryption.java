package com.egogoboy.rsa;

import java.util.HashMap;
import static com.egogoboy.rsa.KeyGeneration.*;
public class Encryption {
    public static HashMap<Character, Integer> LettersCode = new HashMap<>();

    final static String START_ENCRYPTION = "start message encryption...\n";
    final static String END_ENCRYPTION = "message encryption completed successfully!\n";
    private static void GenCodes() {
        char c = 'А';
        for (int i = 0; i < 31; i++) {
            LettersCode.put(c, i);
            c++;
        }
    }

    public static long[] EncryptionMessage(String message, KeyPair<Key, Key> keys) {
        GenCodes();
        System.out.print(START_ENCRYPTION);
        long[] encryptedMessage = new long[message.length()];
        for (int i = 0; i < message.length(); i++)
            encryptedMessage[i] = (long)(Math.pow(LettersCode.get(message.charAt(i)), keys.open.x) % keys.open.n);
        System.out.print(END_ENCRYPTION);
        return encryptedMessage;
    }
}
