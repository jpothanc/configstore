package com.cs.ibit.helpers;

public class Helper {
    public static String getPasswordEncryptionKey() {
        return System.getenv(Constants.PASSWORD_ENCRYPTION_KEY);
    }
}
