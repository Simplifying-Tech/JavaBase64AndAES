import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class JavaBase64 {
     
    public static void main(String[] args) {
        Encoder encoder = Base64.getEncoder();
        String originalString = "YOUR_SECRETE_KEY";
        String encodedString = encoder.encodeToString(originalString.getBytes());
 
        System.out.println("Encrypted Value :: " +encodedString);
        Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(encodedString);
                 
        System.out.println("Decrypted Value :: " +new String(bytes));
    }
 
}
