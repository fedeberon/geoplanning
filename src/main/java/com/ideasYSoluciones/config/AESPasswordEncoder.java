package com.ideasYSoluciones.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

public class AESPasswordEncoder implements PasswordEncoder {

    private Log logger;
    private Pattern AES_PATTERN;
    byte[] input;
    byte[] iv = "#EDC4rfvf2d2r3c4".getBytes();

    public void AESPasswordEncoder() {

        this.logger = LogFactory.getLog(this.getClass());
        input = Base64.decodeBase64(String.valueOf(this));

        Cipher cipher = null;
        try {
            cipher = Cipher.getInstance("AES/CBC/NoPadding");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }

        try {
            cipher.init(
                    Cipher.DECRYPT_MODE,
                    new SecretKeySpec("f2d2r3c4#EDC4rfv".getBytes("UTF-8"), "rijndael"),
                    new IvParameterSpec(iv)
            );


        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String encode(CharSequence rawPassword) {
        return null;
    }

    @Override
    public boolean matches(CharSequence charSequence, String encodedPassword) {

        if (encodedPassword != null && encodedPassword.length() != 0) {
            if (!this.AES_PATTERN.matcher(encodedPassword).matches()) {
                this.logger.warn("Encoded password does not look match AES encryption");
                return false;
            } else {
                return false;
            }
        } else {
            this.logger.warn("Empty encoded password");
            return false;
        }

    }
}
