package dev.lucas.EventApi.Core.entities;

import java.security.SecureRandom;

public class IdentifierGenerator {


    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generate() {
        StringBuilder sb = new StringBuilder(6);

        // 3 letras
        for (int i = 0; i < 3; i++) {
            sb.append(LETTERS.charAt(RANDOM.nextInt(LETTERS.length())));
        }

        // 3 números
        for (int i = 0; i < 3; i++) {
            sb.append(NUMBERS.charAt(RANDOM.nextInt(NUMBERS.length())));
        }

        return sb.toString();
    }
}
