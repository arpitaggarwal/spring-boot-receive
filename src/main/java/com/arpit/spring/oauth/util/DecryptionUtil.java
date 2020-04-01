package com.arpit.spring.oauth.util;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.AESDecrypter;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;

public final class DecryptionUtil {

    private static final String ALGORITHM = "SHA-256";
    private static final String CHARSET_NAME = "UTF-8";

    public static Payload decrypt(final String text, final String sharedSecret) throws Exception {
        try {
            final JWEObject jweObject = JWEObject.parse(text);
            jweObject.decrypt(new AESDecrypter(getKeyBytes(sharedSecret)));
            return jweObject.getPayload();
        } catch (ParseException | NoSuchAlgorithmException | JOSEException ex) {
            throw new Exception("Exception occurred while decrypting payload", ex);
        }
    }


    private static byte[] getKeyBytes(String sharedSecret) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(ALGORITHM);
        md.update(sharedSecret.getBytes(Charset.forName(CHARSET_NAME)));
        return md.digest();
    }
}
