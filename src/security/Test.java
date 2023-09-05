package security;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) throws Exception{

        Map<String, Object> keyPair = createKeyPair();
        String publicKey = (String) keyPair.get("publicKey");
        String privateKey = (String) keyPair.get("privateKey");

        String encryptText = encrypt("이거시자바다", publicKey);
        decrypt(encryptText, privateKey);


    }

    /**
     * 공개키, 비밀키 생성
     */
    private static Map<String,Object> createKeyPair() throws NoSuchAlgorithmException {

        LinkedHashMap<String, Object> keyMap = new LinkedHashMap<>();


        SecureRandom secureRandom = new SecureRandom();
        System.out.println("secureRandom = " + secureRandom);

        // KeyPairGenerator > Delegate
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

        keyPairGenerator.initialize(2048, secureRandom);

        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // RSAPublicKeyImpl
        PublicKey publicKey = keyPair.getPublic();

        // RSAPrivateCrtKeyImpl
        PrivateKey privateKey = keyPair.getPrivate();

        System.out.println();
        System.out.println("publicKey = " + publicKey);
        System.out.println();
        System.out.println("privateKey = " + privateKey);
        System.out.println();


        String stringPublicKey = Base64.getEncoder().encodeToString(publicKey.getEncoded());
        String stringPrivateKey = Base64.getEncoder().encodeToString(privateKey.getEncoded());

//        System.out.println("stringPublicKey = " + stringPublicKey);
//        System.out.println("stringPrivateKey = " + stringPrivateKey);


        keyMap.put("publicKey", stringPublicKey);
        keyMap.put("privateKey", stringPrivateKey);

//        System.out.println();
//        System.out.println("keyMap = " + keyMap);
//        System.out.println();

        return keyMap;
    }


    /**
     * 사용자가 공개키로 암호화
     */
    public static String encrypt(String plainText, String stringPublicKey) throws Exception {

        // 키 팩토리가 공개키, 개인키를 생성을 담당한다
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] bytePublicKey = Base64.getDecoder().decode(stringPublicKey.getBytes());

        // 공개키 : X509EncodedKeySpec 사용
        X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(bytePublicKey);
        PublicKey publicKey = keyFactory.generatePublic(publicKeySpec);


        // 암호화 연산 객체 (암호화, 복호화 바이트 생성을 담당한다)
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        String encrytedText = Base64.getEncoder().encodeToString(encryptedBytes);

        return encrytedText;


    }

    /**
     * 복호화
     */
    public static String decrypt(String encryptedText, String stringPrivateKey) throws Exception {

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] bytePrivateKey = Base64.getDecoder().decode(stringPrivateKey.getBytes());

        // 개인키: PKCS8EncodedKeySpec 사용
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(bytePrivateKey);

        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);

        // 암호화 연산 객체
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        // 평문화
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedText.getBytes());
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

        String decryptedText = new String(decryptedBytes);
        System.out.println("decryptedText = " + decryptedText);
        return decryptedText;



    }
}


/**
 * EncodedKeySpec 의 구현체로
 * 공개키 : X509EncodedKeySpec
 * 개인키 : PKCS8EncodedKeySpec
 */