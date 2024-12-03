import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Document {
    private static SecretKey generateKey() throws Exception{
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        return keyGen.generateKey();
    }

    public static String encrypt(String plainText, SecretKey key) throws Exception{
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cryptoBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(cryptoBytes);
    }

    public static String decrypt(String encryptedText, SecretKey key) throws Exception{
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptoBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptoBytes);
    }

    public String newDocument(String message) {
        StringBuilder sb = new StringBuilder();
        try {
            SecretKey key = generateKey();
            String encryptedMessage = encrypt(message, key);
            sb.append("Encrypted string:" + encryptedMessage).append("\n");
            String decryptedMessage = decrypt(encryptedMessage, key);
            sb.append("Decrypted string:" + "\n"+ decryptedMessage);
        } catch (Exception e) {
            System.out.println(e);
        }

        return sb.toString();
    }
}
