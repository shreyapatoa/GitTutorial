import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Encoding {

	public static void main(String[] args) {
		String password = "P@sswOrd";
		Encoder encoder = Base64.getEncoder();
		String encoded = encoder.encodeToString(password.getBytes());
		System.out.println(encoded);
		Decoder decoder = Base64.getDecoder();
		String decoded = new String(decoder.decode(encoded));
		System.out.println(decoded);
	}

}
