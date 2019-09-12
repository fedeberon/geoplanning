package com.ideasYSoluciones.config;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Random;
import java.util.regex.Pattern;

public class AESPasswordEncoder implements PasswordEncoder {

    private Pattern AES_PATTERN;
    byte[] input;


    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    /**
     *
     * @param charSequence pass encriptado desde la base de datos
     * @param password pass enviado desde el request
     * @return
     */

    @Override
    public boolean matches(CharSequence charSequence, String password) {
        try {
            String pass = this.encodePass(charSequence.toString());
            String passTwo = this.encode_RIJNDAEL_256(charSequence.toString(), "f2d2r3c4#EDC4rfv");


            System.out.println(pass);
            System.out.println(passTwo);
//            byte[] ivEncript = encrypt(charSequence.toString().getBytes(), "f2d2r3c4#EDC4rfv".getBytes());
//            String pass = this.encode256(charSequence.toString(), "f2d2r3c4#EDC4rfv", ivEncript);
//
//            return charSequence.toString().equals(pass);


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return false;
    }

    public String encodePass(String password){
        try{
            byte[] textBytes = password.getBytes("UTF-8");

            Cipher cipher = Cipher.getInstance("RIJNDAEL/ECB/NoPadding");
            SecretKeySpec key = new SecretKeySpec("f2d2r3c4#EDC4rfv".getBytes("UTF-8"), "RIJNDAEL");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            return Base64.encodeBase64String(cipher.doFinal(textBytes));
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return "";
    }

    public static byte[] iv = "#EDC4rfvf2d2r3c4".getBytes();

    public static String encode_RIJNDAEL_256(String data, String key) throws java.io.UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        byte[] textBytes = data.getBytes("UTF-8");
        AlgorithmParameterSpec ivSpec = new IvParameterSpec(iv);
//        SecretKeySpec newKey = new SecretKeySpec(key.getBytes("UTF-8"), "RIJNDAEL");

        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        byte[] salt = bytes;


        KeySpec spec = new PBEKeySpec(data.toCharArray(), salt, 1, 256);
        SecretKey secretKey = null;
        try {
            secretKey = factory.generateSecret(spec);
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }
        SecretKey secret = new SecretKeySpec(secretKey.getEncoded(), "RIJNDAEL");

        Cipher cipher = Cipher.getInstance("RIJNDAEL/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secret);
        return Base64.encodeBase64String(cipher.doFinal(textBytes));
    }

//    public static byte[] encrypt(byte[] decrypted, byte[] keyvalue) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException{
//        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
//        byte[] key = sha256.digest(keyvalue);
//
//        MessageDigest md5 = MessageDigest.getInstance("MD5");
//        byte[] checksum = md5.digest(decrypted);
//
//        //The length of the value to encrypt must be a multiple of 16.
//        byte[] decryptedAndChecksum = new byte[(decrypted.length + md5.getDigestLength() + 15) / 16 * 16];
//        System.arraycopy(decrypted, 0, decryptedAndChecksum, 0, decrypted.length);
//        System.arraycopy(checksum, 0, decryptedAndChecksum, decrypted.length, checksum.length);
//        //The remaining bytes of decryptedAndChecksum stay as 0 (default byte value) because PHP pads with 0's.
//
//        Random rand = new SecureRandom();
//        byte[] iv = new byte[16];
//        rand.nextBytes(iv);
//        IvParameterSpec ivSpec = new IvParameterSpec(iv);
//
//        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
//        cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"), ivSpec);
//        byte[] encrypted = Base64.encodeBase64(cipher.doFinal(decryptedAndChecksum));
//
//        byte[] ivBase64 = Base64.encodeBase64String(iv).substring(0, 22).getBytes();
//        byte[] output = new byte[encrypted.length + ivBase64.length];
//        System.arraycopy(ivBase64, 0, output, 0, ivBase64.length);
//        System.arraycopy(encrypted, 0, output, ivBase64.length, encrypted.length);
//        return output;
//    }
//
//    /**
//     * Encripta los parametros
//     * @param data password de frontend
//     * @param key key de encriptacion
//     * @param ivEncripted vector de inicializacion encriptado
//     * @return
//     */
//
//    public static String encode256(String data, String key, byte[] ivEncripted) throws java.io.UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
//        byte[] textBytes = data.getBytes("UTF-8");
//
//        Random rand = new SecureRandom();
//        rand.nextBytes(iv);
//
//        AlgorithmParameterSpec ivSpec = new IvParameterSpec(ivEncripted);
//        SecretKey newKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
//        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
//        cipher.init(Cipher.ENCRYPT_MODE, newKey, ivSpec);
//        return Base64.encodeBase64String(cipher.doFinal(textBytes));
//    }

}
