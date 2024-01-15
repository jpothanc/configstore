package com.ibit.common;

import com.ibit.helpers.Constants;
import org.jasypt.util.text.BasicTextEncryptor;

public class CryptoManager {

    public static String encrypt(String password, String encryptionKey) throws RuntimeException {
        if (encryptionKey == null || encryptionKey == "")
            throw new RuntimeException(Constants.PASSWORD_ENCRYPTION_KEY_ERROR_MSG);
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(encryptionKey);
        return textEncryptor.encrypt(password);
    }

    public static String decrypt(String password, String encryptionKey) throws RuntimeException {
        if (encryptionKey == null || encryptionKey == "")
            throw new RuntimeException(Constants.PASSWORD_ENCRYPTION_KEY_ERROR_MSG);
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(encryptionKey);
        return textEncryptor.decrypt(password);
    }
}
